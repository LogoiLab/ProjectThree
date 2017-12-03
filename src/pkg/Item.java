package pkg;

class Item {
	private String itemName;
	private long itemNumber;

	/**
	 * @return
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
	 * @return
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
