package pkg;

public class WarehouseFactory {
    private static final WarehouseFactory instance = new WarehouseFactory();
    private WarehouseList warehouseList;

    //private constructor to avoid client applications to use constructor
    private WarehouseFactory() {
    }

    public static synchronized WarehouseFactory getInstance() {
        return instance;
    }

    public Warehouse getWarehouse(String name) {
        return warehouseList.getWarehouse(name);
    }

    public void createWarehouse(String name, boolean isVan, ItemList list) {
        if (isVan) {
            warehouseList.addWarehouse(new Van(name, list));
        } else {
            warehouseList.addWarehouse(new Warehouse(name, list));
        }

    }

    public void moveParts(String wh1, String wh2, Long partnum, int quantity) {
        if (warehouseList.getWarehouse(wh1).getiList().getPartByNumber(partnum).decrement(quantity)) {
            if (warehouseList.getWarehouse(wh2).getiList().getPartByNumber(partnum).increment(quantity)) {
                OutputBuffer.getInstance().add("Parts moved successfully.");
            } else {
                warehouseList.getWarehouse(wh1).getiList().getPartByNumber(partnum).increment(quantity);
                OutputBuffer.getInstance().add("Failed to move parts.");
            }
        } else {
            OutputBuffer.getInstance().add("Failed to move parts.");
        }
    }
}