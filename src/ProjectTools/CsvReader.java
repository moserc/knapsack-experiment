/**
 * Authors: Mycole Brown and Angela Fujihara
 * 16 February 2024
 * version 1
 */

package ProjectTools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvReader {

    /**
     * A 1D Array to hold the weights of the integers being read in
     */
    int[] weightInput;
    /**
     * A 1D Array to hold the values of the integers being read in
     */
    int[] valueInput;


    Knapsack knapsack;

    /**
     * A constructor that accepts a csv file as a parameter, and reads the values to two
     * separate int[]
     *
     * @param csvFile -  A comma-delineated file of integers
     * @throws FileNotFoundException - throws exception if file is not found
     */

    public CsvReader(File csvFile) throws FileNotFoundException {

        knapsack = new Knapsack();
            Scanner textFile = new Scanner(csvFile);
            // Reads in line 1 and parses it in usable variables
            String firstRow = textFile.nextLine();
            String[] splitline1 = firstRow.split(",");

            int knapsackNumber = Integer.parseInt(splitline1[0]);
            int knapsackCapacity = Integer.parseInt(splitline1[1]);

            knapsack.setKnapsackNumber(knapsackNumber);
            knapsack.setMaxWeight(knapsackCapacity);

            knapsack = getArraysFromCSV(textFile);


            textFile.close();
            // Sort the CSV input if needed
            // Arrays.sort(csvInput);

    }

    /**
     * A method which accepts a Scanner object created in the constructor which
     * reads in the csv file
     *
     * @param textFile - The Scanner object
     */

        public Knapsack getArraysFromCSV (Scanner textFile){
            // Reads in lines 2 and 3 and parses them into usable int arrays

            String secondRow = textFile.nextLine();
            String[] splitline2 = secondRow.split(",");
            valueInput = new int[splitline2.length];
            String thirdRow = textFile.nextLine();
            String[] splitline3 = thirdRow.split(",");
            weightInput = new int[splitline3.length];

            // Parsing each index of lines 2 and 3 into int arrays
            for (int i = 0; i < splitline2.length; i++) {
                int value = Integer.parseInt(splitline2[i]);
                valueInput[i] = value;
                int weight = Integer.parseInt(splitline3[i]);
                weightInput[i] = weight;
            }

            knapsack.setValues(valueInput);
            knapsack.setWeights(weightInput);
            knapsack.setTotalItems(weightInput.length);

            return knapsack;
        }


        public Knapsack getKnapsack () {
            return knapsack;
        }

        public void setKnapsack (Knapsack knapsack){
            this.knapsack = knapsack;
        }

        public int[] getWeightInput () {
            return weightInput;
        }

        public void setWeightInput ( int[] weightInput){
            this.weightInput = weightInput;
        }

        public int[] getValueInput () {
            return valueInput;
        }

        public void setValueInput ( int[] valueInput){
            this.valueInput = valueInput;
        }

    }
//    File file1 = new File("inputs.csv");
//    File file2 = new File("inputs2.csv");
//    File file3 = new File("inputs3.csv");
//    File file4 = new File("inputs4.csv");
//    File file5 = new File("inputs5.csv");
//    File file6 = new File("inputs6.csv");
//
//    CsvReader csvReader1 = new CsvReader(file1);
//    CsvReader csvReader2 = new CsvReader(file2);
//    CsvReader csvReader3 = new CsvReader(file3);
//    CsvReader csvReader4 = new CsvReader(file4);
//    CsvReader csvReader5 = new CsvReader(file5);
//    CsvReader csvReader6 = new CsvReader(file6);
//
//    Knapsack knapsack5 = csvReader1.getKnapsack();
//    Knapsack knapsack10 = csvReader1.getKnapsack();
//    Knapsack knapsack15 = csvReader1.getKnapsack();
//    Knapsack knapsack20 = csvReader1.getKnapsack();
//    Knapsack knapsack25 = csvReader1.getKnapsack();
//    Knapsack knapsack30 = csvReader1.getKnapsack();
//
//    Double brute5 = BruteForce.bruteForceKnapsack01(knapsack5.getWeights(), knapsack5.getValues(), knapsack5.getMaxWeight());
//    Double brute10 = BruteForce.bruteForceKnapsack01(knapsack10.getWeights(), knapsack10.getValues(), knapsack10.getMaxWeight());
//    Double brute15 = BruteForce.bruteForceKnapsack01(knapsack15.getWeights(), knapsack15.getValues(), knapsack15.getMaxWeight());
//    Double brute20 = BruteForce.bruteForceKnapsack01(knapsack20.getWeights(), knapsack20.getValues(), knapsack20.getMaxWeight());
//    Double brute25 = BruteForce.bruteForceKnapsack01(knapsack25.getWeights(), knapsack25.getValues(), knapsack25.getMaxWeight());
//    Double brute30 = BruteForce.bruteForceKnapsack01(knapsack30.getWeights(), knapsack30.getValues(), knapsack30.getMaxWeight());
