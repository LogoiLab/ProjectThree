package pkg;

import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse {
	private String name;
	private ItemList iList;

	/**
	 * 
	 */
	public Warehouse() {

	}

	/**
	 * @param whName
	 * @param partList
	 */
	public Warehouse(String whName, ItemList partList) {
		this.name = whName;
		this.iList = partList;
	}

	/**
	 * @return
	 */
	public String getWhName() {
		return name;
	}

	/**
	 * @param warehouseListName
	 */
	public void setWhName(String warehouseListName) {
		this.name = warehouseListName;
	}

	/**
	 * @return
	 */
	public ItemList getiList() {
		return iList;
	}

	/**
	 * @param iList
	 */
	public void setiList(ItemList iList) {
		this.iList = iList;
	}

}