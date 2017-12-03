package pkg;

import java.util.HashMap;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * Manages a list of warehouses.
 */
class WarehouseList {
	private HashMap<String, Warehouse> WHash = new HashMap<>();

	/**
	 * @return
	 */
	public HashMap<String, Warehouse> getWHash() {
		return WHash;
	}

	/**
	 * @param WHash
	 */
	public void setWHash(HashMap<String, Warehouse> WHash) {
		this.WHash = WHash;
	}

	/**
	 * @param name
	 * @return
	 */
	public Warehouse getWarehouse(String name) {
		return WHash.get(name);
	}

	/**
	 * @param w
	 */
	public void addWarehouse(Warehouse w) {
		String name = w.getWhName();
		WHash.put(name, w);
	}

	/**
	 * 
	 */
	public WarehouseList() {

	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		return this.WHash.isEmpty();
	}

	/**
	 * @param WHash
	 */
	public void appendWHash(HashMap<String, Warehouse> WHash) {
		this.WHash.putAll(WHash);
	}

}
