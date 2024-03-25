// package arrays;
// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
// Find and return the maximum profit you can achieve.

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
        int[] berza = {1,8,4,4,8,10,7};
        int n = maxProfit(berza);
        System.out.println(n);
    }
    public static int maxProfit(int[] berza){
        int max = 0;
        int mal = 0;
        for(int i = 0;i<berza.length-1;i++){
           mal = berza[i];
           if(mal < berza[i+1]){
            max += berza[i+1]-mal; 
           }
        }
        return max;
    }
}
