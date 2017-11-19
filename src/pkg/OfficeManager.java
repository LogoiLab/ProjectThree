package pkg;

class OfficeManager extends Account {

  private static int PERM_LEVEL = 3;

  public OfficeManager(String userName, String password) {
    super.userName = userName;
    super.passSalt = Hasher.generateSalt();
    super.passHash = Hasher.hashPassword(password.toCharArray(), super.passSalt, 32, 512);
  }

}
