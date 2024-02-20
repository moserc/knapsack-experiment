package Knapsack01;

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
		PlotGenerator k01BruteForceChart = new PlotGenerator("Knapsack 0/1 - Brute Force");
		PlotGenerator k01GreedyChart = new PlotGenerator("Knapsack 0/1 - Greedy");
		PlotGenerator k01DPChart = new PlotGenerator("Knapsack 0/1 - Dynamic Programming");

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
		times.add(BruteForce.bruteForceKnapsack01(knapsack5.getWeights(), knapsack5.getValues(), knapsack5.getMaxWeight(), knapsack5.getKnapsackNumber()));
		times.add(BruteForce.bruteForceKnapsack01(knapsack10.getWeights(), knapsack10.getValues(), knapsack10.getMaxWeight(),knapsack10.getKnapsackNumber()));
		times.add(BruteForce.bruteForceKnapsack01(knapsack15.getWeights(), knapsack15.getValues(), knapsack15.getMaxWeight(), knapsack15.getKnapsackNumber()));
		times.add(BruteForce.bruteForceKnapsack01(knapsack20.getWeights(), knapsack20.getValues(), knapsack20.getMaxWeight(), knapsack20.getKnapsackNumber()));
		times.add(BruteForce.bruteForceKnapsack01(knapsack25.getWeights(), knapsack25.getValues(), knapsack25.getMaxWeight(), knapsack25.getKnapsackNumber()));
		times.add(BruteForce.bruteForceKnapsack01(knapsack30.getWeights(), knapsack30.getValues(), knapsack30.getMaxWeight(), knapsack30.getKnapsackNumber()));

		//create line chart, clear the array list for the next set of times
		k01BruteForceChart.lineChart(times, "./images/k01_bruteForce.jpg");
		times.clear();

		/*
		 * 		--------------------K01 GREEDY TIMES:--------------------
		 *      --------------------Cheryl Moser--------------------
		 */
		times.add(Greedy.greedy(knapsack5));
		times.add(Greedy.greedy(knapsack10));
		times.add(Greedy.greedy(knapsack15));
		times.add(Greedy.greedy(knapsack20));
		times.add(Greedy.greedy(knapsack25));
		times.add(Greedy.greedy(knapsack30));

		k01GreedyChart.lineChart(times, "./images/k01_greedy.jpg");
		times.clear();

		/*
		 * 		--------------------DYNAMIC PROGRAMMING TIMES:--------------------
		 */

		//TODO Mycole's method calls here
		times.add(Dynamic.knapSack(knapsack5.getMaxWeight(), knapsack5.getWeights(), knapsack5.getValues(), knapsack5.getTotalItems()));
		times.add(Dynamic.knapSack(knapsack5.getMaxWeight(), knapsack10.getWeights(), knapsack10.getValues(), knapsack10.getTotalItems()));
		times.add(Dynamic.knapSack(knapsack5.getMaxWeight(), knapsack15.getWeights(), knapsack15.getValues(), knapsack15.getTotalItems()));
		times.add(Dynamic.knapSack(knapsack5.getMaxWeight(), knapsack20.getWeights(), knapsack20.getValues(), knapsack20.getTotalItems()));
		times.add(Dynamic.knapSack(knapsack5.getMaxWeight(), knapsack25.getWeights(), knapsack25.getValues(), knapsack25.getTotalItems()));
		times.add(Dynamic.knapSack(knapsack5.getMaxWeight(), knapsack30.getWeights(), knapsack30.getValues(), knapsack30.getTotalItems()));

		k01DPChart.lineChart(times, "./images/k01_dp.jpg");
		times.clear();

	}
}
