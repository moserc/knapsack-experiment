package ProjectTools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for writing data to file (.csv).
 * @author Cheryl Moser
 */
public class CsvOutput {

    /**
     * Creates or overwrites a csv file with the contents of a 2D data array.
     * @param fileName the csv file name specified in its destination file path
     * @param arr the 2D data array
     * @author Cheryl Moser
     */
    public static void output(String fileName, Integer[][] arr){

        //output data to csv
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            //loop through each row in the 2D array
            for (Integer[] row : arr) {

                //loop over elements in the row, write them to file
                for (int j = 0; j < row.length; j++) {
                    if (row[j] != null) {
                        writer.write(Integer.toString(row[j]));
                    }else{
                        writer.write("");
                    }

                    //data must be comma-separated, add to all but last element
                    if (j != row.length - 1) {
                        writer.write(",");
                    }
                }//end inner loop

                //a new line in csv is read as a new row in Excel
                //place a new line after each algorithm output
                writer.newLine();

            }//end outer loop
        } catch (IOException e) {
            System.err.println("There was a problem writing to file: " + e.getMessage());
        }//end try/catch
    }//end output
}//end class
