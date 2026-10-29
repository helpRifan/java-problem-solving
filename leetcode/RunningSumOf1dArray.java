import java.util.*;

// LeetCode 1480 - Running Sum of 1d Array (Easy)
// Idea: each element becomes itself plus the previous running total.
public class RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) nums[i] += nums[i - 1];
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4}))); // [1, 3, 6, 10]
    }
}
