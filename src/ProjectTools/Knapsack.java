package ProjectTools;

/**
 * Class that will have our knapsack objects.
 */
public class Knapsack {
    int knapsackNumber;
    int maxWeight;
    int totalItems;
    int[] values;
    int[] weights;

    /**
     * Constructor for our knapsack object.
     * @param maxWeight maximum weight this knapsack can carry.
     * @param totalItems total number of items in the knapsack.
     * @param values values of all the items in the knapsack.
     * @param weights weight of all the items in the knapsack.
     */
   public Knapsack(int knapsackNumber,int maxWeight, int totalItems, int[] values, int[] weights){
       this.knapsackNumber = knapsackNumber;
       this.maxWeight = maxWeight;
       this.totalItems = totalItems;
       this.values = values;
       this.weights = weights;
   }

   public Knapsack(){
       knapsackNumber =0;
       this.maxWeight = 0;
       this.totalItems = 0;
       this.values = null;
       this.weights = null;
   }
    /**
     * Gets the maxweight of the knapsack.
     * @return the maximum weight.
     */
   public int getMaxWeight(){
       return maxWeight;
   }

    /**
     * Gets the total items in the knapsack.
     * @return a number representing the total amount of items in this knapsack.
     */
   public int getTotalItems(){
       return totalItems;
   }

    /**
     * Gets the values of all the items in the knapsack.
     * @return an int array that holds the values of the items in the knapsack in order (order they are in the knapsack).
     */
   public int[] getValues(){
       return values;
   }

    /**
     * Gets the weights if all the items in the knapsack.
     * @return an int array that holds the weights of the items in the knapsack in order (order they are in the knapsack).
     */
   public int[] getWeights(){
       return weights;
   }


    /**
     * Sets a new maximum weight for the knapsack.
     * @param maxWeight new maximum weight the knapsack can hold.
     */
   public void setMaxWeight(int maxWeight){
       this.maxWeight = maxWeight;
   }

    /**
     * Sets a new total number of items in the knapsack.
     * @param totalItems new number of total items in the knapsack.
     */
   public void setTotalItems(int totalItems){
       this.totalItems = totalItems;
   }

    /**
     * Sets the values of the items in the knapsack.
     * @param values new set of values for items in the knapsack.
     */
   public void setValues(int[] values){
       this.values = values;
   }

    /**
     * Sets the weights for the items in the knapsack.
     * @param weights new set of weights for the items in the knapsack.
     */
   public void setWeights(int[] weights){
       this.weights = weights;
   }

    /**
     * Sets the knapsack number we are using
     * @param knapsackNumber number of knapsack
     */
   public void setKnapsackNumber(int knapsackNumber){
       this.knapsackNumber = knapsackNumber;
   }

    /**
     * Gets the number of the knapsack we are using
     * @return number of knapsack
     */
   public int getKnapsackNumber(){
       return knapsackNumber;
   }
}
