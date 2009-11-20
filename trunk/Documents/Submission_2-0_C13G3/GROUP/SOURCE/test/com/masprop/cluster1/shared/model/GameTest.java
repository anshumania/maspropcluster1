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
public class GameTest {

    public GameTest() {
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
     * Test of getConstraint method, of class Game.
     */
    @Test
    public void testGetConstraint() {
        System.out.println("getConstraint");
        Game game = new Game(new Constraint(GameLevelType.DIFFICULT, null,
                4, GameType.HIDATO), null) {};
        Constraint expResult = new Constraint(GameLevelType.DIFFICULT, null,
                4, GameType.HIDATO);
        Constraint result = game.getConstraint();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConstraint method, of class Game.
     */
    @Test
    public void testSetConstraint() {
        System.out.println("setConstraint");
        Game game = new Game(new Constraint(GameLevelType.DIFFICULT, null,
                4, GameType.HIDATO), null) {};
        Constraint constraint = new Constraint(GameLevelType.EASY, null,
                8, GameType.HIDATO);
        game.setConstraint(constraint);
        assertEquals(constraint, game.getConstraint());
    }

    /**
     * Test of getTime method, of class Game.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Game game = new Game(new Constraint(), null, 265) {};
        long expResult = 265;
        long result = game.getTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTime method, of class Game.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        Game game = new Game(new Constraint(), null, 265) {};
        long time = 100;
        game.setTime(time);
        assertEquals(time, game.getTime());
    }
}