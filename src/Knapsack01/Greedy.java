package Knapsack01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Class containing the method for performing a greedy solution to the
 * Knapsack 0-1 problem.
 * @author Cheryl Moser
 */
public class Greedy {

    /**
     * The greedy method for solving the Knapsack 0-1 problem. This method is
     * not guaranteed to return optimal results, especially with larger input
     * arrays. The associated JUnit tests confirm that with an input array of
     * size 30, it does not report the optimal solution; however, with an array
     * of size 5, it does. I used an <a href="https://augustineaykara.github.io/Knapsack-Calculator/">
     * online K01 calculator</a> to retrieve the optimal solution to the input
     * array proposed in testGreedyLarge. The reason for this is because the
     * greedy method does not consider combinations of items; instead, it puts
     * items into the knapsack sequentially by highest value until the weight
     * limit is met.
     *
     * @param weights A list of weights for each item in the knapsack.
     * @param values A list of values for each item in the knapsack.
     * @param limit The capacity of the knapsack.
     * @return runtime in microseconds.
     * @author Cheryl Moser
     */
    public static double greedy(int[] weights, int[] values, int limit) {

        //capture start time
        long t0 = System.nanoTime();

        //create a priority queue to hold items, sort in decreasing order by
        //item benefit (key)
        PriorityQueue<Map.Entry<Integer,Integer>> items = new PriorityQueue<>(
                //custom comparator via lambda expression
                (a,b) -> b.getKey() - a.getKey()
        );

        //add values and weights as key:value pair to priority queue
        for (int i = 0; i < weights.length; i++){//O(n)
            items.offer(Map.entry(values[i], weights[i]));
        }

        //initialize the total weight and value counts
        int totWeight = 0;
        int totValue = 0;

        //arraylist to hold knapsack contents
        List<Map.Entry<Integer, Integer>> knapsackContents = new ArrayList<>();

        //iterate through the queue until it is empty, or until the weight
        //limit is met
        while (!items.isEmpty() && totWeight < limit){

            //dequeue in sorted order (use poll, not remove)
            Map.Entry<Integer, Integer> item = items.poll();

            int itemWeight = item.getValue();

            //if the added item weight is less than or equal to the limit, add it
            //otherwise, move on to the next item
            if (totWeight+itemWeight <= limit){
                //update total value
                totValue += item.getKey();
                //update total weight
                totWeight += itemWeight;
                knapsackContents.add(item);
            }
        }

        //capture end time
        long t1 = System.nanoTime();
        //convert to microseconds
        double runtime = (t1 - t0)/1000.0;

        //report total weight and total value of the knapsack
        //Knapsack Number Knapsack Capacity Printout of Values Printout of Weights
        System.out.println("Knapsack Items: ");
        for (Map.Entry<Integer, Integer> entry : knapsackContents){
            System.out.println("Item Value: "+entry.getKey()+"; Item Weight: "+entry.getValue());
        }

        System.out.println("\nK01-greedy Totals:\nTotal Weight = "+totWeight+
                "\nTotal Value = "+totValue+"\n");
        System.out.println("Runtime: "+runtime+"ms");

        //return runtime
        return runtime;

    }//end greedy
}//end class
