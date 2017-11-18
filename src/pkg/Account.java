package pkg;

public abstract class Account {
  private static int PERM_LEVEL;
  private static String userName;
  private static byte[] passHash;
  private static byte[] passSalt;

  public int getPermLevel() {
    return this.PERM_LEVEL;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public boolean checkHash() {
    return false;
  }

}
