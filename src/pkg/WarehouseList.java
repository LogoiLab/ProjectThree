package pkg;

import javafx.beans.binding.When;

import java.util.HashMap;

class WarehouseList {
    private HashMap<String, Warehouse> WHash = new HashMap<>();

    public HashMap<String, Warehouse> getWHash() {
        return WHash;
    }

    public void setWHash(HashMap<String, Warehouse> WHash) {
        this.WHash = WHash;
    }

    public Warehouse getWarehouse(String name) {
        return WHash.get(name);
    }

    public void addWarehouse(Warehouse w) {
        String name = w.getWhName();
        WHash.put(name, w);
    }

    public WarehouseList() {

    }

    public boolean isEmpty() {
        return this.WHash.isEmpty();
    }

    public void appendWHash(HashMap<String, Warehouse> WHash) {
        this.WHash.putAll(WHash);
    }

}

