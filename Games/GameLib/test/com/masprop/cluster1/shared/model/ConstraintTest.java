package com.masprop.cluster1.shared.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Matus Pleva
 */
public class ConstraintTest {

    public ConstraintTest() {
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
     * Test of getGameLevelType method, of class Constraint.
     */
    @Test
    public void testGetGameLevelType() {
        System.out.println("getGameLevelType");
        Constraint constraint = new Constraint(GameLevelType.DIFFICULT, null,
                9, GameType.HIDATO);
        GameLevelType expResult = GameLevelType.DIFFICULT;
        GameLevelType result = constraint.getGameLevelType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGameLevelType method, of class Constraint.
     */
    @Test
    public void testSetGameLevelType() {
        System.out.println("setGameLevelType");
        Constraint constraint = new Constraint(GameLevelType.DIFFICULT, null,
                9, GameType.HIDATO);
        GameLevelType gameLevelType = GameLevelType.EASY;
        constraint.setGameLevelType(gameLevelType);
        assertEquals(gameLevelType, constraint.getGameLevelType());
    }

    /**
     * Test of getNoOfFilledCells method, of class Constraint.
     */
    @Test
    public void testGetNoOfFilledCells() {
        System.out.println("getNoOfFilledCells");
        Constraint constraint = new Constraint(GameLevelType.DIFFICULT, null,
                9, GameType.HIDATO);
        int expResult = 9;
        int result = constraint.getNoOfFilledCells();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNoOfFilledCells method, of class Constraint.
     */
    @Test
    public void testSetNoOfFilledCells() {
        System.out.println("setNoOfFilledCells");
        Constraint constraint = new Constraint(GameLevelType.DIFFICULT, null,
                9, GameType.HIDATO);
        int noOfFilledCells = 4;
        constraint.setNoOfFilledCells(noOfFilledCells);
        assertEquals(noOfFilledCells, constraint.getNoOfFilledCells());
    }

    /**
     * Test of getGameType method, of class Constraint.
     */
    @Test
    public void testGetGameType() {
        System.out.println("getGameType");
        Constraint constraint = new Constraint(GameLevelType.DIFFICULT, null,
                9, GameType.HIDATO);
        GameType expResult = GameType.HIDATO;
        GameType result = constraint.getGameType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGameType method, of class Constraint.
     */
    @Test
    public void testSetGameType() {
        System.out.println("setGameType");
        Constraint constraint = new Constraint(GameLevelType.DIFFICULT, null,
                9, GameType.HIDATO);
        GameType gameType = GameType.SUDOKU;
        constraint.setGameType(gameType);
        assertEquals(gameType, constraint.getGameType());
    }

    /**
     * Test of equals method, of class Constraint.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Constraint constraint = new Constraint(GameLevelType.DIFFICULT, null,
                9, GameType.HIDATO);
        Constraint instance = new Constraint(GameLevelType.DIFFICULT, null,
                9, GameType.HIDATO);
        assertTrue(instance.equals(constraint));
        constraint = new Constraint(GameLevelType.EASY, null, 4,
                GameType.HIDATO);
        assertFalse(instance.equals(constraint));
    }

    /**
     * Test of hashCode method, of class Constraint.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Constraint constraint1 = new Constraint(GameLevelType.DIFFICULT, null,
                9, GameType.HIDATO);
        Constraint constraint2 = new Constraint(GameLevelType.DIFFICULT, null,
                9, GameType.HIDATO);
        int hash1 = constraint1.hashCode();
        int hash2 = constraint2.hashCode();
        assertEquals(hash1, hash2);
    }
}
