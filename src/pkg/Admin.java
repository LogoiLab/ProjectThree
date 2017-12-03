package pkg;

class Admin extends Account {

	private static int PERM_LEVEL = 4;

	/**
	 * @param userName
	 * @param password
	 */
	public Admin(String userName, String password) {
		super.userName = userName;
		super.passSalt = Hasher.generateSalt();
		super.passHash = Hasher.hashPassword(password.toCharArray(), super.passSalt, 32, 512);
	}

}
