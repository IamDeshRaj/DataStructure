package com.data.structure.array.v2;

public class MaxProfit {

	public static void main(String[] args) {
		int[] prices = {2,4,1};
//		prices = [7,1,5,3,6,4]
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        int entryPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
			if (prices[i] < entryPrice){
                if(i > 0 && prices[i-1] > prices[i]){
                    totalProfit += prices[i-1]-entryPrice;
                    entryPrice = prices[i];
                }
                entryPrice = prices[i];
            }else if(prices[i-1] > prices[i]){
                totalProfit += prices[i-1]-entryPrice;
                entryPrice = prices[i];
            }else if(i == prices.length-1){
                totalProfit += prices[i]-entryPrice;
            }
        }
        
        return totalProfit;
    }
}
