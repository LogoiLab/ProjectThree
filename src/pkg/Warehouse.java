package pkg;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * Stores information regarding a Warehouse
 */
public class Warehouse {
  private String name;
  private ItemList iList;
  private int minStock;

  /**
   *
   */
  public Warehouse() {

  }

  /**
   * @param whName
   * @param partList
   */
  public Warehouse(String whName, ItemList partList) {
    this.name = whName;
    this.iList = partList;
  }

  /**
   * @return minStock
   */
  public int getMinStock() {
    return minStock;
  }

  /**
   * @param minStock
   */
  public void setMinStock(int minStock) {
    this.minStock = minStock;
  }

  /**
   * @return
   */
  public String getWhName() {
    return name;
  }

  /**
   * @param warehouseListName
   */
  public void setWhName(String warehouseListName) {
    this.name = warehouseListName;
  }

  /**
   * @return
   */
  public ItemList getiList() {
    return iList;
  }

  /**
   * @param iList
   */
  public void setiList(ItemList iList) {
    this.iList = iList;
  }

}