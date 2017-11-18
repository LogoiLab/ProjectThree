package pkg;

class Bundle {
	private String bundleName;
	private ItemList items;

	public String getBundleName() {
		return bundleName;
	}

	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}

	public ItemList getItems() {
		return items;
	}

	public void setItems(ItemList items) {
		this.items = items;
	}

	public Bundle(String name,ItemList list) {
		this.bundleName.equals(name);
		this.items=list;
	}

}
