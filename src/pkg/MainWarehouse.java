package pkg;

import java.util.ArrayList;

class MainWarehouse extends Warehouse {
	private final String name="MainWarehouse";
	private ItemList partList;

	public MainWarehouse(ItemList list) {
		this.partList.equals(list);
	}

	public ItemList getParts(){
		return partList;
	}

}
