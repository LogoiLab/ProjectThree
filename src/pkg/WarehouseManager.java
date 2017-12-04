package pkg;

import java.util.Arrays;

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

  /**
   * @param uname
   * @param upass
   * @return match or wrong username
   */
  public boolean checkHash(String uname, String upass) {
    if (this.userName.equals(uname)
            && Arrays.equals(this.passHash, (Hasher.hashPassword(upass.toCharArray(), this.passSalt, 32, 512)))){
      return true;
    } else {
      return false;
    }
  }

}
