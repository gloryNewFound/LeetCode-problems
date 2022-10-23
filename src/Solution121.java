public class Solution121 {

    public static void main(String[] args) {
        int[] prices = {1};
        System.out.println(maxProfit(prices));
    }


    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minimum = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minimum = Math.min(minimum, prices[i]);
            profit = Math.max(profit, prices[i] - minimum);
        }
        return profit;
    }
}
