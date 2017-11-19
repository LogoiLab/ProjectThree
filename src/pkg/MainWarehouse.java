package pkg;

import java.util.ArrayList;

class MainWarehouse extends Warehouse {
	private final String name="MainWarehouse";
	private ArrayList<ItemList> partList;

	public MainWarehouse(ArrayList<ItemList> list) {
		this.partList.equals(list);
	}

	public ArrayList<ItemList> getParts(){
		return partList;
	}

}
