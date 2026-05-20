class Solution {
    public int maxProfit(int[] prices) {
        //Every time the price rises from one day to the next, 
        //pretend I bought yesterday and sold today.”
        int profit=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
           
           
        }
        return profit;
    }
}