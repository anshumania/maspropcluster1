package biz.karms.hidato.app.util.impl;

import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.GameType;
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
public class HidatoConstraintTest {

    public HidatoConstraintTest() {
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
     * Test of getXDimension method, of class HidatoConstraint.
     */
    @Test
    public void testGetXDimension() {
        System.out.println("getXDimension");
        HidatoConstraint instance = new HidatoConstraint(
                GameLevelType.DIFFICULT, GameVariantImpl.RECTANGULAR_SHAPE,
                5, GameType.HIDATO, 4, 5);
        int expResult = 4;
        int result = instance.getXDimension();
        assertEquals(expResult, result);
    }

    /**
     * Test of setXDimension method, of class HidatoConstraint.
     */
    @Test
    public void testSetXDimension() {
        System.out.println("setXDimension");
        int xDimension = 6;
        HidatoConstraint instance = new HidatoConstraint(
                GameLevelType.DIFFICULT, GameVariantImpl.RECTANGULAR_SHAPE,
                5, GameType.HIDATO, 4, 5);
        instance.setXDimension(xDimension);
        assertEquals(xDimension, instance.getXDimension());
    }

    /**
     * Test of getYDimension method, of class HidatoConstraint.
     */
    @Test
    public void testGetYDimension() {
        System.out.println("getYDimension");
        HidatoConstraint instance = new HidatoConstraint(
                GameLevelType.DIFFICULT, GameVariantImpl.RECTANGULAR_SHAPE,
                5, GameType.HIDATO, 4, 5);
        int expResult = 5;
        int result = instance.getYDimension();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYDimension method, of class HidatoConstraint.
     */
    @Test
    public void testSetYDimension() {
        System.out.println("setYDimension");
        int yDimension = 3;
        HidatoConstraint instance = new HidatoConstraint(
                GameLevelType.DIFFICULT, GameVariantImpl.RECTANGULAR_SHAPE,
                5, GameType.HIDATO, 4, 5);
        instance.setYDimension(yDimension);
        assertEquals(yDimension, instance.getYDimension());
    }
}
