/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.masprop.cluster1.shared.controller;

import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.GameType;
import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author
 */
public class StorageManagerTest {

    public StorageManagerTest() {
    }


    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of saveToFile method, of class StorageManager.
     *
     * //TODO: Update TestCase when bug with XStream will be resolved
     */
    @org.junit.Test
    public void testSaveToFile() {
        System.out.println("saveToFile");
        Game game =  ApplicationController.getUniqueInstance().getGameManager().getNewGame(null);
        File file = null;
        GameType gameType = null;
        StorageManager instance = new StorageManager();
        instance.saveToFile(game, file, gameType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadFromFile method, of class StorageManager.
     *
     * //TODO: Update TestCase when bug with XStream will be resolved
     */
    @org.junit.Test
    public void testLoadFromFile() {
        System.out.println("loadFromFile");
        File file = null;
        GameType gameType = null;
        StorageManager instance = new StorageManager();
        Game expResult = null;
        Game result = instance.loadFromFile(file, gameType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}