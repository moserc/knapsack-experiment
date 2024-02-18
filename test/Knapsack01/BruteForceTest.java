package Knapsack01;

import ProjectTools.Knapsack;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BruteForceTest {


    /**
     * Test that will check if output is correct
     */
    @Test
    public void bruteforce01Test(){
        int[] testVals = {1,2,3};
        int[] testWeights = {3,2,1};
        Knapsack testSack = new Knapsack(0, 3, 3, testVals, testWeights);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Knapsack01.BruteForce.bruteForceKnapsack01(testSack.getWeights(), testSack.getValues(), 3, 0);


        String output = outputStream.toString();
        assertTrue(output.contains("Values in this knapsack are: [1, 2, 3]"));
        assertTrue(output.contains("Weights in this knapsack are: [3, 2, 1]"));
        assertTrue(output.contains("Total Weight:  3"));
        assertTrue(output.contains("Total Profit:  5"));

    }
}
