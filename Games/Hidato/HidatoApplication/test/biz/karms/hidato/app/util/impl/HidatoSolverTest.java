package biz.karms.hidato.app.util.impl;

import biz.karms.hidato.app.game.impl.HidatoGame;
import com.masprop.cluster1.shared.model.Coordinates;
import com.masprop.cluster1.shared.model.Direction;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.Matrix;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Matus PLeva
 */
public class HidatoSolverTest {

    public HidatoSolverTest() {
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
     * Test of setCurrentCoo method, of class HidatoSolver.
     */
    @Test
    public void testSetCurrentCoo() {
        System.out.println("setCurrentCoo");
        Coordinates currentCoo = new Coordinates(0, 0);
        HidatoSolver instance = new HidatoSolver();
        instance.setCurrentCoo(currentCoo);
        assertEquals(currentCoo, instance.getCurrentCoo());
    }

    /**
     * Test of setCurrentVal method, of class HidatoSolver.
     */
    @Test
    public void testSetCurrentVal() {
        System.out.println("setCurrentVal");
        int currentVal = 5;
        HidatoSolver instance = new HidatoSolver();
        instance.setCurrentVal(currentVal);
        assertEquals(currentVal, instance.getCurrentVal());
    }

    /**
     * Test of setMatrix method, of class HidatoSolver.
     */
    @Test
    public void testSetMatrix() {
        System.out.println("setMatrix");
        int[] values = {6, 0, 9,
                        0, 4, 0,
                        1, 0, 0};
        Matrix matrix = new Matrix(3, 3, values);
        HidatoSolver instance = new HidatoSolver();
        instance.setMatrix(matrix);
        int[] result = new int[9];
        int k = 0;
        //parse matrix to one dimensional array
        for (int y = 0; y < instance.getMatrix().getHeight(); y++) {
            for (int x = 0; x < instance.getMatrix().getWidth(); x++) {
                result[k] = instance.getMatrix().getCell(
                        new Coordinates(x, y)).getCurrentValue();
                k++;
            }
        }
        assertArrayEquals(values, result);
    }

    /**
     * Test of nextDir method, of class HidatoSolver.
     */
    @Test
    public void testNextDir() {
        System.out.println("nextDir");
        int[] values = {6, 0, 9,
                        0, 4, 0,
                        1, 0, 0};
        Matrix matrix = new Matrix(3, 3, values);
        HidatoSolver solver = new HidatoSolver();
        solver.setMatrix(matrix);
        solver.setCurrentCoo(new Coordinates(0, 0));
        Direction result = solver.nextDir(Direction.TOP);
        Direction expResult = Direction.RIGHT;
        assertEquals(expResult, result);
    }

    /**
     * Test of putNext method, of class HidatoSolver.
     */
    @Test
    public void testPutNext() {
        System.out.println("putNext");
        int[] values = {6, 0, 9,
                        0, 0, 0,
                        1, 0, 0};
        Matrix matrix = new Matrix(3, 3, values);
        HidatoSolver solver = new HidatoSolver();
        solver.setMatrix(matrix);
        solver.setCurrentVal(1);
        solver.setCurrentCoo(new Coordinates(0, 0));
        solver.putNext();
        Matrix matrixResult = solver.getMatrix();
        int[] result = new int[9];
        int k = 0;
        //parse matrix to one dimensional array
        for (int y = 0; y < matrixResult.getHeight(); y++) {
            for (int x = 0; x < matrixResult.getWidth(); x++) {
                result[k] = matrixResult.getCell(
                        new Coordinates(x, y)).getCurrentValue();
                k++;
            }
        }
        int[] expResult = {6, 0, 9,
                        2, 0, 0,
                        1, 0, 0};
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of solveGame method, of class HidatoSolver.
     */
    @Test
    public void testSolveGame() {
        System.out.println("solveGame");
        int[] values = {6, 0, 9,
                        0, 0, 0,
                        1, 0, 0};
        /*int[] values = {0,0,73,75,0,0,0,79,0,0,0,38,0,0,77,0,44,81,36,0,67,0,0,0,0,0,6,0,0,0,0,1,46,0,5,0,0,34,0,0,49,0,0,0,8,0,33,0,31,53,52,0,0,9,63,0,0,56,0,0,19,10,0,60,61,0,0,0,25,0,11,0,0,0,0,0,26,23,12,13,0};*/
        Matrix matrix = new Matrix(3, 3, values);
        Game game = new HidatoGame(new HidatoConstraint(), matrix);
        HidatoSolver solver = new HidatoSolver();
        Matrix matrixResult = solver.solveGame(game).getGameMatrix();
        int[] result = new int[9];
        int k = 0;
        //parse matrix to one dimensional array
        for (int y = 0; y < matrixResult.getHeight(); y++) {
            for (int x = 0; x < matrixResult.getWidth(); x++) {
                result[k] = matrixResult.getCell(
                        new Coordinates(x, y)).getCurrentValue();
                k++;
            }
        }
        int[] expResult = {6, 7, 9,
                        2, 5, 8,
                        1, 3, 4};
        assertArrayEquals(expResult, result);
    }
}