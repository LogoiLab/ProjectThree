package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description Coagulates bundles
 */

class BundleList {
  private String bundleListName;
  private HashMap<String, Bundle> bundleList = new HashMap<>();

  /**
   * @param name
   * @param map
   */
  public BundleList(String name, HashMap<String, Bundle> map) {
    this.bundleListName = name;
    this.bundleList = map;
  }

  /**
   * @return bundleList name (String)
   */
  public String getBundleListName() {
    return bundleListName;
  }

  /**
   * @param bundleListName
   */
  public void setBundleListName(String bundleListName) {
    this.bundleListName = bundleListName;
  }

  /**
   * @param b
   */
  public void addBundle(Bundle b) {
    bundleList.put(b.getBundleName(), b);
  }

  /**
   * @param bundleName
   * @return items from a bundle in a bundleList
   */
  public ItemList getBundledItems(String bundleName) {
    for (int i = 0; i < bundleList.size(); i++) {
      if (bundleName.equals(bundleList.get(i).getBundleName())) {
        return bundleList.get(i).getItems();
      }
    }
    return null;
  }

  /**
   * @return bundleList
   */
  public HashMap<String, Bundle> getBundleList() {
    return this.bundleList;
  }

  /**
   * @return true/false whether the bundleList is empty
   */
  public boolean isEmpty() {
    return this.bundleList.isEmpty();
  }

  /**
   * @param name
   * @param bl
   */
  public void appendBundleList(String name, HashMap<String, Bundle> bl) {
    this.setBundleListName(name);
    this.bundleList.putAll(bl);
  }

  public ArrayList<Bundle> getAsAL() {
    ArrayList<Bundle> list = new ArrayList<>();
    Comparator<Bundle> BY_NAME = Comparator.comparing(Bundle::getBundleName);
    Collections.sort(list, BY_NAME);
    return list;
  }

}
