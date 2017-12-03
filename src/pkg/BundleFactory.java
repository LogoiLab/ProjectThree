package pkg;

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
	 * @return
	 */
	public static synchronized BundleFactory getInstance() {
		return instance;
	}

	/**
	 * @param bundleName
	 * @return
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
	 * @return
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