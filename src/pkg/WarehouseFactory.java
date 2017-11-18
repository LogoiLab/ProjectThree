package pkg;

public class WarehouseFactory{
  private static final WarehouseFactory instance = new WarehouseFactory();

  //private constructor to avoid client applications to use constructor
  private WarehouseFactory(){}

  public static WarehouseFactory getInstance(){
    return instance;
  }
}