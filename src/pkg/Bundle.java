package pkg;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description coagulates ItemList objects
 */

class Bundle {
  private String bundleName;
  private ItemList items;
  private Double total;

  /**
   * @param name
   * @param list
   */
  public Bundle(String name, ItemList list, Double tot) {
    this.bundleName.equals(name);
    this.items = list;
    this.total = tot;
  }

  /**
   * @return bundleName
   */
  public String getBundleName() {
    return bundleName;
  }

  /**
   * @param bundleName
   */
  public void setBundleName(String bundleName) {
    this.bundleName = bundleName;
  }

  /**
   * @return items in the itemlist
   */
  public ItemList getItems() {
    return items;
  }

  /**
   * @param items
   */
  public void setItems(ItemList items) {
    this.items = items;
  }

}
