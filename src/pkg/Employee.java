package pkg;

class Employee implements Account {

	private static int PERM_LEVEL = 1;
	private String userName;
	private String passHash;

	public Employee() {

	}

	@Override
	public int getPermLevel() {
		return this.PERM_LEVEL;
	}

  @Override
  public String getUserName() {
    return this.userName;
  }

  @Override
  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public boolean checkHash() {
    return false;
  }
}
