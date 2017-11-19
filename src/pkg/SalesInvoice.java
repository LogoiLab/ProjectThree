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
    List<BundleList> bundleList;
    String receiver;
    double invoiceTotal;
    String bundleName;
    int i;
    String Name;
    
    public SalesInvoice(Date saleDate, String customer){
        if(saleDate == null){
            this.saleDate = new Date();
        }else{
            this.saleDate = saleDate;
        }
        this.customer = customer;
        this.bundleList = new ArrayList<>();
        this.invoiceTotal = 0;
    }
    
    public void addInvoice(BundleList bl) {
     bundleList.add(bl);
     bundleName = bl.getBundleListName();
            
    // invoiceTotal += Double.parseDouble(bl.getBundleListName());
    //need an easier way to get to partname then saleprice of part
    }
    
    public void addReceiver(String name){
        receiver = name;
    }
    
    public Date saleDate(){
        return saleDate;
    }
    
    public String toString() {
        String employee = "Invoice: " + customer + "Date: " + saleDate + "\n";
        for(BundleList bl: bundleList)
            employee += bl.toString();
        employee += invoiceTotal;
        return employee;
    }
}
