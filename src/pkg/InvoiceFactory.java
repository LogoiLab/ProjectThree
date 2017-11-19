package pkg;

import java.util.ArrayList;

public class InvoiceFactory {
  private static final InvoiceFactory instance = new InvoiceFactory();
  private static SalesInvoice currentInvoice;

  //private constructor to avoid client applications to use constructor
  private InvoiceFactory() {
  }

  public static synchronized InvoiceFactory getInstance() {
    return instance;
  }

  public SalesInvoice createInvoice(Account account, String customer, ArrayList<String> invoiceParts) {
    ArrayList<BikePart> currList = new ArrayList<BikePart>();
    double total = 0.0;
    for (String invprt: invoiceParts) {
      BikePart part = WarehouseFactory.getInstance().getWarehouse("MainWarehouse").getiList().getPartByNumber(Long.parseLong(invprt.split(";")[0]));
      total += part.getPrice();
      BikePart temp = new BikePart(part.getPartName(), part.getPartNumber(), part.getListPrice(), part.getSalePrice(), part.isOnSale(), Integer.parseInt(invprt.split(";")[1]));
      currList.add(temp);
    }
    currentInvoice = new SalesInvoice(account, customer, new ItemList(currList), total);
    return currentInvoice;
  }

  public SalesInvoice removeFromInvoice(String part) {
    currentInvoice.getItemList().removePart(currentInvoice.getItemList().getPartByNumber(Long.parseLong(part.split(";")[0])));
    return currentInvoice;
  }

}