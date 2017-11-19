package pkg;

import java.util.ArrayList;

public class Van {
 
    private String name;
    private ArrayList<ItemList> partList;

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
