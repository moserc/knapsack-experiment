package Knapsack01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Cheryl Moser
 */
public class DynamicTest {

    /**
     * Unit test for Knapsack 0-1, dynamic programming method. Test input
     * includes a maximum knapsack 'weight', and a 2D array of four items
     * input[0] = item values; input[1] = item weights.
     * @author Cheryl Moser
     */
    @Test
    public void dynamic() {
        int maxWeight = 50;
        int[][] input = {{12, 5, 13, 4}, {20, 40, 16, 9}};
        int expected = 29;
        int result = Dynamic.dynamic(input, maxWeight);
        assertEquals(expected, result);
    }
}
