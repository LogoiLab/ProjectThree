package pkg;

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
	 * @return
	 */
	public int getPermLevel() {
		return this.PERM_LEVEL;
	}

	/**
	 * @return
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
	 * @return
	 */
	public boolean checkHash(String uname, String upass) {
		if (this.userName.equals(uname)
				&& this.passHash.equals(Hasher.hashPassword(upass.toCharArray(), this.passSalt, 32, 512))) {
			return true;
		} else {
			return false;
		}
	}

}
