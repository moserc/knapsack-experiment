package ProjectTools;

public class InputGenerator {

    //random number generation
    private static int randomNum() {
        return (int) (Math.random() * 100) + 1;
    }

    //fill arrays with random numbers
    static void fill(Integer[][] arr) {
        for (int i = arr.length - 2; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = randomNum();
            }
        }
    }
}
