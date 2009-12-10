/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.karms.hidato.app.util.impl;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.GameType;
import java.util.Random;
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
    //@Test
    public void testGenerateGame() {
        System.out.println("generateGame");
        Constraint constraint = new HidatoConstraint(GameLevelType.EASY, GameVariantImpl.RECTANGULAR_SHAPE, 3, GameType.HIDATO, 4, 4);
        HidatoGenerator generator = new HidatoGenerator();
        //Game result =
        for (int i = 0; i < 1; i++) {
            generator.generateGame(constraint);
        }
    }

    @Test
    public void testHamiltonGraph() {
        int k;
        int n = 7;
        int m = 7;
        long seed = 1;
        boolean weighted = false;
        boolean directed = true;
        int minweight = 90;
        int maxweight = 99;
        int nodei[] = new int[m + 1];
        int nodej[] = new int[m + 1];
        int weight[] = new int[m + 1];
        k = randomHamiltonGraph(n, m, seed, directed, weighted, minweight,
                maxweight, nodei, nodej, weight);
        if (k != 0) {
            System.out.println("Invalid input data, error code = " + k);
        } else {
            System.out.println("List of edges:\n from to weight");
            for (k = 1; k <= m; k++) {
                System.out.println(" " + nodei[k] + " " + nodej[k] +
                        " " + weight[k]);
            }
        }
    }

    @Test
    public void testHamiltonCircle() {
        int n = 20, m = 30;
        int cycle[] = new int[n + 1];
        int nodei[] = {0, 5, 2, 4, 1, 3, 2, 4, 1, 3, 5, 11, 9, 7, 10, 13, 12,
            10, 7, 15, 14, 19, 17, 13, 16, 20, 17, 18, 15, 18, 16};
        int nodej[] = {0, 1, 3, 5, 2, 4, 7, 9, 6, 8, 10, 6, 14, 12, 15, 8, 6,
            11, 13, 9, 8, 14, 12, 18, 11, 19, 16, 19, 20, 17, 20};
        boolean directed = false;
        hamiltonCycle(n, m, directed, nodei, nodej, cycle);
        if (cycle[0] != 0) {
            System.out.println("No Hamilton cycle is found.");
        } else {
            System.out.println("A Hamilton cycle is found:");
            for (int i = 1; i <= n; i++) {
                System.out.print(" " + cycle[i]);
            }
            System.out.println();
        }
    }

    public void hamiltonCycle(int n, int m, boolean directed, int nodei[], int nodej[], int cycle[]) {
        int i, j, k, stacklen, lensol, stackindex, len, len1, len2, low, up;
        int firstedges[] = new int[n + 2];
        int endnode[] = new int[m + m + 1];
        int stack[] = new int[m + m + 1];
        boolean connect[] = new boolean[n + 1];
        boolean join, skip;
        // set up the forward star representation of the graph
        k = 0;
        for (i = 1; i <= n; i++) {
            firstedges[i] = k + 1;
            for (j = 1; j <= m; j++) {
                if (nodei[j] == i) {
                    k++;
                    endnode[k] = nodej[j];
                }
                if (!directed) {
                    if (nodej[j] == i) {
                        k++;
                        endnode[k] = nodei[j];
                    }
                }
            }
        }
        firstedges[n + 1] = k + 1;
        // initialize
        lensol = 1;
        stacklen = 0;
        // find the next node
        while (true) {
            if (lensol == 1) {
                stack[1] = 1;
                stack[2] = 1;
                stacklen = 2;
            } else {
                len1 = lensol - 1;
                len2 = cycle[len1];
                for (i = 1; i <= n; i++) {
                    connect[i] = false;
                    low = firstedges[len2];
                    up = firstedges[len2 + 1];
                    if (up > low) {
                        up--;
                        for (k = low; k <= up; k++) {
                            if (endnode[k] == i) {
                                connect[i] = true;
                                break;
                            }
                        }
                    }
                }
                for (i = 1; i <= len1; i++) {
                    len = cycle[i];
                    connect[len] = false;
                }
                len = stacklen;
                skip = false;
                if (lensol != n) {
                    for (i = 1; i <= n; i++) {
                        if (connect[i]) {
                            len++;
                            stack[len] = i;
                        }
                    }
                    stack[len + 1] = len - stacklen;
                    stacklen = len + 1;
                } else {
                    for (i = 1; i <= n; i++) {
                        if (connect[i]) {
                            if (!directed) {
                                if (i > cycle[2]) {
                                    stack[len + 1] = len - stacklen;
                                    stacklen = len + 1;
                                    skip = true;
                                    break;
                                }
                            }
                            join = false;
                            low = firstedges[i];
                            up = firstedges[i + 1];
                            if (up > low) {
                                up--;
                                for (k = low; k <= up; k++) {
                                    if (endnode[k] == 1) {
                                        join = true;
                                        break;
                                    }
                                }
                            }
                            if (join) {
                                stacklen += 2;
                                stack[stacklen - 1] = i;
                                stack[stacklen] = 1;
                            } else {
                                stack[len + 1] = len - stacklen;
                                stacklen = len + 1;
                            }
                            skip = true;
                            break;
                        }
                    }
                    if (!skip) {
                        stack[len + 1] = len - stacklen;
                        stacklen = len + 1;
                    }
                }
            }
            // search further
            while (true) {
                stackindex = stack[stacklen];
                stacklen--;
                if (stackindex == 0) {
                    lensol--;
                    if (lensol == 0) {
                        cycle[0] = 1;
                        return;
                    }
                    continue;
                } else {
                    cycle[lensol] = stack[stacklen];
                    stack[stacklen] = stackindex - 1;
                    if (lensol == n) {
                        cycle[0] = 0;
                        return;
                    }
                    lensol++;
                    break;
                }
            }
        }
    }

    public int randomHamiltonGraph(int n, int m, long seed, boolean directed, boolean weighted, int minweight, int maxweight, int nodei[], int nodej[], int weight[]) {
        int k, maxedges, nodea, nodeb, numedges, temp;
        int permute[] = new int[n + 1];
        boolean adj[][] = new boolean[n + 1][n + 1];
        Random ran = new Random(seed);
// initialize the adjacency matrix
        for (nodea = 1; nodea <= n; nodea++) {
            for (nodeb = 1; nodeb <= n; nodeb++) {
                adj[nodea][nodeb] = false;
            }
        }
// adjust value of m if needed
        if (m < n) {
            return 1;
        }
        maxedges = n * (n - 1);
        if (!directed) {
            maxedges /= 2;
        }
        if (m > maxedges) {
            return 2;
        }
        numedges = 0;
// generate a random permutation
        randomPermutation(n, ran, permute);
// obtain the initial cycle
        for (k = 1; k <= n; k++) {
            if (k == n) {
                nodea = permute[n];
                nodeb = permute[1];
            } else {
                nodea = permute[k];
                nodeb = permute[k + 1];
            }
            numedges++;
            nodei[numedges] = nodea;
            nodej[numedges] = nodeb;
            adj[nodea][nodeb] = true;
            if (!directed) {
                adj[nodeb][nodea] = true;
            }
            if (weighted) {
                weight[numedges] = (int) (minweight +
                        ran.nextDouble() * (maxweight + 1 - minweight));
            }
        }
// add the remaining edges randomly
        while (numedges < m) {
            nodea = ran.nextInt(n) + 1;
            nodeb = ran.nextInt(n) + 1;
            if (nodea == nodeb) {
                continue;
            }
            if ((nodea > nodeb) && (!directed)) {
                temp = nodea;
                nodea = nodeb;
                nodeb = temp;
            }
            if (!adj[nodea][nodeb]) {
                numedges++;
                nodei[numedges] = nodea;
                nodej[numedges] = nodeb;
                adj[nodea][nodeb] = true;
                if (weighted) {
                    weight[numedges] = (int) (minweight +
                            ran.nextDouble() * (maxweight + 1 - minweight));
                }
            }
        }
        return 0;
    }

    public static void randomPermutation(int n, Random ran, int perm[]) {
        int i, j, k;
        for (i = 1; i <= n; i++) {
            perm[i] = i;
        }
        for (i = 1; i <= n; i++) {
            j = (int) (i + ran.nextDouble() * (n + 1 - i));
            k = perm[i];
            perm[i] = perm[j];
            perm[j] = k;
        }
    }
}
