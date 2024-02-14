package Knapsack01;


import java.util.HashSet;
import java.util.Set;
import com.google.common.collect.Sets;

public class BruteForce {

    public static double bruteForceKnapsack01(int[] weights, int[] values, int capacity) {
        double startTime = System.nanoTime();
        Set<Item> items = new HashSet<>();
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
        System.out.println(bestChoice);



        double endTime = System.nanoTime();
        double timeTaken = (endTime -startTime) / 1000;
        return timeTaken;
    }


}


class Item {
    int weight;
    int value;
    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}






// ----------POSSIBLE SOLUTION----------------- (does not take long though)

//        if(items ==0 || capacity== 0){
//            return 0;
//        }
//        if(weights[items - 1] > capacity){
//            return bruteForceKnapsack01(weights,values,capacity,items - 1);
//
//        }else{
//            return Math.max(values[items -1] + bruteForceKnapsack01(weights,values,capacity -weights[items -1], items -1),
//                    bruteForceKnapsack01(weights,values,capacity,items - 1));
//        }


