package Knapsack01;

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
		PlotGenerator k01BruteForceChart = new PlotGenerator("Knapsack 0/1 - Brute Force");
		PlotGenerator k01GreedyChart = new PlotGenerator("Knapsack 0/1 - Greedy");
		PlotGenerator k01DPChart = new PlotGenerator("Knapsack 0/1 - Dynamic Programming");

		//the line below is arbitrary and for testing-only, replace with a
		//double[] holding actual times for each algorithm
		double[] times = {10.2, 15.5, 20.1, 25.3, 30.2, 40.8};

		//chart construction and jpg output
		k01BruteForceChart.lineChart(times, "./images/k01_bruteForce.jpg");
		k01GreedyChart.lineChart(times, "./images/k01_greedy.jpg");
		k01DPChart.lineChart(times, "./images/k01_dp.jpg");
		/*
		--------------------END PLOT GENERATION:--------------------
		*/

		//for all below, I'm just making a wild guess as to what data structures we'll be using
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

		Double brute5 = BruteForce.bruteForceKnapsack01(knapsack5.getWeights(), knapsack5.getValues(), knapsack5.getMaxWeight(), knapsack5.getKnapsackNumber());
		Double brute10 = BruteForce.bruteForceKnapsack01(knapsack10.getWeights(), knapsack10.getValues(), knapsack10.getMaxWeight(),knapsack10.getKnapsackNumber());
		Double brute15 = BruteForce.bruteForceKnapsack01(knapsack15.getWeights(), knapsack15.getValues(), knapsack15.getMaxWeight(), knapsack15.getKnapsackNumber());
		Double brute20 = BruteForce.bruteForceKnapsack01(knapsack20.getWeights(), knapsack20.getValues(), knapsack20.getMaxWeight(), knapsack20.getKnapsackNumber());
		Double brute25 = BruteForce.bruteForceKnapsack01(knapsack25.getWeights(), knapsack25.getValues(), knapsack25.getMaxWeight(), knapsack25.getKnapsackNumber());
		Double brute30 = BruteForce.bruteForceKnapsack01(knapsack30.getWeights(), knapsack30.getValues(), knapsack30.getMaxWeight(), knapsack30.getKnapsackNumber());


	}
}
