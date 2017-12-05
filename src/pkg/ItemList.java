package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description coagulates Items into and ItemList
 */

class ItemList {
  private ArrayList<BikePart> currentList = new ArrayList<>();
  private ArrayList<BikePart> list = new ArrayList<>();
  private HashMap<String, BikePart> byName = new HashMap<>();
  private HashMap<Long, BikePart> byNumber = new HashMap<>();
  private HashMap<Integer, BikePart> byQuantity = new HashMap<>();
  private HashMap<Integer, BikePart> lowQuantity = new HashMap<>();

  /**
   * @param list
   */
  public ItemList(ArrayList<BikePart> list) {
    this.list = list;
    createHashByName();
    createHashByNumber();
    this.currentList = list;
  }

  /**
   *
   */
  private void createHashByName() {
    list.equals(currentList);
    //currentList.clear();
    Comparator<BikePart> BY_NAME = Comparator.comparing(BikePart::getPartName);
    Collections.sort(list, BY_NAME);
    for (BikePart i : this.list) {
      byName.put(i.getPartName(), i);
    }
    currentList.equals(list);
    BikePart.printMePlz(currentList);
  }

  /**
   * @param num
   * @return BikePart that matches the partNumber
   */
  public BikePart getPartByNumber(Long num) {
    return byNumber.get(num);
  }

  /**
   *
   */
  private void createHashByNumber() {
    list.equals(currentList);
    currentList.clear();
    Comparator<BikePart> BY_NUMBER = Comparator.comparing(BikePart::getPartNumber);
    Collections.sort(list, BY_NUMBER);
    for (BikePart i : this.list) {
      byNumber.put(i.getPartNumber(), i);
    }
    currentList.equals(list);
    BikePart.printMePlz(currentList);
  }

  /**
   * @param num
   * @return
   */
  public BikePart getByNumber(long num) {
    return byNumber.get(num);
  }

  /**
   * @param name
   * @return BikePart that matches the partName
   */
  public BikePart getByName(String name) {
    return byName.get(name);
  }

  // Display by Quantity

  /**
   * @param quan
   * @return BikePart that matches the quantity
   */
  public BikePart getByQuantity(Integer quan) {
    return byQuantity.get(quan);
  }

  /**
   *
   */
  private void createHashByQuantity() {
    list.equals(currentList);
    currentList.clear();
    Comparator<BikePart> BY_QUANT = Comparator.comparing(BikePart::getQuantity);
    Collections.sort(list, BY_QUANT);
    for (BikePart i : this.list) {
      byQuantity.put(i.getQuantity(), i);
    }
    currentList.equals(list);
    BikePart.printMePlz(currentList);
  }

  /**
   * @param LowQuantity
   * @param list
   * @return HashMap matching a BikePart by the lower bound of its quantity
   */
  private HashMap lowQuantityProduct(Integer LowQuantity, HashMap<Integer, BikePart> list) {
    HashMap<Integer, BikePart> x = new HashMap();
    for (Integer key : list.keySet()) {
      if (list.get(key).getQuantity() >= LowQuantity) {
        x.put(key, list.get(key));
      }
    }
    return x;
  }

	/*
   * Something like this may be suitable for us in the controller to let user
	 * select lowest applicable quantity private void itemsUnderMinimum() { String
	 * temp = JOptionPane.showInputDialog(null, "enter the lowest Quantity"); String
	 * temppro = obj.lowQuantityProduct(temp); if (temppro == null) {
	 * JOptionPane.showMessageDialog(null, "the inventory is fully stocked",
	 * "Error", INFO_MESSAGE); } else { JOptionPane(temppro, new
	 * Product().getListHeader(), new Product().getTitle()).setVisible(true); } }
	 */

  /**
   * @return sorted ArrayList of BikeParts
   */
  public ArrayList<BikePart> sortByName() {
    return new ArrayList<BikePart>(byName.values());
  }

  /**
   * @return sorted ArrayList of BikeParts
   */
  public ArrayList<BikePart> sortByNumber() {
    return new ArrayList<BikePart>(byNumber.values());
  }

  /**
   * @return ArrayList of BikeParts
   */
  public ArrayList<BikePart> getBikePartList() {
    return list;
  }

  /**
   * @return current Arrayist of BikeParts
   */
  public ArrayList<BikePart> getCurrentList() {
    return currentList;
  }

  /**
   * @param currentList
   */
  public void setCurrentList(ArrayList<BikePart> currentList) {
    this.currentList = currentList;
  }

  /**
   * @param p
   */
  public void addPart(BikePart p) {
    byNumber.put(p.getPartNumber(), p);
    byName.put(p.getPartName(), p);
    currentList.add(p);
  }

  public void addPart(String partNum, String quantity){

  }

  /**
   * @param p
   */
  public void removePart(BikePart p) {
    byName.remove(p);
    byNumber.remove(p);
    currentList.remove(p);
  }

  public Double getTotal() {
    Double tot = 0.0;
    for (BikePart i : currentList) {
      tot += i.getPrice();
    }
    return tot;
  }

}
