package biz.karms.hidato.app.game.matrix.impl;

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
        Coordinates instance = new Coordinates(2, 3);
        int expResult = 2;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Coordinates.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 2;
        Coordinates instance = new Coordinates(1, 3);
        instance.setX(x);
        assertEquals(x, instance.getX());
    }

    /**
     * Test of getY method, of class Coordinates.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Coordinates instance = new Coordinates(2, 3);
        int expResult = 3;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setY method, of class Coordinates.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Coordinates instance = new Coordinates(1, 3);
        instance.setX(y);
        assertEquals(y, instance.getX());
    }

    /**
     * Test of isConsecutive method, of class Coordinates.
     */
    @Test
    public void testIsConsecutive() {
        System.out.println("isConsecutive");
        Coordinates coordinates = new Coordinates(1, 3);
        Coordinates instance = new Coordinates(1, 2);
        assertTrue(instance.isConsecutive(coordinates));
        instance = new Coordinates(1, 1);
        assertFalse(instance.isConsecutive(coordinates));
    }

    /**
     * Test of setCoordinates method, of class Coordinates.
     */
    @Test
    public void testSetCoordinates() {
        System.out.println("setCoordinates");
        Direction direction = Direction.TOP;
        Coordinates instance = new Coordinates(1, 3);
        instance.setCoordinates(direction);
        assertEquals(new Coordinates(1, 4), instance);
    }

    /**
     * Test of equals method, of class Coordinates.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Coordinates coordinates = new Coordinates(2, 1);
        Coordinates instance = new Coordinates(2, 1);
        boolean expResult = true;
        boolean result = instance.equals(coordinates);
        assertEquals(expResult, result);
        coordinates = new Coordinates(3, 1);
        expResult = false;
        result = instance.equals(coordinates);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Coordinates.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Coordinates coordinates1 = new Coordinates(2, 1);
        Coordinates coordinates2 = new Coordinates(2, 1);
        int hash1 = coordinates1.hashCode();
        int hash2 = coordinates2.hashCode();
        assertEquals(hash1, hash2);
    }
}