package pkg;

        import java.util.HashMap;

public class LoginHandler {
    private static final LoginHandler instance = new LoginHandler();
    private HashMap<String, Account> accountList = new HashMap<String, Account>();

    //private constructor to avoid client applications to use constructor
    private LoginHandler() {
    }

    public static synchronized LoginHandler getInstance() {
        return instance;
    }

    public boolean doLogin(String uname, String upass) {
        return accountList.get(uname).checkHash(uname, upass);
    }

    public void addAccount(Account account) {
        accountList.put(account.getUserName(), account);
    }

    public Account getAccount(String uname) {
        return accountList.get(uname);
    }
}