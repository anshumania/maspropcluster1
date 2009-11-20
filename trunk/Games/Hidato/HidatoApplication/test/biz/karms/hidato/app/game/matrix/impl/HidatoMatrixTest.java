package biz.karms.hidato.app.game.matrix.impl;

import com.masprop.cluster1.shared.model.Cell;
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
public class HidatoMatrixTest {

    public HidatoMatrixTest() {
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
     * Test of getCell method, of class HidatoMatrix.
     */
    @Test
    public void testGetCell() {
        System.out.println("getCell");
        Coordinates coordinates = null;
        HidatoMatrix instance = null;
        Cell expResult = null;
        Cell result = instance.getCell(coordinates);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCellValue method, of class HidatoMatrix.
     */
    @Test
    public void testSetCellValue() {
        System.out.println("setCellValue");
        Coordinates coordinates = null;
        int value = 0;
        HidatoMatrix instance = null;
        instance.setCellValue(coordinates, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class HidatoMatrix.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        HidatoMatrix instance = null;
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class HidatoMatrix.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        HidatoMatrix instance = null;
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class HidatoMatrix.
     */
    @Test
    public void testWrite() {
        System.out.println("write");
        HidatoMatrix instance = null;
        instance.write();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}