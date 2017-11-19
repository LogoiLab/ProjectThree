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
 *
 * @author cvasquez13
 */
public class SalesInvoice{
    Date saleDate;
    String customer;
    ItemList itemList;
    double invoiceTotal;
    String bundleName;

    public SalesInvoice(Account seller, String customer, ItemList list){
        this.saleDate = new Date();
        this.customer = customer;
        this.itemList = list;
        this.invoiceTotal = 0;
    }
    
    public Date saleDate(){
        return saleDate;
    }
    
    public String toString() {
        return "Invoice: " + customer + "Date: " + saleDate + "\n";
    }
}
