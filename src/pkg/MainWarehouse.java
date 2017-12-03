package pkg;

import java.util.ArrayList;

class MainWarehouse extends Warehouse {
	private final String name = "MainWarehouse";
	private ItemList partList;

	/**
	 * @param list
	 */
	public MainWarehouse(ItemList list) {
		this.partList.equals(list);
	}

	/**
	 * @return
	 */
	public ItemList getParts() {
		return partList;
	}

}
