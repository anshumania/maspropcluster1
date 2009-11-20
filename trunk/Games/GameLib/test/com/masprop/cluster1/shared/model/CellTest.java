package com.masprop.cluster1.shared.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author
 */
public class CellTest {

    public CellTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of isActive method, of class Cell.
     */
    @Test
    public void testIsActive() {
        System.out.println("isActive");
        Cell instance = null;
        boolean expResult = false;
        boolean result = instance.isActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActive method, of class Cell.
     */
    @Test
    public void testSetActive() {
        System.out.println("setActive");
        boolean active = false;
        Cell instance = null;
        instance.setActive(active);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentValue method, of class Cell.
     */
    @Test
    public void testGetCurrentValue() {
        System.out.println("getCurrentValue");
        Cell instance = null;
        int expResult = 0;
        int result = instance.getCurrentValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentValue method, of class Cell.
     */
    @Test
    public void testSetCurrentValue() {
        System.out.println("setCurrentValue");
        int currentValue = 0;
        Cell instance = null;
        instance.setCurrentValue(currentValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEditable method, of class Cell.
     */
    @Test
    public void testIsEditable() {
        System.out.println("isEditable");
        Cell instance = null;
        boolean expResult = false;
        boolean result = instance.isEditable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditable method, of class Cell.
     */
    @Test
    public void testSetEditable() {
        System.out.println("setEditable");
        boolean editable = false;
        Cell instance = null;
        instance.setEditable(editable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}