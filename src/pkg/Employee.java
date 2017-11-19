package pkg;

class Employee extends Account {

  private static int PERM_LEVEL = 1;

  public Employee(String userName, String password) {
    super.userName = userName;
    super.passSalt = Hasher.generateSalt();
    super.passHash = Hasher.hashPassword(password.toCharArray(), super.passSalt, 32, 512);
  }

}
