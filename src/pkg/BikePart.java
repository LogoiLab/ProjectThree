package pkg;

import java.util.*;

class BikePart extends Item {
	private String partName;
	private long partNumber;
	private Double listPrice;
	private Double salePrice;
	private boolean onSale;
	private int quantity;
	private int percentOfTotal;

	/**
	 * @return
	 */
	public String getPartName() {
		return partName;
	}

	/**
	 * @param partName
	 */
	public void setPartName(String partName) {
		this.partName = partName;
	}

	/**
	 * @return
	 */
	public long getPartNumber() {
		return partNumber;
	}

	/**
	 * @param partNumber
	 */
	public void setPartNumber(long partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 * @return
	 */
	public Double getListPrice() {
		return listPrice;
	}

	/**
	 * @param listPrice
	 */
	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	/**
	 * @return
	 */
	public Double getSalePrice() {
		return salePrice;
	}

	/**
	 * @return
	 */
	public BikePart getSelf() {
		return this;
	}

	/**
	 * @param salePrice
	 */
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * @return
	 */
	public boolean isOnSale() {
		return onSale;
	}

	/**
	 * @param onSale
	 */
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}

	/**
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return
	 */
	public Double getPrice() {
		if (this.onSale) {
			return salePrice;
		} else
			return listPrice;
	}

	/**
	 * @param name
	 * @param num
	 * @param list
	 * @param sale
	 * @param onSale
	 * @param quant
	 */
	public BikePart(String name, long num, Double list, Double sale, boolean onSale, int quant) {
		this.partName = name;
		this.partNumber = num;
		this.listPrice = list;
		this.salePrice = sale;
		this.onSale = onSale;
		this.quantity = quant;
	}

	/* (non-Javadoc)
	 * @see pkg.Item#toString()
	 */
	@Override
	public String toString() {
		return (this.partName + "," + this.partNumber + "," + this.listPrice + "," + this.salePrice + ","
				+ this.isOnSale() + "," + this.quantity);
	}

	/**
	 * @param list
	 */
	public static void printMePlz(ArrayList<BikePart> list) {
		String s = "";
		for (int i = 0; i < list.size(); i++) {
			BikePart p = list.get(i);
			if (i == list.size()) {
				s = s + (p.getPartName() + p.getPartNumber()) + p.getListPrice() + p.getSalePrice() + p.isOnSale()
						+ p.getQuantity();
			} else {
				s = s + (p.getPartName() + p.getPartNumber()) + p.getListPrice() + p.getSalePrice() + p.isOnSale()
						+ p.getQuantity() + "\n";
				OutputBuffer.getInstance().add(s);
			}
		}
	}

	/**
	 * @return
	 */
	public boolean increment() {
		int temp = this.getQuantity();
		if (temp++ > Integer.MAX_VALUE) {
			return false;
		} else
			this.quantity++;
		return true;
	}

	/**
	 * @return
	 */
	public boolean decrement() {
		int temp = this.getQuantity();
		if (temp-- > 0) {
			this.quantity--;
			return true;
		} else
			return false;
	}

	/**
	 * @param num
	 * @return
	 */
	public boolean increment(int num) {
		int temp = this.getQuantity();
		if (temp + num > Integer.MAX_VALUE) {
			return false;
		} else
			this.setQuantity(this.quantity + num);
		return true;
	}

	/**
	 * @param num
	 * @return
	 */
	public boolean decrement(int num) {
		int temp = this.quantity;
		if (temp - num > 0) {
			this.setQuantity(this.getQuantity() - num);
			return true;
		} else
			return false;
	}

	// This is for commission
	/**
	 * 
	 * @return
	 */
	/**
	 * @param list
	 * @return
	 */
	public float calculateTotal(ArrayList<BikePart> list) {

		float temp = 0;
		for (int i = 0; i < list.size(); i++) {
			BikePart p = list.get(i);
			if (i == list.size()) {
				temp += p.getPrice() * p.quantity;
			} else {
				return 0;
			}
		}
		return temp * ((percentOfTotal / 100) + 1);
	}
}
