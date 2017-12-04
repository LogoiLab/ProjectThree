package pkg;

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

}
