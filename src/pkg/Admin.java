package pkg;

import java.util.Arrays;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description constructor class for system admin
 */
class Admin extends Account {

  private static int PERM_LEVEL = 4;

  /**
   * @param userName
   * @param password
   */
  public Admin(String userName, String password) {
    super.PERM_LEVEL = this.PERM_LEVEL;
    super.userName = userName;
    super.passSalt = Hasher.generateSalt();
    super.passHash = Hasher.hashPassword(password.toCharArray(), super.passSalt, 32, 512);
  }

  public Admin(String userName, byte[] passHash, byte[] passSalt) {
    super.PERM_LEVEL = this.PERM_LEVEL;
    super.userName = userName;
    super.passSalt = passHash;
    super.passHash = passSalt;
  }

  /**
   * @return
   */
  public int getPermLevel() {
    return this.PERM_LEVEL;
  }

  /**
   * @param uname
   * @param upass
   * @return match or wrong username
   */
  public boolean checkHash(String uname, String upass) {
    if (this.userName.equals(uname)
            && Arrays.equals(this.passHash, (Hasher.hashPassword(upass.toCharArray(), this.passSalt, 32, 512)))) {
      return true;
    } else {
      return false;
    }
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
}
