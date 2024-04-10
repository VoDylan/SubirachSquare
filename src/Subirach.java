import java.util.ArrayList;
import java.util.Arrays;


public class Subirach {
    //public counter
    public static int counter;

    public static int subirachs_4() {
        int sum = 33;
        int count = 0;
        int check = 0;
        int[] nums = {1, 14, 14, 4, 11, 7, 6, 9, 8, 10, 10, 5, 13, 2, 3, 15};
        for (int i = 0; i < 16; i++) {
            for (int j = i + 1; j < 16; j++) {
                for (int k = j + 1; k < 16; k++) {
                    for (int l = k + 1; l < 16; l++) {
                        check++;
                        if (nums[i] + nums[j] + nums[k] + nums[l] == sum) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    //takes in array of numbers as Magic Square, an int as the targetSum, and a new array list that stores combinations
    public static void all_combinations_recursive(ArrayList<Integer> funnySquare, int targetSum, ArrayList<Integer> storage) {
        int s = 0;
        //finds all possible combinations
        for (int x : storage) s += x;
        //if targetSum is found, add to counter
        if (s == targetSum)
            counter++;
        //reset program if targetSum is found or if current sum is greater than targetSum
        if (s >= targetSum)
            return;
        //remaining combinations
        for (int i = 0; i < funnySquare.size(); i++) {
            ArrayList<Integer> remaining = new ArrayList<Integer>();
            int n = funnySquare.get(i);
            for (int j = i + 1; j < funnySquare.size(); j++) remaining.add(funnySquare.get(j));
            ArrayList<Integer> storage_recursive = new ArrayList<Integer>(storage);
            storage_recursive.add(n);
            all_combinations_recursive(remaining, targetSum, storage_recursive);
        }
    }

    //start recursive function
    public static void sum_all(ArrayList<Integer> inputNum, int targetSum) {
        all_combinations_recursive(inputNum, targetSum, new ArrayList<Integer>());
    }
}
