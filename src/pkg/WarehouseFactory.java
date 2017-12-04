package pkg;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * Main warehouse factory insures warehouses are protected.
 */
public class WarehouseFactory {
  private static final WarehouseFactory instance = new WarehouseFactory();
  private WarehouseList warehouseList;

  // private constructor to avoid client applications to use constructor

  /**
   *
   */
  private WarehouseFactory() {
  }

  /**
   * @return
   */
  public static synchronized WarehouseFactory getInstance() {
    return instance;
  }

  /**
   * @param name
   * @return
   */
  public Warehouse getWarehouse(String name) {
    return warehouseList.getWarehouse(name);
  }

  /**
   * @return
   */
  public WarehouseList getWarehouseList() {
    return warehouseList;
  }

  /**
   * @param name
   * @param isVan
   * @param list
   */
  public void createWarehouse(String name, boolean isVan, ItemList list) {
    if (isVan) {
      warehouseList.addWarehouse(new Van(name, list));
    } else {
      warehouseList.addWarehouse(new Warehouse(name, list));
    }

  }

  /**
   * @param wh
   */
  public void addWarehouse(Warehouse wh) {
    warehouseList.addWarehouse(wh);
  }

  /**
   * @param wh1
   * @param wh2
   * @param partnum
   * @param quantity
   */
  public void moveParts(String wh1, String wh2, Long partnum, int quantity) {
    if (warehouseList.getWarehouse(wh1).getiList().getPartByNumber(partnum).decrement(quantity)) {
      if (warehouseList.getWarehouse(wh2).getiList().getPartByNumber(partnum).increment(quantity)) {
        OutputBuffer.getInstance().add("Parts moved successfully.");
      } else {
        warehouseList.getWarehouse(wh1).getiList().getPartByNumber(partnum).increment(quantity);
        OutputBuffer.getInstance().add("Failed to move parts.");
      }
    } else {
      OutputBuffer.getInstance().add("Failed to move parts.");
    }
  }

  /**
   * @param whList
   */
  public void populate(WarehouseList whList) {
    if (warehouseList.isEmpty()) {
      this.warehouseList.setWHash(whList.getWHash());
    } else {
      this.warehouseList.appendWHash(whList.getWHash());
    }
  }

}