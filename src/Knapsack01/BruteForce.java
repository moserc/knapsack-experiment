package Knapsack01;

public class BruteForce {

    public static double bruteForceKnapsack01(int[][] data, int capacity, int items){
        double startTime = System.nanoTime();




        double endTime = System.nanoTime();
        double timeTaken = (endTime-startTime) / 1000;

        return timeTaken;
    }

}
