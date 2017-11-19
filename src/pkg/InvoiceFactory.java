package pkg;

import java.util.ArrayList;

public class InvoiceFactory {
  private static final InvoiceFactory instance = new InvoiceFactory();

  //private constructor to avoid client applications to use constructor
  private InvoiceFactory() {
  }

  public static synchronized InvoiceFactory getInstance() {
    return instance;
  }

  public SalesInvoice createInvoice(Account account, String customer, ArrayList<String> invoiceParts) {
    ArrayList<BikePart> currList = new ArrayList<BikePart>();
    double total = 0.0;
    for (String temp: invoiceParts) {
      BikePart part = WarehouseFactory.getInstance().getWarehouse("MainWarehouse").getItemList().getPartByNumber(temp.split(";")[0]);
      total += part
      currList.add(part);
    }
    return new SalesInvoice(account, customer, new ItemList(currList));
  }
}