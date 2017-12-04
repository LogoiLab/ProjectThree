package pkg;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description Handles creation and deletion of accounts, matches password at login
 */

public abstract class Account {
  public static String userName;
  protected static int PERM_LEVEL;
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

  public abstract int getPermLevel();

  public abstract boolean checkHash(String uname, String upass);
}
