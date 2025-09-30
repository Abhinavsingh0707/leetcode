class Solution {
    public int maxProfit(int[] prices) {
      int min_Price = Integer.MAX_VALUE; // --> 7
      int max_Profit = 0;
        //Q1. 7 1 5 3 6 4
        //            p
        // min_Price = 7,1
        // max_Profit = 0,4,5 --> 5

        //Q2. 7 6 4 3 1
        //            p
        // min_Price = 7,6,4,3,1
        // max_Profit = 0,0,0,0,0--> 0
        //TC--> O(n) , SC --> O(n)
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