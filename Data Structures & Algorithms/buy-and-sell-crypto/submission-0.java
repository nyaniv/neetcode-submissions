class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int bestProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else if(prices[i] - minPrice > bestProfit){
                bestProfit = prices[i] - minPrice;
            }
        }
        return bestProfit;
    }
}
