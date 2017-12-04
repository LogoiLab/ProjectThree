package pkg;

import java.util.ArrayList;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description constructor class for Bikeparts
 */

class BikePart extends Item {
  private String partName;
  private long partNumber;
  private Double listPrice;
  private Double salePrice;
  private boolean onSale;
  private int quantity;

  /**
   * @param name
   * @param num
   * @param list
   * @param sale
   * @param onSale
   * @param quant
   */
  public BikePart(String name, long num, Double list, Double sale, boolean onSale, int quant) {
    this.partName = name;
    this.partNumber = num;
    this.listPrice = list;
    this.salePrice = sale;
    this.onSale = onSale;
    this.quantity = quant;
  }

  /**
   * @param list
   */
  public static void printMePlz(ArrayList<BikePart> list) {
    String s = "";
    for (int i = 0; i < list.size(); i++) {
      BikePart p = list.get(i);
      if (i == list.size()) {
        s = s + (p.getPartName() + p.getPartNumber()) + p.getListPrice() + p.getSalePrice() + p.isOnSale()
                + p.getQuantity();
        OutputBuffer.getInstance().add(s);
      } else {
        s = s + (p.getPartName() + p.getPartNumber()) + p.getListPrice() + p.getSalePrice() + p.isOnSale()
                + p.getQuantity() + "\n";
        OutputBuffer.getInstance().add(s);
      }
    }
  }

  /**
   * @return partName
   */
  public String getPartName() {
    return partName;
  }

  /**
   * @param partName
   */
  public void setPartName(String partName) {
    this.partName = partName;
  }

  /**
   * @return partNumber
   */
  public long getPartNumber() {
    return partNumber;
  }

  /**
   * @param partNumber
   */
  public void setPartNumber(long partNumber) {
    this.partNumber = partNumber;
  }

  /**
   * @return listPrice
   */
  public Double getListPrice() {
    return listPrice;
  }

  /**
   * @param listPrice
   */
  public void setListPrice(Double listPrice) {
    this.listPrice = listPrice;
  }

  /**
   * @return salePrice
   */
  public Double getSalePrice() {
    return salePrice;
  }

  /**
   * @param salePrice
   */
  public void setSalePrice(Double salePrice) {
    this.salePrice = salePrice;
  }

  /**
   * @return whole Bikepart object
   */
  public BikePart getSelf() {
    return this;
  }

  /**
   * @return onSale (true/false)
   */
  public boolean isOnSale() {
    return onSale;
  }

  /**
   * @param onSale
   */
  public void setOnSale(boolean onSale) {
    this.onSale = onSale;
  }

  /**
   * @return quantity
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * @param quantity
   */
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * @return cost of a part
   */
  public Double getPrice() {
    if (this.onSale) {
      return salePrice;
    } else
      return listPrice;
  }

  /* (non-Javadoc)
   * @see pkg.Item#toString()
   */
  @Override
  public String toString() {
    return (this.partName + "," + this.partNumber + "," + this.listPrice + "," + this.salePrice + ","
            + this.isOnSale() + "," + this.quantity);
  }

  /**
   * @return true/false whether the increment was successful
   */
  public boolean increment() {
    int temp = this.getQuantity();
    if (temp++ > Integer.MAX_VALUE) {
      return false;
    } else
      this.quantity++;
    return true;
  }

  /**
   * @return true/false whether the decrement was successful
   */
  public boolean decrement() {
    int temp = this.getQuantity();
    if (temp-- > 0) {
      this.quantity--;
      return true;
    } else
      return false;
  }

  /**
   * @param num
   * @return true/false whether the increment was successful
   */
  public boolean increment(int num) {
    int temp = this.getQuantity();
    if (temp + num > Integer.MAX_VALUE) {
      return false;
    } else
      this.setQuantity(this.quantity + num);
    return true;
  }

  /**
   * @param num
   * @return true/false whether the decrement was succesful
   */
  public boolean decrement(int num) {
    int temp = this.quantity;
    if (temp - num > 0) {
      this.setQuantity(this.getQuantity() - num);
      return true;
    } else
      return false;
  }

}
