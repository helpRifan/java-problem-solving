// LeetCode 121 - Best Time to Buy and Sell Stock (Easy)
// Idea: track the lowest price so far and the best profit if we sell today.
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, best = 0;
        for (int p : prices) {
            min = Math.min(min, p);
            best = Math.max(best, p - min);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5
    }
}
