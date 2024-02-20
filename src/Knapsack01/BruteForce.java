package Knapsack01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import com.google.common.collect.Sets;

/**
 * Class that will hold the workings of the brute force approach for the 01knapsack
 * (made by Ashtin)
 */

public class BruteForce {

    /**
     * Method that will find the highest profit while staying in the capacity range for the 01knapsack.
     * @param weights an integer array that holds all the weights for the items in the knapsack.
     * @param values an integer array that holds all the values for the items in the knapsack.
     * @param capacity the maximum weight you are able to hold.
     * @return a double representing the time taken to solve this problem using brute force.
     */
    public static double bruteForceKnapsack01(int[] weights, int[] values, int capacity, int knapsackNumber) {
        System.out.println("------------Brute Force 01Knapsack for " + weights.length + " items------------");
        System.out.println("Knapsack Number: " + knapsackNumber);
        System.out.println("Values in this knapsack are: " + Arrays.toString(values));
        System.out.println("Weights in this knapsack are: " + Arrays.toString(weights));
        System.out.println("~~~Solution~~~");
        System.out.println("Max weight: " + capacity);
        double startTime = System.nanoTime();
        Set<Item> items = new HashSet<>();


        ArrayList<Integer> weightsUsed = new ArrayList<>();
        ArrayList<Integer> valuesUsed = new ArrayList<>();
        int totalWeight = 0;
        int totalValue = 0;
        int bestValue = Integer.MIN_VALUE;
        Set<Item> bestChoice = new HashSet<>();

        for(int i =0; i < weights.length; i++){
            items.add(new Item(weights[i], values[i]));
        }

        Set<Set<Item>> powerSet = Sets.powerSet(items);

        for(Set<Item> s : powerSet){
            for(Item x : s){
                totalWeight += x.weight;
                totalValue += x.value;
            }
            if(totalWeight <= capacity && totalValue > bestValue){
                bestValue = totalValue;
                bestChoice = s;
            }
            totalWeight = 0;
            totalValue = 0;
        }

        for(Item x : bestChoice){
            totalWeight += x.weight;
            totalValue += x.value;
            weightsUsed.add(x.weight);
            valuesUsed.add(x.value);
        }



        double endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000;

        System.out.println("Total Weight:  " + totalWeight + "     Weights Used: " + weightsUsed);

        System.out.println("Total Profit:  " + totalValue + "     Values Used: " + valuesUsed);
        System.out.println("Runtime: " + timeTaken);
        System.out.println();

        return timeTaken;
    }
}

/**
 * Inner class used to hold workings of item object
 */
class Item {
    int weight;
    int value;

    /**
     * constructor for the item object.
     * @param weight weight of the item.
     * @param value value of the item.
     */
    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item Weight: " + weight + "\n Item Value: " + value;
    }
}








