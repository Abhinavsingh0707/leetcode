class Solution {
    public int maxProfit(int[] prices) {
       int max_Profit = 0;
       // TC--> O(n)
       // SC--> O(1) 
       // 7 1 5 3 6 4
       //             i
       // max_Profit = 0,4,4,7 --> 7
       for(int i=1 ; i < prices.length; i++){
        if(prices[i] > prices[i-1]){
            max_Profit = max_Profit + prices[i] - prices[i-1];
            }
       }
     return max_Profit; // --> 7
    }
}