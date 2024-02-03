package ProjectTools;

public class displayPlot {

/*
TEMPLATE FILE FROM PROJECT 1: CONTENTS WILL NEED TO BE TWEAKED

    */
/**
     * Creates and writes the contents of a data array to a csv file.
     * While the csv file name never changes, the contents are overwritten
     * each time main.java is run.
     * @param fileName the csv file
     * @param runtimes the data array holding all test results
     *//*

    public static void output(String fileName, double[][] runtimes){
        //Output data to csv
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            for (double[] runtime : runtimes) {

                //loops over runtimes
                for (int j = 0; j < runtime.length; j++) {
                    writer.write(Double.toString(runtime[j]));

                    //data must be comma-separated, add to all but last element
                    if (j != runtime.length - 1) {
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
    }
*/

}
