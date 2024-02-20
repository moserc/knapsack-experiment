package FractionalKnapsack;
/**
 * Author: Angela Fujihara
 */

import java.util.Arrays;
import java.util.Comparator;

public class Greedy {

    /**
     * Knapsack method that accepts two 1D int[] of values and weights, and decides what to
     * keep based off the greedy approach
     * @param values - an int[] containing the values of the items
     * @param weights - an int[] containing the weights of the items
     * @param maxWeight - the max weight of the knapsack
     * @param totalItems - the total number of items coming into the algorithm, used to create
     *                   an appropriately sized array
     * @return - a double that contains the time complexity for the algorithm
     */
    // Method to solve the fractional knapsack problem
    static double knapSack(int[] values, int[] weights, int maxWeight, int totalItems, int knapsackNumber) {
        System.out.println("------------Greedy Fractional Knapsack for " + weights.length + " items------------");
        System.out.println("Knapsack Number: " + knapsackNumber);
        System.out.println("Values in this knapsack are: " + Arrays.toString(values));
        System.out.println("Weights in this knapsack are: " + Arrays.toString(weights));
        System.out.println("~~~Solution~~~");
        System.out.println("Max weight: " + maxWeight);
        double startTime = System.nanoTime();
        // Create an array to hold items with their values and weights
        Item[] items = new Item[totalItems];
        // Initialize items array with values and weights
        for (int i = 0; i < totalItems; i++) {
            items[i] = new Item(weights[i], values[i]);
        }
        /**
         * anonymous subclass that compares the weights and values of each item
         */
        // Comparator to sort items based on value-to-weight ratio in descending order
        Comparator<Item> comparator = new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double ratio1 = (double) o1.value / o1.weight;
                double ratio2 = (double) o2.value / o2.weight;
                if (ratio2 > ratio1) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        // Sort items array based on value-to-weight ratio
        Arrays.sort(items, comparator);
        int usedCapacity = 0;
        double totalValue = 0;
        int totalWeight = 0;

        // Fill the knapsack with items while considering their weights
        for (Item item : items) {
            if (usedCapacity + item.weight <= maxWeight) {
                usedCapacity += item.weight;
                totalWeight+= item.weight;
                totalValue += item.value;
            } else {
                double remainingCapacity = maxWeight - usedCapacity;
                totalValue += item.value * (remainingCapacity / item.weight);
                totalWeight += item.weight * (remainingCapacity / item.weight);
                usedCapacity += remainingCapacity;
                break;
            }
        }
        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000;
        System.out.println("Total Weight:  " + totalWeight);
        System.out.println("Total Profit:  " + totalValue);
        System.out.println("Runtime: " + timeTaken);
        System.out.println();
        return timeTaken;

    }

    /**
     * Inner class that defines an Item
     */
    // Inner class representing an item with weight and value
    static class Item {
        int weight;
        int value;

        /**
         * constructor for Item class
         * @param weight - read in via a .csv file
         * @param value - read in via a .csv file
         */
        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
