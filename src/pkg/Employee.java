package pkg;

class Employee extends Account {

  private static int PERM_LEVEL = 1;
  private static double com = 0.15;

  public Employee(String userName, String password) {
    super.userName = userName;
    super.passSalt = Hasher.generateSalt();
    super.passHash = Hasher.hashPassword(password.toCharArray(), super.passSalt, 32, 512);
  }

  public double getCommission() {
    return this.com;
  }

  public void setCommission(double com) {
    this.com = com;
  }

}
