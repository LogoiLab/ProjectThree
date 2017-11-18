package pkg;

public class LoginHandler{
	private static final LoginHandler instance = new LoginHandler();

	//private constructor to avoid client applications to use constructor
	private LoginHandler(){}

	public static LoginHandler getInstance(){
		return instance;
	}
}