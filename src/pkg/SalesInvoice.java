/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.Date;

/**
 *
 * @author cvasquez13
 */
public class SalesInvoice extends InvoiceFactory{
    Date saleDate;
    String customer;
    //List<part> parts
    String receiver;
    double invoiceTotal;
    
    public SalesInvoice(Date saleDate, String customer){
        if(saleDate == null){
            this.saleDate = new Date();
        }else{
            this.saleDate = saleDate;
        }
        this.customer = customer;
        //this.parts = new List<>;
        this.invoiceTotal = 0;
    }
    
   /** public void addInvoice(Whpart part) {
    * Whpart.add(part);
    * invoiceTotal += Double.parseDouble(part.getBp().getSp());
    }**/
    
    public void addReceiver(String name){
        receiver = name;
    }
    
    public Date saleDate(){
        return saleDate;
    }
    
    public String toString() {
        String saleAssociate = "Invoice: " + customer + "Date: " + saleDate + "\n";
        //for(Whpart part: parts)
        //    saleAssociate += part.toString();
        //saleAssociate += invoiceTotal;
        return saleAssociate;
    }
}
