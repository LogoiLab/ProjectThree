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
public class BundleFactoryIT {
    
    public BundleFactoryIT() {
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
     * Test of getInstance method, of class BundleFactory.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        BundleFactory expResult = null;
        BundleFactory result = BundleFactory.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBundle method, of class BundleFactory.
     */
    @Test
    public void testGetBundle() {
        System.out.println("getBundle");
        String bundleName = "";
        BundleFactory instance = null;
        ItemList expResult = null;
        ItemList result = instance.getBundle(bundleName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newBundle method, of class BundleFactory.
     */
    @Test
    public void testNewBundle() {
        System.out.println("newBundle");
        String name = "";
        ItemList list = null;
        BundleFactory instance = null;
        instance.newBundle(name, list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBundleList method, of class BundleFactory.
     */
    @Test
    public void testGetBundleList() {
        System.out.println("getBundleList");
        BundleFactory instance = null;
        BundleList expResult = null;
        BundleList result = instance.getBundleList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populate method, of class BundleFactory.
     */
    @Test
    public void testPopulate() {
        System.out.println("populate");
        BundleList bl = null;
        BundleFactory instance = null;
        instance.populate(bl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
