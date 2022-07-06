package com.arrays;

public class stockBuyAndSell_withCoolDown {
    public static int maxProfit(int[] prices) {
        if(prices.length<2)return 0;
        int len = prices.length;
        int buy;
        int sell;
        int maxProfit=0;
        int i=0;
        while(i<len-1){
            while(i<len-1 && prices[i]>prices[i+1])
                i++;
            buy = i;
            i++;
            while(i<len-1 && prices[i]<prices[i+1])
                i++;
            sell=i==len-1?i:i-1;
            maxProfit +=prices[sell]-prices[buy];
            
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,0,2};
        System.out.println(maxProfit(arr));
    }
}
