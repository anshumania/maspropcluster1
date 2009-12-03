package biz.karms.hidato.app.game.impl;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Matus Pleva
 */
public class HidatoGameTest {

    public HidatoGameTest() {
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
     * Test of getSolutions method, of class HidatoGame.
     */
    @Test
    public void testGetSolutions() {
        System.out.println("getSolutions");
        int[] values1 = {6, 7, 9,
            0, 5, 8,
            1, 0, 0};
        Matrix matrix1 = new Matrix(3, 3, values1);
        int[] values2 = {6, 7, 9,
            4, 5, 8,
            1, 9, 11};
        Matrix matrix2 = new Matrix(3, 3, values2);
        List<Matrix> list = new ArrayList<Matrix>();
        list.add(matrix1);
        list.add(matrix2);
        HidatoGame game = new HidatoGame(new Constraint(), null, 264,
                list);
        List expResult = new ArrayList<Matrix>();
        expResult.add(matrix1);
        expResult.add(matrix2);
        List result = game.getSolutions();
        assertEquals(expResult.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expResult.get(i), result.get(i));
        }


    }

    /**
     * Test of setSolutions method, of class HidatoGame.
     */
    @Test
    public void testSetSolutions() {
        System.out.println("setSolutions");
        HidatoGame game = new HidatoGame(new Constraint(), null);
        int[] values1 = {6, 7, 9,
            0, 5, 8,
            1, 0, 0};
        Matrix matrix1 = new Matrix(3, 3, values1);
        int[] values2 = {6, 7, 9,
            4, 5, 8,
            1, 9, 11};
        Matrix matrix2 = new Matrix(3, 3, values2);
        List<Matrix> list = new ArrayList<Matrix>();
        list.add(matrix1);
        list.add(matrix2);
        game.setSolutions(list);
        assertEquals(list.size(), game.getSolutions().size());
        for (int i = 0; i < game.getSolutions().size(); i++) {
            assertEquals(list.get(i), game.getSolutions().get(i));
        }
    }
}
