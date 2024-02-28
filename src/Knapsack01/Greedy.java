package Knapsack01;

import ProjectTools.Knapsack;

import java.util.*;

/**
 * Class containing the method for performing a greedy solution to the
 * Knapsack 0-1 problem.
 * @author Cheryl Moser
 */
public class Greedy {

    /**
     * The greedy method for solving the Knapsack 0-1 problem. This method is
     * not guaranteed to return optimal results, especially with larger input
     * arrays. The reason for this is because the greedy method does not consider
     * all combinations of items; instead, it puts items into the knapsack
     * sequentially by highest value-to-weight ratio until the weight limit is met.
     *
     * @param object The knapsack object
     * @return runtime
     * @author Cheryl Moser
     */
    public static double greedy(Knapsack object) {

        //capture start time
        long t0 = System.nanoTime();

        int[] weights = object.getWeights();
        int[] values = object.getValues();
        int limit = object.getMaxWeight();

        //output
        System.out.println("--------------Greedy 01Knapsack--------------\n");
        System.out.println("Knapsack number: " + object.getKnapsackNumber() +
                "\nNumber of item options: " + object.getTotalItems() +
                "\nWeight Capacity: " + object.getMaxWeight());

        //create a priority queue to hold items, sort in non-increasing order by
        //item benefit (value/weight): O(1)
        PriorityQueue<Map.Entry<Integer,Integer>> items = new PriorityQueue<>(
                //custom comparator via lambda expression ordering by
                //item benefit (value per unit of weight)
                (a,b) -> {
                    double benefitA = (double) a.getKey() / a.getValue();
                    double benefitB = (double) b.getKey() / b.getValue();
                    //workaround to return an integer representation of the
                    //difference between a & b; otherwise the division returns
                    //a double much to small to cast to int
                    return (int) ((benefitB - benefitA) * 1000);
                }
        );

        //add values and weights as key:value pair to priority queue.
        //worst case O(n): depends on the length of the weights list
        System.out.println("Item options (value, weight, value per unit of weight):");
        for (int i = 0; i < weights.length; i++){
            items.offer(Map.entry(values[i], weights[i]));
            double benefit = (double) values[i] / weights[i];
            System.out.println(i+1 + ". ("+values[i] + ", " + weights[i] + ", " + String.format("%.3f", benefit) + ")");
        }

        //initialize the total weight and value counts
        int totWeight = 0;
        int totValue = 0;

        //hash set to hold contents of the optimized knapsack
        HashSet<Map.Entry<Integer, Integer>> knapsackContents = new HashSet<>();

        //iterate through the queue until it is empty, or until the weight
        //limit is met. O(n) if items size and weight limit are huge
        while (!items.isEmpty() && totWeight < limit){

            //dequeue in sorted order. O(log n): priority queue = binary heap
            // = halved operations involved in the reordering that occurs after
            //the dequeue.
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

        //create iterator for knapsack items, plus two string builders to hold
        //the knapsack items by item and weight for bonus output
        Iterator<Map.Entry<Integer, Integer>> iterator = knapsackContents.iterator();
        StringBuilder valueOutput = new StringBuilder();
        StringBuilder weightOutput = new StringBuilder();
        StringBuilder benefitOutput = new StringBuilder();

        //iterate through the optimized knapsack and attach item elements to
        //their associated strings
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            valueOutput.append(entry.getKey());
            weightOutput.append(entry.getValue());
            benefitOutput.append(String.format("%.3f", (double) entry.getKey()/entry.getValue()));
            if (iterator.hasNext()){
                valueOutput.append(", ");
                weightOutput.append(", ");
                benefitOutput.append(", ");
            }
        }

        //printed output
        System.out.println("Knapsack Best Value: " + totValue +
                "\nKnapsack Best Weight: " + totWeight +
                "\nKnapsack contains items with values of (" + valueOutput +
                ")\nweights of (" + weightOutput +
                ")\nand benefit ratios of (" + benefitOutput + ")");

        //capture end time
        long t1 = System.nanoTime();
        //convert to microseconds
        double runtime = (t1 - t0)/1000.0;
        System.out.println("Runtime: " + runtime + " ms\n");

        return runtime;

    }//end greedy
}//end class
