package com.arrays;

public class StockByAndSell {

    public static int maxProfit(int[] prices){
        int buy=0;
        int sell;
        int maxProf=0;
        while(buy<prices.length){
            while(buy<prices.length-1 && prices[buy+1]<prices[buy])
            buy++;
            sell = buy+1;
            while(sell<prices.length && prices[sell]>prices[buy]){
                maxProf = Math.max(maxProf, prices[sell]-prices[buy]);
                sell++;
            }
            buy = sell;
        }
        return maxProf;
    }


    public static int maxProfitII(int[] prices){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min, prices[i]);
            max = Math.max(max,prices[i]-min);
            maxProfit = Math.max(maxProfit, max);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = new int[]{1,1,1,1,1};
        System.out.println(maxProfitII(prices));

    }
}
