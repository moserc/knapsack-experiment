package ProjectTools;

import java.io.FileNotFoundException;

/**
 * Driver class for generating three additional input arrays.
 * @author Cheryl Moser
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //generate three 2D arrays of sizes 20, 25, 30
        Integer[][] arr20 = new Integer[3][20];
        Integer[][] arr25 = new Integer[3][25];
        Integer[][] arr30 = new Integer[3][30];

        //fill the last two rows of the array (values & weights), then
        //add the knapsack number and weight limit to the first row
        InputGenerator.fill(arr20);
        arr20[0] = new Integer[]{4, 100};

        //repeat for arr25, arr30
        InputGenerator.fill(arr25);
        arr25[0] = new Integer[]{5, 100};

        InputGenerator.fill(arr30);
        arr30[0] = new Integer[]{6, 100};

        //output
        CsvOutput.output("src/Inputs/inputs4.csv", arr20);
        CsvOutput.output("src/Inputs/inputs5.csv", arr25);
        CsvOutput.output("src/Inputs/inputs6.csv", arr30);


    }//end main
}//end class
