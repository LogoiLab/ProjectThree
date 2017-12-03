package pkg;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description Handles creation and deletion of accounts, matches password at login
 */

public abstract class Account {
	protected static int PERM_LEVEL;
	public static String userName;
	protected static byte[] passHash;
	protected static byte[] passSalt;

	/**
	 * 
	 */
	public Account() {
	}

	/**
	 * @param userName
	 * @param password
	 */
	public Account(String userName, String password) {
		this.userName = userName;
		this.passSalt = Hasher.generateSalt();
		this.passHash = Hasher.hashPassword(password.toCharArray(), this.passSalt, 32, 512);
	}

	/**
	 * @return username
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @param uname
	 * @param upass
	 * @return match or wrong username
	 */
	public boolean checkHash(String uname, String upass) {
		if (this.userName.equals(uname)
				&& this.passHash.equals(Hasher.hashPassword(upass.toCharArray(), this.passSalt, 32, 512))) {
			return true;
		} else {
			return false;
		}
	}

	public abstract int getPermLevel();
}
