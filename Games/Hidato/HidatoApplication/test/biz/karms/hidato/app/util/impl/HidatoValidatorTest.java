package biz.karms.hidato.app.util.impl;

import biz.karms.hidato.app.game.impl.HidatoGame;
import com.masprop.cluster1.shared.model.Game;
import com.masprop.cluster1.shared.model.Matrix;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Matus Pleva
 */
public class HidatoValidatorTest {

    public HidatoValidatorTest() {
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
     * Test of validateGame method, of class HidatoValidator.
     */
    @Test
    public void testValidateGame() {
        System.out.println("validateGame");
        //filled, value appears more than once
        int[] values = {6, 7, 9,
                        5, 4, 8,
                        1, 3, 3};
        Matrix matrix = new Matrix(3, 3, values);
        Game game = new HidatoGame(new HidatoConstraint(), matrix);
        HidatoValidator validator = new HidatoValidator();
        assertFalse(validator.validateGame(game));
        //filled, does not contain values from 1 to max
        int[] values1 = {6, 7, 10,
                         5, 4, 8,
                         1, 2, 3};
        Matrix matrix1 = new Matrix(3, 3, values1);
        Game game1 = new HidatoGame(new HidatoConstraint(), matrix1);
        assertFalse(validator.validateGame(game1));
        //filled, cells are not consecutive
        int[] values2 = {6, 7, 9,
                         5, 4, 8,
                         1, 3, 2};
        Matrix matrix2 = new Matrix(3, 3, values2);
        Game game2 = new HidatoGame(new HidatoConstraint(), matrix2);
        assertFalse(validator.validateGame(game2));
        //filled, valid
        int[] values3 = {6, 7, 9,
                         5, 4, 8,
                         1, 2, 3};
        Matrix matrix3 = new Matrix(3, 3, values3);
        Game game3 = new HidatoGame(new HidatoConstraint(), matrix3);
        assertTrue(validator.validateGame(game3));
        //not filled, value appears more than once
        int[] values4 = {5, 0, 8,
                         0, 3, 0,
                         1, 1, -1};
        Matrix matrix4 = new Matrix(3, 3, values4);
        Game game4 = new HidatoGame(new HidatoConstraint(), matrix4);
        assertFalse(validator.validateGame(game4));
        //not filled, does not contain value 1
        int[] values5 = {5, 0, 8,
                         0, 3, 0,
                         0, 0, -1};
        Matrix matrix5 = new Matrix(3, 3, values5);
        Game game5 = new HidatoGame(new HidatoConstraint(), matrix5);
        assertFalse(validator.validateGame(game5));
        //not filled, 1 and 2 are not consecutive
        int[] values6 = {5, 0, 8,
                         0, 3, 2,
                         1, 0, -1};
        Matrix matrix6 = new Matrix(3, 3, values6);
        Game game6 = new HidatoGame(new HidatoConstraint(), matrix6);
        assertFalse(validator.validateGame(game6));
        //not filled, not solveable
        int[] values7 = {5, 0, 8,
                         2, 3, 0,
                         1, 0, -1};
        Matrix matrix7 = new Matrix(3, 3, values7);
        Game game7 = new HidatoGame(new HidatoConstraint(), matrix7);
        assertFalse(validator.validateGame(game7));
        //valid
        int[] values8 = {5, 0, 8,
                         0, 3, 0,
                         1, 0, -1};
        Matrix matrix8 = new Matrix(3, 3, values8);
        Game game8 = new HidatoGame(new HidatoConstraint(), matrix8);
        assertTrue(validator.validateGame(game8));
    }

}