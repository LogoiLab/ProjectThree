package pkg;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * Handles account logins.
 */
public class LoginHandler {

  private static final LoginHandler instance = new LoginHandler();
  public static Account currentAccount = new Nobody();
  /**
   *
   */
  public HashMap<String, Account> accountList = new HashMap<String, Account>();

  // private constructor to avoid client applications to use constructor

  /**
   *
   */
  private LoginHandler() {
    addAccount(new Nobody());
  }

  // private constructor to avoid client applications to use constructor

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

  public void removeAccount(String n) {
    this.accountList.remove(n);
  }

  /**
   * @param uname
   * @param upass
   * @return
   */
  public boolean doLogin(String uname, String upass) {
    this.accountList.put("om", new OfficeManager("om", "password"));
    this.accountList.put("wm", new WarehouseManager("wm", "password"));
    this.accountList.put("em", new Employee("em", "password"));
    this.accountList.put("admin", new Admin("admin", "password"));
    this.currentAccount = accountList.get(uname);
    return this.currentAccount.checkHash(uname, upass);
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
  public void populate(ArrayList<Account> accountList) {
    for(Account a : accountList) {
      this.accountList.put(a.getUserName(), a);
    }
  }
}
