package pkg;

public abstract class Account {
  private static int PERM_LEVEL;
  private static String userName;
  private static byte[] passHash;
  private static byte[] passSalt;

  public Account(String userName, String password) {
    this.userName = userName;
    this.passSalt = Hasher.generateSalt();
    this.passHash = Hasher.hashPassword(password.toCharArray(), this.passSalt, 32, 512);
  }

  public int getPermLevel() {
    return this.PERM_LEVEL;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public boolean checkHash(String uname, String upass) {
    if (this.userName.equals(uname) && this.passHash.equals(Hasher.hashPassword(upass.toCharArray(), this.passSalt, 32, 512))) {
      return true;
    } else {
      return false;
    }
  }

}
