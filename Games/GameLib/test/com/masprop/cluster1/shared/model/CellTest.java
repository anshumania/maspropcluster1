package com.masprop.cluster1.shared.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Matus Pleva
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
        Cell instance = new Cell(5, true, true);
        boolean expResult = true;
        boolean result = instance.isActive();
        assertEquals(expResult, result);
    }

    /**
     * Test of setActive method, of class Cell.
     */
    @Test
    public void testSetActive() {
        System.out.println("setActive");
        Cell instance = new Cell(5, true, true);
        boolean active = false;
        instance.setActive(active);
        assertEquals(active, instance.isActive());
    }

    /**
     * Test of getCurrentValue method, of class Cell.
     */
    @Test
    public void testGetCurrentValue() {
        System.out.println("getCurrentValue");
        Cell instance = new Cell(5, true, true);
        int expResult = 5;
        int result = instance.getCurrentValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCurrentValue method, of class Cell.
     */
    @Test
    public void testSetCurrentValue() {
        System.out.println("setCurrentValue");
        Cell instance = new Cell(5, true, true);
        int currentValue = 5;
        instance.setCurrentValue(currentValue);
        assertEquals(currentValue, instance.getCurrentValue());
    }

    /**
     * Test of isEditable method, of class Cell.
     */
    @Test
    public void testIsEditable() {
        System.out.println("isEditable");
        Cell instance = new Cell(5, true, true);
        boolean expResult = true;
        boolean result = instance.isEditable();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEditable method, of class Cell.
     */
    @Test
    public void testSetEditable() {
        System.out.println("setEditable");
        Cell instance = new Cell(5, true, true);
        boolean editable = false;
        instance.setEditable(editable);
        assertEquals(editable, instance.isEditable());
    }

    /**
     * Test of equals method, of class Cell.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Cell cell1 = new Cell(6, true, false);
        Cell cell2 = new Cell(6, true, false);
        assertTrue(cell1.equals(cell2));
        cell1 = new Cell(6, true, true);
        assertFalse(cell1.equals(cell2));
    }

    /**
     * Test of hashCode method, of class Cell.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Cell cell1 = new Cell(6, true, false);
        Cell cell2 = new Cell(6, true, false);
        int hash1 = cell1.hashCode();
        int hash2 = cell2.hashCode();
        assertEquals(hash1, hash2);
    }
}
