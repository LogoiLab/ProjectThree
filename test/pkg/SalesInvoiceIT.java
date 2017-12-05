/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * @author cvasquez13
 */
public class SalesInvoiceIT {
    
    public SalesInvoiceIT() {
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
     * Test of saleDate method, of class SalesInvoice.
     */
    @Test
    public void testSaleDate() {
        System.out.println("saleDate");
        SalesInvoice instance = null;
        Date expResult = null;
        Date result = instance.saleDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemList method, of class SalesInvoice.
     */
    @Test
    public void testGetItemList() {
        System.out.println("getItemList");
        SalesInvoice instance = null;
        ItemList expResult = null;
        ItemList result = instance.getItemList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SalesInvoice.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SalesInvoice instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInvoiceTotal method, of class SalesInvoice.
     */
    @Test
    public void testGetInvoiceTotal() {
        System.out.println("getInvoiceTotal");
        SalesInvoice instance = null;
        Double expResult = null;
        Double result = instance.getInvoiceTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCommission method, of class SalesInvoice.
     */
    @Test
    public void testSetCommission() {
        System.out.println("setCommission");
        Double commission = null;
        SalesInvoice instance = null;
        instance.setCommission(commission);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
