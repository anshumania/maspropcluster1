/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biz.karms.hidato.app.util.impl;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.GameType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author matusko
 */
public class HidatoGeneratorTest {

    public HidatoGeneratorTest() {
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
     * Test of generateGame method, of class HidatoGenerator.
     */
    @Test
    public void testGenerateGame() {
        System.out.println("generateGame");
        Constraint constraint = new HidatoConstraint(GameLevelType.EASY, GameVariantImpl.RECTANGULAR_SHAPE, 3, GameType.HIDATO, 6, 6);
        HidatoGenerator generator = new HidatoGenerator();
        //Game result =
        for (int i=0;i<1;i++) {
            generator.generateGame(constraint);
        }
    }

}