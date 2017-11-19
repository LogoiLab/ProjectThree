package pkg;

public class InvoiceFactory {
  private static final InvoiceFactory instance = new InvoiceFactory();

  //private constructor to avoid client applications to use constructor
  private InvoiceFactory() {
  }

  public static synchronized InvoiceFactory getInstance() {
    return instance;
  }

  public SalesInvoice createInvoice(ArrayList<String> invoiceParts) {
    return new SalesInvoice()
  }
}