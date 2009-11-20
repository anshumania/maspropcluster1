package com.masprop.cluster1.shared.controller;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
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
public class GameGeneratorTest {

    public GameGeneratorTest() {
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
     * Test of generateGame method, of class GameGenerator.
     */
    @Test
    public void testGenerateGame() {
        System.out.println("generateGame");
        Constraint constraint = null;
        GameGenerator instance = (GameGenerator) new GameGeneratorImpl();
        Game expResult = null;
        Game result = instance.generateGame(constraint);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GameGeneratorImpl implements GameGenerator {

        public Game generateGame(Constraint constraint) {
            return null;
        }
    }

}