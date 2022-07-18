package com.rough;

public class stockByAndSellII {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy;
        int sell;
        int len = prices.length;
        if(len<2)return 0;
        for(int i=0;i<len-1;i++){
            while(i<len-1 && prices[i]>=prices[i+1])++i;
            int valley=prices[i];
            while(i<len-1 && prices[i]<=prices[i+1])++i;
            int peak = prices[i];
            maxProfit += peak-valley;
        }
           return maxProfit;
       }
    
    public static void main(String[] args) {
        int[] arr = new int[]{7,5,4,3,2,1};
        System.out.println(maxProfit(arr));


    }
}
