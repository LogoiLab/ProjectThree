package pkg;

import java.util.HashMap;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * Manages a list of warehouses.
 */
class WarehouseList {
  private HashMap<String, Warehouse> WHash = new HashMap<>();

  /**
   *
   */
  public WarehouseList() {

  }

  /**
   * @return
   */
  public HashMap<String, Warehouse> getWHash() {
    return WHash;
  }

  /**
   * @param WHash
   */
  public void setWHash(HashMap<String, Warehouse> WHash) {
    this.WHash = WHash;
  }

  /**
   * @param name
   * @return
   */
  public Warehouse getWarehouse(String name) {
    return WHash.get(name);
  }

  /**
   * @param w
   */
  public void addWarehouse(Warehouse w) {
    WHash.put(w.getWhName(), w);
  }

  /**
   * @return
   */
  public boolean isEmpty() {
    return this.WHash.isEmpty();
  }

  /**
   * @param WHash
   */
  public void appendWHash(HashMap<String, Warehouse> WHash) {
    this.WHash.putAll(WHash);
  }

}
