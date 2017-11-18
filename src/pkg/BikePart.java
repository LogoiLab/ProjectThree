package pkg;

class BikePart extends Item {
    private String partName;

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

    private long partNumber;
    private Double listPrice;
    private Double salePrice;
    private boolean onSale;
    private int quantity;

    public BikePart(String name, long num, Double list, Double sale, boolean onSale, int quant) {
        this.partName = name;
        this.partNumber = num;
        this.listPrice = list;
        this.salePrice = sale;
        this.onSale = onSale;
        this.quantity = quant;
    }

}
