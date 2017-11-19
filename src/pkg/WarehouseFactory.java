package pkg;

public class WarehouseFactory {
  private static final WarehouseFactory instance = new WarehouseFactory();
  private WarehouseList warehouseList;

  //private constructor to avoid client applications to use constructor
  private WarehouseFactory() {
  }

  public static synchronized WarehouseFactory getInstance() {
    return instance;
  }

  public Warehouse getWarehouse(String name) {
    return warehouseList.getWarehouse(name);
  }

  public void addWarehouse(Warehouse wh) {
    warehouseList.addWarehouse(wh.getName(), wh);
  }

  public void createWarehouse(String name, boolean isVan, ItemList list) {
    if(isVan) {
      warehouseList.addWarehouse(name, new Van(name, list));
    } else {
      warehouseList.addWarehouse(name, new Warehouse(name, list));
    }

  }
}