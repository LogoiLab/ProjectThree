package pkg;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description Handles Items, which are printed on invoices
 */

class Item {
	private String itemName;
	private long itemNumber;

	/**
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return itemNumber
	 */
	public long getItemNumber() {
		return itemNumber;
	}

	/**
	 * @param itemNumber
	 */
	public void setItemNumber(long itemNumber) {
		this.itemNumber = itemNumber;
	}

	/**
	 * 
	 */
	public Item() {

	}

	/**
	 * @param name
	 * @param num
	 */
	public Item(String name, long num) {
		this.itemName = name;
		this.itemNumber = num;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return null;
	}
}
