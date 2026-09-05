class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int max = 0;

        for(int i = 1;i<prices.length;i++){
            minBuy = Math.min(minBuy, prices[i]);
            int profit = prices[i] - minBuy;
            max = Math.max(max, profit);
        }

        return max;
    }
}
