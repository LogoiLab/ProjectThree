package pkg;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description Coagulates bundles
 */

class BundleList {
	private String bundleListName;
	private HashMap<String, Bundle> bundleList = new HashMap<>();

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
	 * @param name
	 * @param map
	 */
	public BundleList(String name, HashMap<String, Bundle> map) {
		this.bundleListName = name;
		this.bundleList = map;
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

}
