package FractionalKnapsack;

import java.util.Arrays;
import java.util.Comparator;

public class Greedy {


    // Method to solve the fractional knapsack problem
    static double knapSack(int[] values, int[] weights, int maxWeight, int totalItems) {
        double startTime = System.nanoTime();
        // Create an array to hold items with their values and weights
        Item[] items = new Item[totalItems];
        // Initialize items array with values and weights
        for (int i = 0; i < totalItems; i++) {
            items[i] = new Item(weights[i], values[i]);
        }

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

        // Fill the knapsack with items while considering their weights
        for (Item item : items) {
            if (usedCapacity + item.weight <= maxWeight) {
                usedCapacity += item.weight;
                totalValue += item.value;
            } else {
                double remainingCapacity = maxWeight - usedCapacity;
                totalValue += item.value * (remainingCapacity / item.weight);
                usedCapacity += remainingCapacity;
                break;
            }
        }
        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000;
        return timeTaken;

    }

    // Inner class representing an item with weight and value
    static class Item {
        int weight;
        int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
