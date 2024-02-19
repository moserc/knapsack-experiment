/**
 * Author: Angela Fujihara
 *
 */
package FractionalKnapsack;

import java.util.Arrays;

public class BruteForce {

    /**
     * Class constructor
     */
    public BruteForce() {

    }

    /**
     * A brute force fractional knapsack algorithm
     * @param values - an int[] that holds the values of the items being passed into the knapsack
     * @param weights - an int[] that holds the weights of the items being passed into the knapsack
     * @param maxWeight - The max capacity that the knapsack can hold
     * @param totalItems - The number of items being passed into the knapsack
     * @return - A double that represents the time complexity of the algorithm
     */
    static double knapSack(int[] values, int[] weights, int maxWeight, int totalItems) {
        double startTime = System.nanoTime();
        double maxTotalValue  = 0;
        int[] bestCombination = new int[totalItems];

        // Generate all possible combinations, using bitwise left shift
        for (int i = 0; i < (1 << totalItems); i++) {
            double totalValue  = 0;
            double totalWeight = 0;

            for (int j = 0; j < totalItems; j++) {
                if ((i & (1 << j)) > 0) {
                    if (totalWeight + weights[j] <= maxWeight) {
                        totalValue  += values[j];
                        totalWeight += weights[j];
                    } else {
                        double remainingWeight = maxWeight - totalWeight;
                        totalValue  += values[j] * (remainingWeight / weights[j]);
                        totalWeight += remainingWeight;
                    }
                }
            }

            if (totalValue > maxTotalValue) {
                maxTotalValue = totalValue;
                bestCombination = Arrays.copyOfRange(weights, 0, totalItems);
            }
        }

        double endTime = System.nanoTime();

        return (endTime - startTime) / 1000;
    }


}
