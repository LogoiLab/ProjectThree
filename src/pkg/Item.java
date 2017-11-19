package pkg;

class Item {
    private String itemName;
    private long itemNumber;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public long getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Item() {

    }

    public Item(String name, long num) {
        this.itemName = name;
        this.itemNumber = num;
    }

    public String toString(){
        return null;
    }
}
