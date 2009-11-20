package com.masprop.cluster1.shared.controller;

import com.masprop.cluster1.shared.model.GameType;
import com.masprop.cluster1.shared.view.GUIManager;
import static org.junit.Assert.*;

/**
 *
 * @author
 */
public class ApplicationControllerTest {

    public ApplicationControllerTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getInstance method, of class ApplicationController.
     */
    @org.junit.Test
    public void testGetInstance() {
        System.out.println("getInstance");
        GameType gameType = null;
        ApplicationController expResult = null;
        ApplicationController result = ApplicationController.getInstance(gameType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameManager method, of class ApplicationController.
     */
    @org.junit.Test
    public void testGetGameManager() {
        System.out.println("getGameManager");
        ApplicationController instance = new ApplicationControllerImpl();
        GameManager expResult = null;
        GameManager result = instance.getGameManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameManager method, of class ApplicationController.
     */
    @org.junit.Test
    public void testSetGameManager() {
        System.out.println("setGameManager");
        GameManager val = null;
        ApplicationController instance = new ApplicationControllerImpl();
        instance.setGameManager(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameToPlay method, of class ApplicationController.
     */
    @org.junit.Test
    public void testGetGameToPlay() {
        System.out.println("getGameToPlay");
        GameType expResult = null;
        GameType result = ApplicationController.getGameToPlay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGuiManager method, of class ApplicationController.
     */
    @org.junit.Test
    public void testGetGuiManager() {
        System.out.println("getGuiManager");
        ApplicationController instance = new ApplicationControllerImpl();
        GUIManager expResult = null;
        GUIManager result = instance.getGuiManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateGUI method, of class ApplicationController.
     */
    @org.junit.Test
    public void testGenerateGUI() {
        System.out.println("generateGUI");
        ApplicationController instance = new ApplicationControllerImpl();
        instance.generateGUI();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initalizeComponents method, of class ApplicationController.
     */
    @org.junit.Test
    public void testInitalizeComponents() {
        System.out.println("initalizeComponents");
        ApplicationController instance = new ApplicationControllerImpl();
        instance.initalizeComponents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGuiManager method, of class ApplicationController.
     */
    @org.junit.Test
    public void testSetGuiManager() {
        System.out.println("setGuiManager");
        GUIManager guiManager = null;
        ApplicationController instance = new ApplicationControllerImpl();
        instance.setGuiManager(guiManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUniqueInstance method, of class ApplicationController.
     */
    @org.junit.Test
    public void testGetUniqueInstance() {
        System.out.println("getUniqueInstance");
        ApplicationController expResult = null;
        ApplicationController result = ApplicationController.getUniqueInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUniqueInstance method, of class ApplicationController.
     */
    @org.junit.Test
    public void testSetUniqueInstance() {
        System.out.println("setUniqueInstance");
        ApplicationController uniqueInstance = null;
        ApplicationController.setUniqueInstance(uniqueInstance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameToPlay method, of class ApplicationController.
     */
    @org.junit.Test
    public void testSetGameToPlay() {
        System.out.println("setGameToPlay");
        GameType gameToPlay = null;
        ApplicationController.setGameToPlay(gameToPlay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ApplicationControllerImpl extends ApplicationController {

        @Override
        protected void generateGUI() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public void initalizeComponents() {
        }
    }

}