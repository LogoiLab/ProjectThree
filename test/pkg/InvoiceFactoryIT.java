/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.ArrayList;
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
public class InvoiceFactoryIT {
    
    public InvoiceFactoryIT() {
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
     * Test of getInstance method, of class InvoiceFactory.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        InvoiceFactory expResult = null;
        InvoiceFactory result = InvoiceFactory.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentInvoice method, of class InvoiceFactory.
     */
    @Test
    public void testGetCurrentInvoice() {
        System.out.println("getCurrentInvoice");
        InvoiceFactory instance = null;
        SalesInvoice expResult = null;
        SalesInvoice result = instance.getCurrentInvoice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createInvoice method, of class InvoiceFactory.
     */
    @Test
    public void testCreateInvoice() {
        System.out.println("createInvoice");
        Account account = null;
        String customer = "";
        ArrayList<String> invoiceParts = null;
        InvoiceFactory instance = null;
        SalesInvoice expResult = null;
        SalesInvoice result = instance.createInvoice(account, customer, invoiceParts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromInvoice method, of class InvoiceFactory.
     */
    @Test
    public void testRemoveFromInvoice() {
        System.out.println("removeFromInvoice");
        String part = "";
        InvoiceFactory instance = null;
        SalesInvoice expResult = null;
        SalesInvoice result = instance.removeFromInvoice(part);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
