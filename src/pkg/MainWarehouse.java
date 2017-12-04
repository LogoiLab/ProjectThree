package pkg;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * The default warehouse for the main part lists.
 */
class MainWarehouse extends Warehouse {
  private final String name = "MainWarehouse";
  private ItemList partList;

  /**
   * @param list
   */
  public MainWarehouse(ItemList list) {
    this.partList.equals(list);
  }

  /**
   * @return
   */
  public ItemList getParts() {
    return partList;
  }

}
