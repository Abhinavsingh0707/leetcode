class Solution {
    public int maxProfit(int[] prices) {
      int buy_price = prices[0];         //[7,1,2,3,5,4] -->7
      int profit = 0;                    // current profit is o.
       
      for(int i=1 ; i<prices.length; i++){
        int current_price = prices[i];  // update current prices
            if(buy_price > current_price){
                buy_price = current_price;
            }
            profit = Math.max(profit, current_price-buy_price);   //update max profit
      }
      return profit;
    }
}