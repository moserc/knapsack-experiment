package ProjectTools;

/**
 * Class for filling the last two rows of a 3-row array with
 * random integer elements .
 * @author Cheryl Moser
 */
public class InputGenerator {

    /**
     * Generates a random number from 1 to 100.
     * @return a random number between 1 and 100
     * @author Cheryl Moser
     */
    private static int randomNum() {
        return (int) (Math.random() * 100) + 1;
    }//end randomNum

    /**
     * Fills the last two rows of a 2D array with random integers.
     * @param arr the given array
     * @author Cheryl Moser
     */
    static void fill(Integer[][] arr) {

        //outer loop: for the last two rows
        for (int i = arr.length - 2; i < arr.length; i++) {
            //inner loop: for each element in the row
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = randomNum();
            }//end inner
        }//end outer
    }//end fill
}//end class
