package com.arrays;

public class stockBuyAndSe_II {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int len = prices.length;
        for(int i=1;i<len;i++){
                if(prices[i-1]>prices[i]){

                }
        }
        return 0;

    }


    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
