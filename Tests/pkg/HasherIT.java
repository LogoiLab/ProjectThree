/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

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
public class HasherIT {
    
    public HasherIT() {
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
     * Test of hashPassword method, of class Hasher.
     */
    @Test
    public void testHashPassword() {
        System.out.println("hashPassword");
        char[] password = null;
        byte[] salt = null;
        int iterations = 0;
        int keyLength = 0;
        byte[] expResult = null;
        byte[] result = Hasher.hashPassword(password, salt, iterations, keyLength);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateSalt method, of class Hasher.
     */
    @Test
    public void testGenerateSalt() {
        System.out.println("generateSalt");
        byte[] expResult = null;
        byte[] result = Hasher.generateSalt();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
