/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author cvasquez13
 */
public class SalesInvoice {
    private Date saleDate;
    private String customer;
    private ItemList itemList;
    private double invoiceTotal;

    public SalesInvoice(Account seller, String customer, ItemList list, double total) {
        this.saleDate = new Date();
        this.customer = customer;
        this.itemList = list;
        this.invoiceTotal = total;
    }

    public Date saleDate() {
        return saleDate;
    }

    public ItemList getItemList() {
        return this.itemList;
    }

    public String toString() {
        return "Invoice: " + customer + "Date: " + saleDate + "\n";
    }
    
    
}
