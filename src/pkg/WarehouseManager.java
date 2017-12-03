package pkg;

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

}
