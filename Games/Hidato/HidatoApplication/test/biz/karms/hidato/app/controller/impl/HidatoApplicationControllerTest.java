package biz.karms.hidato.app.controller.impl;

import com.masprop.cluster1.shared.controller.ApplicationController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michal "Karm" Babacek
 */
public class HidatoApplicationControllerTest {

    public HidatoApplicationControllerTest() {
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
     * Test of getHidatoApplicationController method, of class HidatoApplicationController.
     */
    @Test
    public void testGetHidatoApplicationController() {
        System.out.println("getHidatoApplicationController");
        ApplicationController expResult = null;
        ApplicationController result = HidatoApplicationController.getHidatoApplicationController();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initalizeComponents method, of class HidatoApplicationController.
     */
    @Test
    public void testInitalizeComponents() {
        System.out.println("initalizeComponents");
        HidatoApplicationController instance = null;
        instance.initalizeComponents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}