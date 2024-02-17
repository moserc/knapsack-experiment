package FractionalKnapsack;

import ProjectTools.CsvReader;
import ProjectTools.Knapsack;
import ProjectTools.PlotGenerator;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //TODO make "knapsack number" an element of the knapsack class?

        /*
		--------------------PLOT GENERATION:--------------------
		*/
        //chart instantiation
        PlotGenerator fracKBruteForceChart = new PlotGenerator("Fractional Knapsack - Brute Force");
        PlotGenerator fracKGreedyChart = new PlotGenerator("Fractional Knapsack - Greedy");
        PlotGenerator fracKDPChart = new PlotGenerator("Fractional Knapsack - Dynamic Programming");

        //the line below is arbitrary and for testing-only, replace with a
        //double[] holding actual times for each algorithm
        double[] times = {10.2, 15.5, 20.1, 25.3, 30.2, 40.8};

        //chart construction and jpg output
        fracKBruteForceChart.lineChart(times, "./images/fracK_bruteForce.jpg");
        fracKGreedyChart.lineChart(times, "./images/fracK_greedy.jpg");
        fracKDPChart.lineChart(times, "./images/fracK_dp.jpg");
        /*
		--------------------END PLOT GENERATION:--------------------
		*/

        //for all below, I just made a wild guess as to what data structures we'll be using
        /*
        //Printout for each knapsack object
        System.out.println("KnapSack Number: " + item.Number);
        System.out.println("KnapSack item values: " + item.values);
        System.out.println("KnapSack item weights: " + item.keys);

        //Printout for overall best values
        System.out.println("Best value for Brute Force: " + Math.max(some array of values returned by brute force method));
        System.out.println("Best value for Dynamic Programming: " + Math.max(some array of values returned by greedy method));
        System.out.println("Best value for Greedy Algorithm: " + Math.max(some array of values returned by dp method));
        */


        File file1 = new File("inputs.csv");
        File file2 = new File("inputs2.csv");
        File file3 = new File("inputs3.csv");
        CsvReader csvReader = new CsvReader(file1);

        Knapsack knapsack1 = csvReader.getKnapsack();
        Double greedyFractional = Greedy.knapSack(knapsack1.getValues(), knapsack1.getWeights(), knapsack1.getMaxWeight(), knapsack1.getTotalItems());

    }
}
