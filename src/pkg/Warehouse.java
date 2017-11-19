package pkg;

import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse {
    private String name;
    private ItemList iList;

    public Warehouse(String whName, ItemList partList) {
        this.name = whName;
        this.iList = partList;
    }

    public String getWhName() {
        return name;
    }

    public void setWhName(String warehouseListName) {
        this.name = warehouseListName;
    }

    public ItemList getiList() {
        return iList;
    }

    public void setiList(ItemList iList) {
        this.iList = iList;
    }
}