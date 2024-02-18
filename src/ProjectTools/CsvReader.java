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

