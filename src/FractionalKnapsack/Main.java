package FractionalKnapsack;

import ProjectTools.CsvReader;
import ProjectTools.Knapsack;
import ProjectTools.PlotGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Data structure to hold runtimes for graph generation
        ArrayList<Double> times = new ArrayList<>();

        //line chart instantiation
        PlotGenerator fracKBruteForceChart = new PlotGenerator("Fractional Knapsack - Brute Force");
        PlotGenerator fracKGreedyChart = new PlotGenerator("Fractional Knapsack - Greedy");
        PlotGenerator fracKDPChart = new PlotGenerator("Fractional Knapsack - Dynamic Programming");

        File file1 = new File("src/Inputs/inputs.csv");
        File file2 = new File("src/Inputs/inputs2.csv");
        File file3 = new File("src/Inputs/inputs3.csv");
        File file4 = new File("src/Inputs/inputs4.csv");
        File file5 = new File("src/Inputs/inputs5.csv");
        File file6 = new File("src/Inputs/inputs6.csv");

        CsvReader csvReader1 = new CsvReader(file1);
        CsvReader csvReader2 = new CsvReader(file2);
        CsvReader csvReader3 = new CsvReader(file3);
        CsvReader csvReader4 = new CsvReader(file4);
        CsvReader csvReader5 = new CsvReader(file5);
        CsvReader csvReader6 = new CsvReader(file6);

        Knapsack knapsack5 = csvReader1.getKnapsack();
        Knapsack knapsack10 = csvReader2.getKnapsack();
        Knapsack knapsack15 = csvReader3.getKnapsack();
        Knapsack knapsack20 = csvReader4.getKnapsack();
        Knapsack knapsack25 = csvReader5.getKnapsack();
        Knapsack knapsack30 = csvReader6.getKnapsack();

        /*
         * 		--------------------BRUTE FORCE TIMES:--------------------
         */


        times.add(FractionalKnapsack.BruteForce.knapSack(knapsack5.getValues(), knapsack5.getWeights(), knapsack5.getMaxWeight(), knapsack5.getTotalItems(), knapsack5.getKnapsackNumber()));
        times.add(FractionalKnapsack.BruteForce.knapSack(knapsack10.getValues(), knapsack10.getWeights(), knapsack10.getMaxWeight(), knapsack10.getTotalItems(), knapsack10.getKnapsackNumber()));
        times.add(FractionalKnapsack.BruteForce.knapSack(knapsack15.getValues(), knapsack15.getWeights(), knapsack15.getMaxWeight(), knapsack15.getTotalItems(), knapsack15.getKnapsackNumber()));
        times.add(FractionalKnapsack.BruteForce.knapSack(knapsack20.getValues(), knapsack20.getWeights(), knapsack20.getMaxWeight(), knapsack20.getTotalItems(), knapsack20.getKnapsackNumber()));
        times.add(FractionalKnapsack.BruteForce.knapSack(knapsack25.getValues(), knapsack25.getWeights(), knapsack25.getMaxWeight(), knapsack25.getTotalItems(), knapsack25.getKnapsackNumber()));
        times.add(FractionalKnapsack.BruteForce.knapSack(knapsack5.getValues(), knapsack30.getWeights(), knapsack30.getMaxWeight(), knapsack30.getTotalItems(), knapsack30.getKnapsackNumber()));


        //create line chart, clear the array list for the next set of times
        fracKBruteForceChart.lineChart(times, "./images/fracK_bruteForce.jpg");
        times.clear();

        /*
         * 		--------------------GREEDY TIMES:--------------------
         */

        //TODO Angela method calls here

        times.add(FractionalKnapsack.Greedy.knapSack(knapsack5.getValues(), knapsack5.getWeights(), knapsack5.getMaxWeight(), knapsack5.getTotalItems(), knapsack5.getKnapsackNumber()));
        times.add(FractionalKnapsack.Greedy.knapSack(knapsack10.getValues(), knapsack10.getWeights(), knapsack10.getMaxWeight(), knapsack10.getTotalItems(), knapsack10.getKnapsackNumber()));
        times.add(FractionalKnapsack.Greedy.knapSack(knapsack15.getValues(), knapsack15.getWeights(), knapsack15.getMaxWeight(), knapsack15.getTotalItems(), knapsack15.getKnapsackNumber()));
        times.add(FractionalKnapsack.Greedy.knapSack(knapsack20.getValues(), knapsack20.getWeights(), knapsack20.getMaxWeight(), knapsack20.getTotalItems(), knapsack20.getKnapsackNumber()));
        times.add(FractionalKnapsack.Greedy.knapSack(knapsack25.getValues(), knapsack25.getWeights(), knapsack25.getMaxWeight(), knapsack25.getTotalItems(), knapsack25.getKnapsackNumber()));
        times.add(FractionalKnapsack.Greedy.knapSack(knapsack5.getValues(), knapsack30.getWeights(), knapsack30.getMaxWeight(), knapsack30.getTotalItems(), knapsack30.getKnapsackNumber()));

        //create line chart, clear the array list for the next set of times
        fracKGreedyChart.lineChart(times, "./images/fracK_greedy.jpg");
        times.clear();

        /*
         * 		--------------------DYNAMIC PROGRAMMING TIMES:--------------------
         */

        //TODO Mycole's method calls here

        fracKDPChart.lineChart(times, "./images/fracK_dp.jpg");
        times.clear();

    }
}
