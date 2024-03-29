package Knapsack01;

import java.util.Arrays;

public class Dynamic {
    /**
     * Solves the 0/1 Knapsack problem using dynamic programming.
     *
     * @param W   The maximum weight the knapsack can carry.
     * @param wt  Array containing the weights of the items.
     * @param val Array containing the values of the items.
     * @param n   The number of items.
     * @param knapsackNumber The number identifier for the knapsack.
     * @return The maximum value that can be achieved within the given weight limit.
     */
    public static double knapSack(int W, int[] wt, int[] val, int n, int knapsackNumber) {
        System.out.println("------------Dynamic 01Knapsack for " + wt.length + " items------------");
        System.out.println("Knapsack Number: " + knapsackNumber);
        System.out.println("Values in this knapsack are: " + Arrays.toString(val));
        System.out.println("Weights for this knapsack are: " + Arrays.toString(wt));

        // Start time for performance measurement
        double startTime = System.nanoTime();

        // Table to store the maximum value that can be achieved using the first i items and weight j
        int[][] dp = new int[n + 1][W + 1];

        // Build the table dp[][] in bottom up manner
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0; // Base case: no item or no capacity
                else if (wt[i - 1] <= w)
                    // Include the current item in the knapsack or exclude it
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    // Can't include the current item due to weight constraints
                    dp[i][w] = dp[i - 1][w];
            }
        }
        // The last cell of the table contains the answer
        int answer = dp[n][W];

        // End time for performance measurement
        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1_000_000; // Convert to milliseconds

        return timeTaken; // Return the time taken for the computation
    }
}
