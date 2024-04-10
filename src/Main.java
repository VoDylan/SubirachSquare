import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //All 4 Element Combinations
        System.out.println("There are " + Subirach.subirachs_4() + " combinations of 33 with 4 elements");

        //All possible combinations of 33
        Integer[] nums = {1, 14, 14, 4, 11, 7, 6, 9, 8, 10, 10, 5, 13, 2, 3, 15};
        int targetSum = 33;
        Subirach.sum_all(new ArrayList<Integer>(Arrays.asList(nums)), targetSum);
        System.out.println("There are " + Subirach.counter + " combinations of the sum of 33");
        Subirach.counter = 0;

        //All possible combinations of all sums, greatest sum possible is 132
        for (int i = 0; i < 133; i++) {
            Subirach.sum_all(new ArrayList<>(Arrays.asList(nums)), i);
            System.out.println("There are " + Subirach.counter + " combinations of the sum of " + i);
            //reset to counter to 0
            Subirach.counter = 0;

        }
    }


}