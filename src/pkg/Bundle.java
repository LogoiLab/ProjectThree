package pkg;

class Bundle {
	private String bundleName;
	private ItemList items;

	/**
	 * @return
	 */
	public String getBundleName() {
		return bundleName;
	}

	/**
	 * @param bundleName
	 */
	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}

	/**
	 * @return
	 */
	public ItemList getItems() {
		return items;
	}

	/**
	 * @param items
	 */
	public void setItems(ItemList items) {
		this.items = items;
	}

	/**
	 * @param name
	 * @param list
	 */
	public Bundle(String name, ItemList list) {
		this.bundleName.equals(name);
		this.items = list;
	}

}
