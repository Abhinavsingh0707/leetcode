class Solution {
    public int maxProfit(int[] prices) {
      int min_Price = Integer.MAX_VALUE;
      int max_Profit = 0;

      for(int price : prices){
        if(price < min_Price){
            min_Price = price;
        }
        if(price - min_Price > max_Profit){
            max_Profit = price-min_Price;
        }
      }
      return max_Profit;
    }
}