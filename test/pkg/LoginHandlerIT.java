/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cvasquez13
 */
public class LoginHandlerIT {
    
    public LoginHandlerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCurrentAccount method, of class LoginHandler.
     */
    @Test
    public void testGetCurrentAccount() {
        System.out.println("getCurrentAccount");
        Account expResult = null;
        Account result = LoginHandler.getCurrentAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentAccount method, of class LoginHandler.
     */
    @Test
    public void testSetCurrentAccount() {
        System.out.println("setCurrentAccount");
        Account acc = null;
        LoginHandler.setCurrentAccount(acc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class LoginHandler.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        LoginHandler expResult = null;
        LoginHandler result = LoginHandler.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAccount method, of class LoginHandler.
     */
    @Test
    public void testRemoveAccount() {
        System.out.println("removeAccount");
        String n = "";
        LoginHandler instance = null;
        instance.removeAccount(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doLogin method, of class LoginHandler.
     */
    @Test
    public void testDoLogin() {
        System.out.println("doLogin");
        String uname = "";
        String upass = "";
        LoginHandler instance = null;
        boolean expResult = false;
        boolean result = instance.doLogin(uname, upass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccount method, of class LoginHandler.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        Account account = null;
        LoginHandler instance = null;
        instance.addAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccount method, of class LoginHandler.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        String uname = "";
        LoginHandler instance = null;
        Account expResult = null;
        Account result = instance.getAccount(uname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccounts method, of class LoginHandler.
     */
    @Test
    public void testGetAccounts() {
        System.out.println("getAccounts");
        LoginHandler instance = null;
        HashMap<String, Account> expResult = null;
        HashMap<String, Account> result = instance.getAccounts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populate method, of class LoginHandler.
     */
    @Test
    public void testPopulate() {
        System.out.println("populate");
        HashMap<String, Account> accountList = null;
        LoginHandler instance = null;
        instance.populate(accountList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
