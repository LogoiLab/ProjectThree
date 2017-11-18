package pkg;

class Employee extends Account {

	private static int PERM_LEVEL = 1;

	public Employee(String uname, String upass) {
    super.checkHash(uname, upass);
	}

}
