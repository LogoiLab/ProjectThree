package pkg;

import java.util.ArrayList;
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

    public void addBundle(Bundle b){
        bundleList.put(b.getBundleName(),b);
    }


    public BundleList(String name, HashMap<String, Bundle> map) {
        this.bundleListName = name;
        this.bundleList = map;
    }

    public ItemList getBundledItems(String bundleName){
        for(int i=0;i<bundleList.size();i++){
            if(bundleName.equals(bundleList.get(i).getBundleName())){
                return bundleList.get(i).getItems();
            }
        }
        return null;
    }

}
