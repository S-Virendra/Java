import java.util.*;

public class PairSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                return true; // Pair found
            }
            set.add(num);
        }
        return false; // No pair found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        
        if (hasPairWithSum(arr, target)) {
            System.out.println("Pair exists!");
        } else {
            System.out.println("No pair found.");
        }
    }
}

