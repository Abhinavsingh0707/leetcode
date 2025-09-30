class Solution {
    public int maxProfit(int[] prices) {
       int max_Profit = 0;
       for(int i=1 ; i < prices.length; i++){
        if(prices[i] > prices[i-1]){
            max_Profit = max_Profit + prices[i] - prices[i-1];
            }
       }
     return max_Profit;
    }
}