package pkg;

import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse {
    private String name;
    private ArrayList<ItemList> partList;
    private HashMap<String, Warehouse> warehouseList = new HashMap<>();

    public String getWarehouseListName() {
        return name;
    }

    public void setWarehouseListName(String warehouseListName) {
        this.name = warehouseListName;
    }
    
    public Warehouse(String whName, ArrayList<ItemList> partList) {
        this.name = whName;
        this.partList = partList;
    }

    public Warehouse(){}
    
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
