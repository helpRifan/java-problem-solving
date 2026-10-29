// LeetCode 53 - Maximum Subarray (Medium on LeetCode, beginner friendly) -> use Kadane's algorithm
// NOTE: LeetCode lists this as Medium. If you want only Easy, swap it with problem 1295 or 1480.
// Idea: at each index either extend the previous subarray or start fresh.
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int cur = nums[0], best = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(nums[i], cur + nums[i]);
            best = Math.max(best, cur);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); // 6
    }
}
