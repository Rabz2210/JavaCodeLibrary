package com.rough;

public class stocBuyAndSell {
    public static int maxProfit(int[] prices) {
        int min_buy=0;
        int max_sell=0;
        int i=0;
        while(i<prices.length-1){
            while(prices[i+1]<prices[i]){
                i++;
                min_buy=prices[i];
            }
        while(prices[i+1]>prices[i]){
            i++;
            max_sell=prices[i];
            }
        }
        return (max_sell-min_buy);
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
