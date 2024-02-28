package Knapsack01;

import ProjectTools.Knapsack;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static Knapsack01.Greedy.greedy;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the K01 greedy method.
 * I used an <a href="https://augustineaykara.github.io/Knapsack-Calculator/">
 * online K01 calculator</a> to affirm the expected optimal solution values.
 * @author Cheryl Moser
 */
public class GreedyTest {

    /**
     * Tests the K01 greedy method with a small input array.
     * Asserts a runtime value greater than 0, and asserts correct optimal
     * weight and value results of the knapsack (values captured from the print
     * stream of System.out).
     * @author Cheryl Moser
     */
    @Test
    public void testGreedySmall(){

        //define input array of size 5
        int[] values = {10,16,50,8,32};
        int[] weights = {14,4,9,20,2};
        int limit = 30;
        Knapsack object = new Knapsack();
        object.setValues(values);
        object.setWeights(weights);
        object.setMaxWeight(limit);

        //set up to capture the printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        //call greedy
        double runtime = greedy(object);

        //reset System.out
        System.out.flush();
        System.setOut(originalOut);

        //grab weight and benefit values from captured output
        String printedOutput = outputStream.toString();

        //assertions
        assertTrue(runtime > 0);
        assertTrue(printedOutput.contains("Knapsack Best Value: 108")); //expected --> 108
        assertTrue(printedOutput.contains("Knapsack Best Weight: 29")); //expected --> 29

    }//end small greedy test

    /**
     * Tests the K01 greedy method with a large input array.
     * Asserts a runtime value greater than 0, and asserts that the
     * weight and value results of the knapsack (values captured from the print
     * stream of System.out) will be the optimal solution.
     * @author Cheryl Moser
     */
    @Test
    public void testGreedyLarge(){

        //define input array of size 30
        int[] values = {10,16,50,8,32,40,26,2,102,55,48,37,23,1,67,12,5,6,21,20,33,41,49,9,7,3,11,13,18,4};
        int[] weights = {14,4,9,20,2,3,5,12,10,13,30,29,28,17,18,6,27,15,11,19,1,7,8,16,21,23,4,22,3,2};
        int limit = 200;

        Knapsack object = new Knapsack();
        object.setValues(values);
        object.setWeights(weights);
        object.setMaxWeight(limit);

        //set up to capture the printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        //call greedy
        double runtime = greedy(object);

        //reset System.out
        System.out.flush();
        System.setOut(originalOut);

        //grab weight and benefit values from captured output
        String printedOutput = outputStream.toString();

        //assertions
        assertTrue(runtime > 0);
        assertTrue(printedOutput.contains("Knapsack Best Value: 692")); //expected optimal--> 692
        assertTrue(printedOutput.contains("Knapsack Best Weight: 198")); //expected optimal--> 198
        //optimal values calculated using an online calculator. See source in the
        //class javadoc above

    }//end large greedy test
}//end class
