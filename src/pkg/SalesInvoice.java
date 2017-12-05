/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.Date;
import java.util.HashMap;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * An invoice model.
 */
public class SalesInvoice {
  private Date saleDate;
  private ItemList itemList;
  private Double invoiceTotal;
  private Double commission;
  private BundleList bundleList=new BundleList("",new HashMap<String,Bundle>());
  private Double buntot;

  /**
   * @param seller
   * @param list
   * @param total
   */
  public SalesInvoice(Account seller, ItemList list, Double total, BundleList bundle) {
    this.saleDate = new Date();
    this.itemList = list;
    this.invoiceTotal = total;
    this.bundleList = bundle;
  }

  public SalesInvoice(Account seller, ItemList list, Double total) {
    this.saleDate = new Date();
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
    s = s + ("Invoice: " + "\n" + "Date: " + saleDate + "\n");
    for (int i = 0; i < getItemList().getCurrentList().size(); i++) {
      s = s + getItemList().getCurrentList().get(i).toString() + "\n";
    }
    if (!this.bundleList.isEmpty()) {
      for (Bundle b : this.bundleList.getAsAL()) {
        s = s + b.getBundleName() + ": " + b.getItems().getTotal() + "\n";
      }
      OutputBuffer.getInstance().add("Commission Value: $" + this.commission * buntot);
      return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + s + "\n\n" + "Invoice total: " + invoiceTotal + "                Commission for sale: " + (this.commission * invoiceTotal);
    }else{
      return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + s + "\n\n" + "Invoice total: " + invoiceTotal;
    }

  }

  public Double getInvoiceTotal() {
    Double tot = 0.0;
    this.buntot = 0.0;
    tot += this.itemList.getTotal();
    for (BikePart b : this.itemList.getCurrentList()) {
      b.decrement();
    }
    for (Bundle b : this.bundleList.getAsAL()) {
      tot += b.getItems().getTotal();
      this.buntot += b.getItems().getTotal();
      for (BikePart i : b.getItems().getCurrentList()) {
        i.decrement();
      }
    }
    return tot;
  }

  public void setCommission(Double commission) {
    this.commission = commission;
  }

}
