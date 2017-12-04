package pkg;

import java.util.HashMap;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * Handles account logins.
 */
public class LoginHandler {

  private static final LoginHandler instance = new LoginHandler();
  private static Account currentAccount;
  /**
   *
   */
  private HashMap<String, Account> accountList = new HashMap<String, Account>();

  // private constructor to avoid client applications to use constructor

<<<<<<< HEAD
	public void removeAccount(String n){
		this.accountList.remove(n);
	}

	// private constructor to avoid client applications to use constructor
	/**
	 * 
	 */
	private LoginHandler() {
		addAccount(new Nobody());
	}
=======
  /**
   *
   */
  private LoginHandler() {
    addAccount(new Nobody());
  }
>>>>>>> 651c527f5889eed0c254e6f093634ef42b04de3d

  public static Account getCurrentAccount() {
    return currentAccount;
  }

  public static void setCurrentAccount(Account acc) {
    currentAccount = acc;
  }

  /**
   * @return
   */
  public static synchronized LoginHandler getInstance() {
    return instance;
  }

  /**
   * @param uname
   * @param upass
   * @return
   */
  public boolean doLogin(String uname, String upass) {
    addAccount(new Admin("admin", "password"));
    //System.out.println(uname);
    //return accountList.get(uname).checkHash(uname, upass);
    return true;
  }

  /**
   * @param account
   */
  public void addAccount(Account account) {
    accountList.put(account.getUserName(), account);
  }

  /**
   * @param uname
   * @return
   */
  public Account getAccount(String uname) {
    return accountList.get(uname);
  }

  /**
   * @return
   */
  public HashMap<String, Account> getAccounts() {
    return this.accountList;
  }

  /**
   * @param accountList
   */
  public void populate(HashMap<String, Account> accountList) {
    if (this.accountList.isEmpty()) {
      this.accountList = accountList;
    } else {
      this.accountList.putAll(accountList);
    }
  }
}