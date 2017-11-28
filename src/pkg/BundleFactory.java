package pkg;

public class BundleFactory {
    private static final BundleFactory instance = new BundleFactory();
    private static BundleList bundles;

    //private constructor to avoid client applications to use constructor
    private BundleFactory() {
    }

    public static synchronized BundleFactory getInstance() {
        return instance;
    }

    public ItemList getBundle(String bundleName) {
        return bundles.getBundledItems(bundleName);
    }

    public void newBundle(String name, ItemList list) {
        bundles.addBundle(new Bundle(name, list));
    }

    public BundleList getBundleList() {
        return bundles;
    }

    public void populate(BundleList bl) {
        if(bundles.isEmpty()) {
            bundles = bl;
        } else {
            bundles.appendBundleList(bl.getBundleListName(), bl.getBundleList());
        }
    }
}