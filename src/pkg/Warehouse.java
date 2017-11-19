package pkg;

import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse {
    private String warehouseListName;
    private String name;
    private ArrayList<ItemList> partList;
    private HashMap<String, Warehouse> warehouseList = new HashMap<>();

    public String getWarehouseListName() {
        return warehouseListName;
    }

    public void setWarehouseListName(String warehouseListName) {
        this.warehouseListName = warehouseListName;
    }
    
    public Warehouse(String whName, ArrayList<ItemList> partList) {
        this.warehouseListName = whName;
        this.partList = partList;
    }
    
    //Double check and see if this is what we want or am I being stupid!
    //Thouhgt process if warehouseName is in the warehouse list return that warehouses itemlist
     public ArrayList<ItemList> getWarehouseList(String warehouseName){
        for(int i=0;i<warehouseList.size();i++){
            if(warehouseName.equals(warehouseList.get(i).getName())){
                return warehouseList.get(i).getPartList();
            }
        }
        return null;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ItemList> getPartList() {
        return partList;
    }

    public void setPartList(ArrayList<ItemList> partList) {
        this.partList = partList;
    }

    public void buildNewList(ArrayList<ItemList> list) {
        this.partList.equals(list);
    }

    public void appendPartList(ArrayList<ItemList> list) {
        for (int i = 0; i < list.size(); i++) {
            partList.add(list.get(i));
        }
    }

    public void wipeList() {
        partList.clear();
    }
}
