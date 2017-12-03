package pkg;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description Employee creation and deletion, password/username storage
 */

class Employee extends Account {

	private static int PERM_LEVEL = 1;
	private static double com = 0.15;

	/**
	 * @param userName
	 * @param password
	 */
	public Employee(String userName, String password) {
		super.userName = userName;
		super.passSalt = Hasher.generateSalt();
		super.passHash = Hasher.hashPassword(password.toCharArray(), super.passSalt, 32, 512);
	}

	/**
	 * @return commission total
	 */
	public double getCommission() {
		return this.com;
	}

	/**
	 * @param com
	 */
	public void setCommission(double com) {
		this.com = com;
	}

}
