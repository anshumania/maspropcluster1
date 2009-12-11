package com.masprop.cluster1.shared.controller;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.*;

/**
 *
 * @author
 */
public class GameManagerTest {

    public GameManagerTest() {
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
     * Test of getGameGenerator method, of class GameManager.
     */
    @org.junit.Test
    public void testGetGameGenerator() {
        System.out.println("getGameGenerator");
        GameManager instance = new GameManagerImpl();
        GameGenerator expResult = null;
        GameGenerator result = instance.getGameGenerator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameSolver method, of class GameManager.
     */
    @org.junit.Test
    public void testGetGameSolver() {
        System.out.println("getGameSolver");
        GameManager instance = new GameManagerImpl();
        GameSolver expResult = null;
        GameSolver result = instance.getGameSolver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameValidator method, of class GameManager.
     */
    @org.junit.Test
    public void testGetGameValidator() {
        System.out.println("getGameValidator");
        GameManager instance = new GameManagerImpl();
        GameValidator expResult = null;
        GameValidator result = instance.getGameValidator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStorageManager method, of class GameManager.
     */
    @org.junit.Test
    public void testGetStorageManager() {
        System.out.println("getStorageManager");
        GameManager instance = new GameManagerImpl();
        StorageManager expResult = null;
        StorageManager result = instance.getStorageManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewGame method, of class GameManager.
     */
    @org.junit.Test
    public void testGetNewGame() {
        System.out.println("getNewGame");
        Constraint constraint = null;
        GameManager instance = new GameManagerImpl();
        Game expResult = null;
        Game result = instance.getNewGame(constraint);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateGame method, of class GameManager.
     */
    @org.junit.Test
    public void testValidateGame() {
        System.out.println("validateGame");
        Game game = null;
        GameManager instance = new GameManagerImpl();
        boolean expResult = false;
        boolean result = instance.validateGame(game);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solveGame method, of class GameManager.
     */
    @org.junit.Test
    public void testSolveGame() {
        System.out.println("solveGame");
        Game game = null;
        GameManager instance = new GameManagerImpl();
        Game expResult = null;
        Game result = instance.solveGame(game);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveGame method, of class GameManager.
     */
    @org.junit.Test
    public void testSaveGame() {
        System.out.println("saveGame");
        Game game = null;
        File file = null;
        GameManager instance = new GameManagerImpl();

            instance.saveGame(game, file);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadGame method, of class GameManager.
     */
    @org.junit.Test
    public void testLoadGame() {
        System.out.println("loadGame");
        File file = null;
        GameManager instance = new GameManagerImpl();
        Game expResult = null;
        Game result;

            result = instance.loadGame(file);
                    assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatistics method, of class GameManager.
     */
    @org.junit.Test
    public void testGetStatistics() {
        System.out.println("getStatistics");
        GameManager instance = new GameManagerImpl();
        List expResult = null;
        Properties result = instance.getStatistics();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameGenerator method, of class GameManager.
     */
    @org.junit.Test
    public void testSetGameGenerator() {
        System.out.println("setGameGenerator");
        GameGenerator gameGenerator = null;
        GameManager instance = new GameManagerImpl();
        instance.setGameGenerator(gameGenerator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameSolver method, of class GameManager.
     */
    @org.junit.Test
    public void testSetGameSolver() {
        System.out.println("setGameSolver");
        GameSolver gameSolver = null;
        GameManager instance = new GameManagerImpl();
        instance.setGameSolver(gameSolver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameValidator method, of class GameManager.
     */
    @org.junit.Test
    public void testSetGameValidator() {
        System.out.println("setGameValidator");
        GameValidator gameValidator = null;
        GameManager instance = new GameManagerImpl();
        instance.setGameValidator(gameValidator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStorageManager method, of class GameManager.
     */
    @org.junit.Test
    public void testSetStorageManager() {
        System.out.println("setStorageManager");
        StorageManager storageManager = null;
        GameManager instance = new GameManagerImpl();
        instance.setStorageManager(storageManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatisticsManager method, of class GameManager.
     */
    @org.junit.Test
    public void testSetStatisticsManager() {
        System.out.println("setStatisticsManager");
        StatisticsManager statisticsManager = null;
        GameManager instance = new GameManagerImpl();
        instance.setStatisticsManager(statisticsManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatisticsManager method, of class GameManager.
     */
    @org.junit.Test
    public void testGetStatisticsManager() {
        System.out.println("getStatisticsManager");
        GameManager instance = new GameManagerImpl();
        StatisticsManager expResult = null;
        StatisticsManager result = instance.getStatisticsManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameType method, of class GameManager.
     */
    @org.junit.Test
    public void testGetGameType() {
        System.out.println("getGameType");
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameType method, of class GameManager.
     */
    @org.junit.Test
    public void testSetGameType() {
        System.out.println("setGameType");
        fail("The test case is a prototype.");
    }

    public class GameManagerImpl extends GameManager {
    }

}