package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class ItemList {
    private ArrayList<Item> currentList;
    private ArrayList<Item> list;
    private HashMap<String, Item> byName = new HashMap<>();
    private HashMap<Long, Item> byNumber = new HashMap<>();

    public ItemList(ArrayList<Item> list) {
        this.list=list;
    }

    private void createHashByName(){
        list.equals(currentList);
        currentList.clear();
        Comparator<Item> BY_NAME = Comparator.comparing(Item::getItemName);
        Collections.sort(list, BY_NAME);
        for(Item i : this.list){
            byName.put(i.getItemName(),i);
        }
        currentList.equals(list);
    }

    private void createHashByNumber(){
        list.equals(currentList);
        currentList.clear();
        Comparator<Item> BY_NUMBER = Comparator.comparing(Item::getItemNumber);
        Collections.sort(list, BY_NUMBER);
        for(Item i : this.list){
            byNumber.put(i.getItemNumber(),i);
        }
        currentList.equals(list);
    }

    public ArrayList<Item> getItemList() {
        return currentList;
    }
}
