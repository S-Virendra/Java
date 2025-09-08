import java.util.*;

public class SubsetsBacktracking {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        System.out.println(result);
    }

    static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        result.add(new ArrayList<>(temp)); // Add current subset
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);               // Choose
            backtrack(result, temp, nums, i + 1); // Explore
            temp.remove(temp.size() - 1);    // Undo (Backtrack)
        }
    }
}

