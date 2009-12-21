package biz.karms.hidato.app.game.matrix.impl;

import com.masprop.cluster1.shared.model.Coordinates;
import com.masprop.cluster1.shared.model.Direction;
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
     * Test of isConsecutive2 method, of class Coordinates.
     */
    @Test
    public void testIsConsecutive2() {
        System.out.println("isConsecutive2");
        Coordinates coordinates = new Coordinates(0, 0);
        Coordinates instance = new Coordinates(0, 2);
        assertTrue(instance.isConsecutive2(coordinates));
        instance = new Coordinates(0, 3);
        assertFalse(instance.isConsecutive(coordinates));
    }

    /**
     * Test of isConsecutive2 method, of class Coordinates.
     */
    @Test
    public void testIsConsecutive3() {
        System.out.println("isConsecutive3");
        Coordinates coordinates = new Coordinates(0, 0);
        Coordinates instance = new Coordinates(0, 3);
        assertTrue(instance.isConsecutive3(coordinates));
        instance = new Coordinates(0, 4);
        assertFalse(instance.isConsecutive(coordinates));
    }

    /**
     * Test of getNewCoordinates method, of class Coordinates.
     */
    @Test
    public void testSetCoordinates() {
        System.out.println("setCoordinates");
        //test top
        Direction direction = Direction.TOP;
        Coordinates instance = new Coordinates(1, 1);
        instance = instance.getNewCoordinates(direction);
        assertEquals(new Coordinates(1, 0), instance);
        //test rightTop
        direction = Direction.RIGHTTOP;
        instance = new Coordinates(1, 1);
        instance = instance.getNewCoordinates(direction);
        assertEquals(new Coordinates(2, 0), instance);
        //test right
        direction = Direction.RIGHT;
        instance = new Coordinates(1, 1);
        instance = instance.getNewCoordinates(direction);
        assertEquals(new Coordinates(2, 1), instance);
        //test rightBottom
        direction = Direction.RIGHTBOTTOM;
        instance = new Coordinates(1, 1);
        instance = instance.getNewCoordinates(direction);
        assertEquals(new Coordinates(2, 2), instance);
        //test bottom
        direction = Direction.BOTTOM;
        instance = new Coordinates(1, 1);
        instance = instance.getNewCoordinates(direction);
        assertEquals(new Coordinates(1, 2), instance);
        //test leftBottom
        direction = Direction.LEFTBOTTOM;
        instance = new Coordinates(1, 1);
        instance = instance.getNewCoordinates(direction);
        assertEquals(new Coordinates(0, 2), instance);
        //test left
        direction = Direction.LEFT;
        instance = new Coordinates(1, 1);
        instance = instance.getNewCoordinates(direction);
        assertEquals(new Coordinates(0, 1), instance);
        //test leftTop
        direction = Direction.LEFTTOP;
        instance = new Coordinates(1, 1);
        instance = instance.getNewCoordinates(direction);
        assertEquals(new Coordinates(0, 0), instance);
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