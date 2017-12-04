/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.io.File;
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
public class DatabaseHandlerIT {
    
    public DatabaseHandlerIT() {
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
     * Test of loadDatabase method, of class DatabaseHandler.
     */
    @Test
    public void testLoadDatabase() {
        System.out.println("loadDatabase");
        DatabaseHandler.loadDatabase();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveDatabase method, of class DatabaseHandler.
     */
    @Test
    public void testSaveDatabase() {
        System.out.println("saveDatabase");
        DatabaseHandler.saveDatabase();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class DatabaseHandler.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        String expResult = "";
        String result = DatabaseHandler.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateInventory method, of class DatabaseHandler.
     */
    @Test
    public void testUpdateInventory() {
        System.out.println("updateInventory");
        File file = null;
        DatabaseHandler.updateInventory(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readInventoryFile method, of class DatabaseHandler.
     */
    @Test
    public void testReadInventoryFile() {
        System.out.println("readInventoryFile");
        File file = null;
        DatabaseHandler.readInventoryFile(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
