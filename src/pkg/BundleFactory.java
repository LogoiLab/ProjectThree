package pkg;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description singleton instance of a bundleList that handles the bundles
 */

public class BundleFactory {
	private static final BundleFactory instance = new BundleFactory();
	private static BundleList bundles;

	// private constructor to avoid client applications to use constructor
	/**
	 * 
	 */
	private BundleFactory() {
	}

	/**
	 * @return bundleFactory instance
	 */
	public static synchronized BundleFactory getInstance() {
		return instance;
	}

	/**
	 * @param bundleName
	 * @return ItemList
	 */
	public ItemList getBundle(String bundleName) {
		return bundles.getBundledItems(bundleName);
	}

	/**
	 * @param name
	 * @param list
	 */
	public void newBundle(String name, ItemList list) {
		bundles.addBundle(new Bundle(name, list));
	}

	/**
	 * @return bundles
	 */
	public BundleList getBundleList() {
		return bundles;
	}

	/**
	 * @param bl
	 */
	public void populate(BundleList bl) {
		if (bundles.isEmpty()) {
			bundles = bl;
		} else {
			bundles.appendBundleList(bl.getBundleListName(), bl.getBundleList());
		}
	}
}