package pkg;

import java.util.ArrayList;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description singleton instance of an invoiceList that contains all invoices
 */

public class InvoiceFactory {
  private static final InvoiceFactory instance = new InvoiceFactory();
  private static SalesInvoice currentInvoice;

  // private constructor to avoid client applications to use constructor

  /**
   *
   */
  private InvoiceFactory() {
  }

  /**
   * @return invoice instance
   */
  public static synchronized InvoiceFactory getInstance() {
    return instance;
  }

  public SalesInvoice getCurrentInvoice() {
    return currentInvoice;
  }

  /**
   * @param account
   * @param invoiceParts
   * @return SalesInvoice
   */
  public SalesInvoice createInvoice(Account account, ArrayList<String> invoiceParts) {
    ArrayList<BikePart> currList = new ArrayList<BikePart>();
    double total = 0.0;
    for (String invprt : invoiceParts) {
      BikePart part = WarehouseFactory.getInstance().getWarehouse("mainWarehouse").getiList()
              .getPartByNumber(Long.parseLong(invprt.split(";")[0]));
      total += part.getPrice();
      BikePart temp = new BikePart(part.getPartName(), part.getPartNumber(), part.getListPrice(),
              part.getSalePrice(), part.isOnSale(), Integer.parseInt(invprt.split(";")[1]));
      currList.add(temp);
    }
    currentInvoice = new SalesInvoice(account, new ItemList(currList), total);
    return currentInvoice;
  }
}