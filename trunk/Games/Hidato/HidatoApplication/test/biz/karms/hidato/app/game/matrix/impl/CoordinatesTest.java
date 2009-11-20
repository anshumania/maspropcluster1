package biz.karms.hidato.app.game.matrix.impl;

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
public class CoordinatesTest {

    public CoordinatesTest() {
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
     * Test of getX method, of class Coordinates.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Coordinates instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Coordinates.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Coordinates instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Coordinates.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Coordinates instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Coordinates.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Coordinates instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isConsecutive method, of class Coordinates.
     */
    @Test
    public void testIsConsecutive() {
        System.out.println("isConsecutive");
        Coordinates coordinates = null;
        Coordinates instance = null;
        boolean expResult = false;
        boolean result = instance.isConsecutive(coordinates);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoordinates method, of class Coordinates.
     */
    @Test
    public void testSetCoordinates() {
        System.out.println("setCoordinates");
        Direction direction = null;
        Coordinates instance = null;
        instance.setCoordinates(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Coordinates.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Coordinates instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Coordinates.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Coordinates instance = null;
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Coordinates.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Coordinates instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}