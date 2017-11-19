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
    ArrayList<Item> currList = new ArrayList<Item>();
    currList.add(new Item(WarehouseFactory.getInstance().getWarehouse("MainWarehouse")))
    return new SalesInvoice(account, customer, new ItemList(currList));
  }
}