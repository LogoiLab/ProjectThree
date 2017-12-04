package pkg;

import java.util.Arrays;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * Defines the special Nobody account class.
 */
class Nobody extends Account {

  private static int PERM_LEVEL = 0;

  /**
   *
   */
  public Nobody() {
    super.setUserName("nobody");
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

}
