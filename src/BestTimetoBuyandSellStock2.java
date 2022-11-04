public class BestTimetoBuyandSellStock2 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }

}


class Solution {
    public int maxProfit(int[] prices) {
        int valley = prices[0];
        int peak = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            while ( (i < prices.length - 1) && (prices[i] > prices[i + 1]) ) {
                i++;
            }
            valley = prices[i];
            while ( (i < prices.length - 1) && (prices[i] < prices[i + 1]) ) {
                i++;
            }
            peak = prices[i];
            profit += peak - valley;
        }
        return profit;
    }
}