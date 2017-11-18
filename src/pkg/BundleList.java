package pkg;

import java.util.HashMap;

class BundleList {
    private String bundleListName;
    private HashMap<String, Bundle> bundleList = new HashMap<>();

    public String getBundleListName() {
        return bundleListName;
    }

    public void setBundleListName(String bundleListName) {
        this.bundleListName = bundleListName;
    }


    public BundleList(String name, HashMap<String, Bundle> map) {
        this.bundleListName = name;
        this.bundleList = map;
    }

}
