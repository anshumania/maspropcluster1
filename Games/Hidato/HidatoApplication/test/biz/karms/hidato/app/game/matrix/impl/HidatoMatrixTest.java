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
 * @author Matus Pleva
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
        Coordinates coordinates = new Coordinates(0, 2);
        int[] values = {6, 7, 9,
                        0, 5, 8,
                        1, 0, 0};
        HidatoMatrix matrix = new HidatoMatrix(3, 3, values);
        Cell expResult = new Cell(1, false, true);
        Cell result = matrix.getCell(coordinates);
        assertEquals(expResult, result);
    }

    /**
     * Test of setCellValue method, of class HidatoMatrix.
     */
    @Test
    public void testSetCellValue() {
        System.out.println("setCellValue");
        Coordinates coordinates = new Coordinates(2, 0);
        int[] values = {1, 2, 3,
                        4, 5, 6,
                        7, 8, 9};
        HidatoMatrix matrix = new HidatoMatrix(3, 3, values);
        int value = 5;
        matrix.setCellValue(coordinates, value);
        assertEquals(value, matrix.getCell(coordinates).getCurrentValue());
    }

    /**
     * Test of getWidth method, of class HidatoMatrix.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        int[] values = {1, 2, 3, 10,
                        4, 5, 6, 12,
                        7, 8, 11, 9};
        HidatoMatrix matrix = new HidatoMatrix(4, 3, values);
        int expResult = 4;
        int result = matrix.getWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHeight method, of class HidatoMatrix.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        System.out.println("getWidth");
        int[] values = {1, 2, 3, 10,
                        4, 5, 6, 12,
                        7, 8, 11, 9};
        HidatoMatrix matrix = new HidatoMatrix(4, 3, values);
        int expResult = 3;
        int result = matrix.getHeight();
        assertEquals(expResult, result);
    }

}