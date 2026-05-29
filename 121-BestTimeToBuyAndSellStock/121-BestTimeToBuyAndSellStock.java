// Last updated: 30/05/2026, 00:06:11
class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min) {
                min=prices[i];
            }
            profit=Math.max(profit,prices[i]-min);
        }   
        return Math.max(profit,0);
    }
}