package FractionalKnapsack;


import java.util.Arrays;
import java.util.Comparator;

public class Dynamic {

    /**
     *@author Mycole Brown
     * We solve the fractional knapsack problem using dynamic programming.
     * In the fractional knapsack problem, we can take fractions of items
     * to maximize the total value within a weight constraint.
     */


        /**
         * We represent an item that can be included in the knapsack with its associated value and weight.
         */
        static class Item {
            int value;
            int weight;

            /**
             * Constructs a new Item object.
             *
             * @param value The value associated with the item.
             * @param weight The weight associated with the item.
             */
            public Item(int value, int weight) {
                this.value = value;
                this.weight = weight;
            }
        }

        /**
         * Finds the maximum achievable value for the fractional knapsack problem.
         *
         * @param items An array of Item objects representing the potential items for the knapsack.
         * @param capacity The total weight capacity of the knapsack.
         * @return The maximum value that can be obtained within the weight constraint.
         */
        public static double fractionalKnapsack(Item[] items, int capacity) {
            // Sort items based on value-to-weight ratio in descending order
            Arrays.sort(items, Comparator.comparing((Item item) -> item.value / (double) item.weight).reversed());

            int numItems = items.length;
            double[][] dp = new double[numItems + 1][capacity + 1];

            // Fill the DP table
            for (int i = 1; i <= numItems; i++) {
                for (int j = 1; j <= capacity; j++) {
                    if (items[i - 1].weight > j) {
                        dp[i][j] = dp[i - 1][j]; // Item can't fit
                    } else {
                        double fraction = Math.min(1, (double) j / items[i - 1].weight);
                        dp[i][j] = Math.max(dp[i - 1][j],  // Exclude current item
                                items[i - 1].value * fraction + dp[i - 1][j - (int) (items[i - 1].weight * fraction)]);
                    }
                }
            }

            return dp[numItems][capacity]; // Here we have the optimal value
        }




}
