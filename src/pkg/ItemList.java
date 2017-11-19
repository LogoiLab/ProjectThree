package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class ItemList {
    private ArrayList<BikePart> currentList;
    private ArrayList<BikePart> list;
    private HashMap<String, BikePart> byName = new HashMap<>();
    private HashMap<Long, BikePart> byNumber = new HashMap<>();

    public ItemList(ArrayList<BikePart> list) {
        this.list = list;
        createHashByName();
        createHashByNumber();
    }

    private void createHashByName() {
        list.equals(currentList);
        currentList.clear();
        Comparator<BikePart> BY_NAME = Comparator.comparing(BikePart::getPartName);
        Collections.sort(list, BY_NAME);
        for (BikePart i : this.list) {
            byName.put(i.getPartName(), i);
        }
        currentList.equals(list);
    }

    public BikePart getPartByNumber(Long num){
         return byNumber.get(num);
    }

    private void createHashByNumber() {
        list.equals(currentList);
        currentList.clear();
        Comparator<BikePart> BY_NUMBER = Comparator.comparing(BikePart::getPartNumber);
        Collections.sort(list, BY_NUMBER);
        for (BikePart i : this.list) {
            byNumber.put(i.getPartNumber(), i);
        }
        currentList.equals(list);

    }

    public BikePart getByNumber(long num){
        return byNumber.get(num);
    }

    public BikePart getByName(String name){
        return byName.get(name);
    }

    public ArrayList<BikePart> getBikePartList() {
        return list;
    }

    public ArrayList<BikePart> getCurrentList() {
        return currentList;
    }

    public void setCurrentList(ArrayList<BikePart> currentList) {
        this.currentList = currentList;
    }

}
