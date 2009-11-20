package com.masprop.cluster1.shared.view;

import com.masprop.cluster1.shared.controller.GameManager;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.view.GUIManager.CellActionListener;
import com.masprop.cluster1.shared.view.GUIManager.CellFocusListener;
import com.masprop.cluster1.shared.view.GUIManager.CellKeyListener;
import java.io.File;
import java.util.List;
import javax.swing.JTextField;
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
public class GUIManagerTest {

    public GUIManagerTest() {
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
     * Test of initializeCells method, of class GUIManager.
     */
    @Test
    public void testInitializeCells() {
        System.out.println("initializeCells");
        GUIManager instance = null;
        instance.initializeCells();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewGame method, of class GUIManager.
     */
    @Test
    public void testGetNewGame() {
        System.out.println("getNewGame");
        Constraint constraint = null;
        GUIManager instance = null;
        Game expResult = null;
        Game result = instance.getNewGame(constraint);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateGame method, of class GUIManager.
     */
    @Test
    public void testValidateGame() {
        System.out.println("validateGame");
        Game game = null;
        GUIManager instance = null;
        boolean expResult = false;
        boolean result = instance.validateGame(game);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solveGame method, of class GUIManager.
     */
    @Test
    public void testSolveGame() {
        System.out.println("solveGame");
        Game game = null;
        GUIManager instance = null;
        Game expResult = null;
        Game result = instance.solveGame(game);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveGame method, of class GUIManager.
     */
    @Test
    public void testSaveGame() {
        System.out.println("saveGame");
        File file = null;
        GUIManager instance = null;
        instance.saveGame(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadGame method, of class GUIManager.
     */
    @Test
    public void testLoadGame() {
        System.out.println("loadGame");
        File file = null;
        GUIManager instance = null;
        Game expResult = null;
        Game result = instance.loadGame(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayGame method, of class GUIManager.
     */
    @Test
    public void testDisplayGame() {
        System.out.println("displayGame");
        GUIManager instance = null;
        instance.displayGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConstraint method, of class GUIManager.
     */
    @Test
    public void testGetConstraint() {
        System.out.println("getConstraint");
        GUIManager instance = null;
        Constraint expResult = null;
        Constraint result = instance.getConstraint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConstraint method, of class GUIManager.
     */
    @Test
    public void testSetConstraint() {
        System.out.println("setConstraint");
        Constraint val = null;
        GUIManager instance = null;
        instance.setConstraint(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGame method, of class GUIManager.
     */
    @Test
    public void testGetGame() {
        System.out.println("getGame");
        GUIManager instance = null;
        Game expResult = null;
        Game result = instance.getGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGame method, of class GUIManager.
     */
    @Test
    public void testSetGame() {
        System.out.println("setGame");
        Game val = null;
        GUIManager instance = null;
        instance.setGame(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatistics method, of class GUIManager.
     */
    @Test
    public void testGetStatistics() {
        System.out.println("getStatistics");
        GUIManager instance = null;
        List expResult = null;
        List result = instance.getStatistics();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCells method, of class GUIManager.
     */
    @Test
    public void testGetCells() {
        System.out.println("getCells");
        GUIManager instance = null;
        List expResult = null;
        List result = instance.getCells();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCells method, of class GUIManager.
     */
    @Test
    public void testSetCells() {
        System.out.println("setCells");
        List<JTextField> cells = null;
        GUIManager instance = null;
        instance.setCells(cells);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameManager method, of class GUIManager.
     */
    @Test
    public void testGetGameManager() {
        System.out.println("getGameManager");
        GUIManager instance = null;
        GameManager expResult = null;
        GameManager result = instance.getGameManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameManager method, of class GUIManager.
     */
    @Test
    public void testSetGameManager() {
        System.out.println("setGameManager");
        GameManager gameManager = null;
        GUIManager instance = null;
        instance.setGameManager(gameManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGui method, of class GUIManager.
     */
    @Test
    public void testGetGui() {
        System.out.println("getGui");
        GUIManager instance = null;
        GUI expResult = null;
        GUI result = instance.getGui();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGui method, of class GUIManager.
     */
    @Test
    public void testSetGui() {
        System.out.println("setGui");
        GUI gui = null;
        GUIManager instance = null;
        instance.setGui(gui);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCell method, of class GUIManager.
     */
    @Test
    public void testGetCell() {
        System.out.println("getCell");
        GUIManager instance = null;
        JTextField expResult = null;
        JTextField result = instance.getCell();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCell method, of class GUIManager.
     */
    @Test
    public void testSetCell() {
        System.out.println("setCell");
        JTextField cell = null;
        GUIManager instance = null;
        instance.setCell(cell);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximalAllowedCellValue method, of class GUIManager.
     */
    @Test
    public void testGetMaximalAllowedCellValue() {
        System.out.println("getMaximalAllowedCellValue");
        GUIManager instance = null;
        int expResult = 0;
        int result = instance.getMaximalAllowedCellValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaximalAllowedCellValue method, of class GUIManager.
     */
    @Test
    public void testSetMaximalAllowedCellValue() {
        System.out.println("setMaximalAllowedCellValue");
        int maximalAllowedCellValue = 0;
        GUIManager instance = null;
        instance.setMaximalAllowedCellValue(maximalAllowedCellValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellActionListener method, of class GUIManager.
     */
    @Test
    public void testGetCellActionListener() {
        System.out.println("getCellActionListener");
        GUIManager instance = null;
        CellActionListener expResult = null;
        CellActionListener result = instance.getCellActionListener();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCellActionListener method, of class GUIManager.
     */
    @Test
    public void testSetCellActionListener() {
        System.out.println("setCellActionListener");
        CellActionListener cellActionListener = null;
        GUIManager instance = null;
        instance.setCellActionListener(cellActionListener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellFocusListener method, of class GUIManager.
     */
    @Test
    public void testGetCellFocusListener() {
        System.out.println("getCellFocusListener");
        GUIManager instance = null;
        CellFocusListener expResult = null;
        CellFocusListener result = instance.getCellFocusListener();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCellFocusListener method, of class GUIManager.
     */
    @Test
    public void testSetCellFocusListener() {
        System.out.println("setCellFocusListener");
        CellFocusListener cellFocusListener = null;
        GUIManager instance = null;
        instance.setCellFocusListener(cellFocusListener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellKeyListener method, of class GUIManager.
     */
    @Test
    public void testGetCellKeyListener() {
        System.out.println("getCellKeyListener");
        GUIManager instance = null;
        CellKeyListener expResult = null;
        CellKeyListener result = instance.getCellKeyListener();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCellKeyListener method, of class GUIManager.
     */
    @Test
    public void testSetCellKeyListener() {
        System.out.println("setCellKeyListener");
        CellKeyListener cellKeyListener = null;
        GUIManager instance = null;
        instance.setCellKeyListener(cellKeyListener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exit method, of class GUIManager.
     */
    @Test
    public void testExit() {
        System.out.println("exit");
        GUIManager instance = null;
        instance.exit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GUIManagerImpl extends GUIManager {

        public GUIManagerImpl() {
            super(null);
        }
    }

}