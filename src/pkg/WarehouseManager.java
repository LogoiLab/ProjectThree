package pkg;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * Sets account and permission level.
 */

class WarehouseManager extends Account {

	private static int PERM_LEVEL = 2;

	/**
	 * @param userName
	 * @param password
	 */
	public WarehouseManager(String userName, String password) {
		super.userName = userName;
		super.passSalt = Hasher.generateSalt();
		super.passHash = Hasher.hashPassword(password.toCharArray(), super.passSalt, 32, 512);
	}

	/**
	 * @return
	 */
	public int getPermLevel() {
		return this.PERM_LEVEL;
	}

}
