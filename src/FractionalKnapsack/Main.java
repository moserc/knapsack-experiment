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

        //TODO Angela method calls here

        //create line chart, clear the array list for the next set of times
        fracKBruteForceChart.lineChart(times, "./images/fracK_bruteForce.jpg");
        times.clear();

        /*
         * 		--------------------GREEDY TIMES:--------------------
         */

        //TODO Angela method calls here

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
