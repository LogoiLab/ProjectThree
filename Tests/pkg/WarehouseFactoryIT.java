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
public class WarehouseFactoryIT {
    
    public WarehouseFactoryIT() {
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
     * Test of getInstance method, of class WarehouseFactory.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        WarehouseFactory expResult = null;
        WarehouseFactory result = WarehouseFactory.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWarehouse method, of class WarehouseFactory.
     */
    @Test
    public void testGetWarehouse() {
        System.out.println("getWarehouse");
        String name = "";
        WarehouseFactory instance = null;
        Warehouse expResult = null;
        Warehouse result = instance.getWarehouse(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWarehouseList method, of class WarehouseFactory.
     */
    @Test
    public void testGetWarehouseList() {
        System.out.println("getWarehouseList");
        WarehouseFactory instance = null;
        WarehouseList expResult = null;
        WarehouseList result = instance.getWarehouseList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createWarehouse method, of class WarehouseFactory.
     */
    @Test
    public void testCreateWarehouse_3args() {
        System.out.println("createWarehouse");
        String name = "";
        boolean isVan = false;
        ItemList list = null;
        WarehouseFactory instance = null;
        instance.createWarehouse(name, isVan, list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createWarehouse method, of class WarehouseFactory.
     */
    @Test
    public void testCreateWarehouse_String_boolean() {
        System.out.println("createWarehouse");
        String name = "";
        boolean isVan = false;
        WarehouseFactory instance = null;
        instance.createWarehouse(name, isVan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWarehouse method, of class WarehouseFactory.
     */
    @Test
    public void testAddWarehouse() {
        System.out.println("addWarehouse");
        Warehouse wh = null;
        WarehouseFactory instance = null;
        instance.addWarehouse(wh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveParts method, of class WarehouseFactory.
     */
    @Test
    public void testMoveParts() {
        System.out.println("moveParts");
        String wh1 = "";
        String wh2 = "";
        Long partnum = null;
        Integer quantity = null;
        WarehouseFactory instance = null;
        instance.moveParts(wh1, wh2, partnum, quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populate method, of class WarehouseFactory.
     */
    @Test
    public void testPopulate() {
        System.out.println("populate");
        WarehouseList whList = null;
        WarehouseFactory instance = null;
        instance.populate(whList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
