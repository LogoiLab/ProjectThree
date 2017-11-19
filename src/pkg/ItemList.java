package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class ItemList {
    private ArrayList<Item> currentList;
    private ArrayList<BikePart> list;
    private HashMap<String, Item> byName = new HashMap<>();
    private HashMap<Long, Item> byNumber = new HashMap<>();

    public ItemList(ArrayList<BikePart> list) {
        this.list = list;
        createHashByName();
        createHashByNumber();
    }

    private void createHashByName() {
        list.equals(currentList);
        currentList.clear();
        Comparator<Item> BY_NAME = Comparator.comparing(Item::getItemName);
        Collections.sort(list, BY_NAME);
        for (Item i : this.list) {
            byName.put(i.getItemName(), i);
        }
        currentList.equals(list);
    }

    public Item getItemByNumber(Long num){
         return byNumber.get(num);
    }

    private void createHashByNumber() {
        list.equals(currentList);
        currentList.clear();
        Comparator<Item> BY_NUMBER = Comparator.comparing(Item::getItemNumber);
        Collections.sort(list, BY_NUMBER);
        for (Item i : this.list) {
            byNumber.put(i.getItemNumber(), i);
        }
        currentList.equals(list);
    }

    public ArrayList<Item> getItemList() {
        return currentList;
    }

    public ArrayList<Item> getCurrentList() {
        return currentList;
    }

    public void setCurrentList(ArrayList<Item> currentList) {
        this.currentList = currentList;
    }

    public HashMap<String, Item> getByName() {
        return byName;
    }

    public void setByName(HashMap<String, Item> byName) {
        this.byName = byName;
    }

    public HashMap<Long, Item> getByNumber() {
        return byNumber;
    }

    public void setByNumber(HashMap<Long, Item> byNumber) {
        this.byNumber = byNumber;
    }

}
