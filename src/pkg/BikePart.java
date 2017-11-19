package pkg;

import java.util.*;

class BikePart extends Item {
    private String partName;
    private long partNumber;
    private Double listPrice;
    private Double salePrice;
    private boolean onSale;
    private int quantity;

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public long getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(long partNumber) {
        this.partNumber = partNumber;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public BikePart getSelf() {
        return this;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        if (this.onSale) {
            return salePrice;
        } else
            return listPrice;
    }


    public BikePart(String name, long num, Double list, Double sale, boolean onSale, int quant) {
        this.partName = name;
        this.partNumber = num;
        this.listPrice = list;
        this.salePrice = sale;
        this.onSale = onSale;
        this.quantity = quant;
    }

    @Override
    public String toString() {
        return (this.partName + "," + this.partNumber + "," + this.listPrice + "," + this.salePrice + "," + this.isOnSale() + "," + this.quantity);
    }

    public static void printMePlz(ArrayList<BikePart> list) {
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            BikePart p = list.get(i);
            if (i == list.size()) {
                s = s + (p.getPartName() + p.getPartNumber()) + p.getListPrice() + p.getSalePrice() + p.isOnSale() + p.getQuantity();
            } else {
                s = s + (p.getPartName() + p.getPartNumber()) + p.getListPrice() + p.getSalePrice() + p.isOnSale() + p.getQuantity() + "\n";
                OutputBuffer.getInstance().add(s);
            }
        }
    }

    public boolean increment() {
        int temp = this.getQuantity();
        if (temp++ > Integer.MAX_VALUE) {
            return false;
        } else
            this.quantity++;
        return true;
    }

    public boolean decrement() {
        int temp = this.getQuantity();
        if (temp-- > 0) {
            this.quantity--;
            return true;
        } else
            return false;
    }

    public boolean increment(int num) {
        int temp = this.getQuantity();
        if (temp + num > Integer.MAX_VALUE) {
            return false;
        } else
            this.setQuantity(this.quantity + num);
        return true;
    }

    public boolean decrement(int num) {
        int temp = this.quantity;
        if (temp - num > 0) {
            this.setQuantity(this.getQuantity() - num);
            return true;
        } else
            return false;
    }

}
