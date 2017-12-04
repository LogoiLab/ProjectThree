/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.Date;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * An invoice model.
 */
public class SalesInvoice {
  private Date saleDate;
  private String customer;
  private ItemList itemList;
  private Double invoiceTotal;
  private Double commission;

  /**
   * @param seller
   * @param customer
   * @param list
   * @param total
   */
  public SalesInvoice(Account seller, String customer, ItemList list, Double total) {
    this.saleDate = new Date();
    this.customer = customer;
    this.itemList = list;
    this.invoiceTotal = total;
  }

  /**
   * @return date of sale
   */
  public Date saleDate() {
    return saleDate;
  }

  /**
   * @return itemList
   */
  public ItemList getItemList() {
    return this.itemList;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  public String toString() {
    String s = "";
    s = s + ("Invoice: " + customer + "Date: " + saleDate + "\n");
    for (int i = 0; i < getItemList().getCurrentList().size(); i++) {
      s = s + getItemList().getCurrentList().get(i).toString();
    }
    return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + s + "\n\n" + "Invoice total: " + invoiceTotal + "                Commission for sale: " + (this.commission * invoiceTotal);
  }

  public void setCommission(Double commission) {
    this.commission = commission;
  }

}
