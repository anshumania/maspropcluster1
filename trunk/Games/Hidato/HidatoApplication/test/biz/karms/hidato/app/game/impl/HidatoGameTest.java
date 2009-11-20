package biz.karms.hidato.app.game.impl;

import biz.karms.hidato.app.game.matrix.impl.HidatoMatrix;
import java.util.List;
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
public class HidatoGameTest {

    public HidatoGameTest() {
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
     * Test of getSolutions method, of class HidatoGame.
     */
    @Test
    public void testGetSolutions() {
        System.out.println("getSolutions");
        HidatoGame instance = null;
        List expResult = null;
        List result = instance.getSolutions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSolutions method, of class HidatoGame.
     */
    @Test
    public void testSetSolutions() {
        System.out.println("setSolutions");
        List<HidatoMatrix> solutions = null;
        HidatoGame instance = null;
        instance.setSolutions(solutions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}