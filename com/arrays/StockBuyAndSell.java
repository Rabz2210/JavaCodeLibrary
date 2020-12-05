package com.arrays;

public class StockBuyAndSell {
    public static int stockByAndSell(int[] prices){
        int lo=0;
        int high=prices.length-1;
        int leftMin=prices[lo];
        int rightMax=prices[high];

        while(lo<=high){
            if(prices[lo]<leftMin)leftMin=prices[lo];
            lo++;
            if(prices[high]>rightMax)rightMax=prices[high];
            high--;
        }
        int maxProf = rightMax - leftMin;
        if(maxProf>=0)return maxProf;
        else return 0;
    }
    

    public static int stockBuyAndSell(int[] prices){
        int min_buy=Integer.MAX_VALUE;
        int max_sell=Integer.MIN_VALUE;
        int i=0;
        while(i<prices.length-1){
            while(prices[i]<min_buy){
                min_buy=prices[i];
                i++;
            }
        while(prices[i]>max_sell){
            max_sell=prices[i];
            i++;
                }
            i++;
        }
        
        return (max_sell-min_buy);
        }
    
    public static void main(String[] args) {
        int[] test1 = new int[]{7,1,5,3,6,4};
        int[] test2 = new int[]{7,6,4,3,1};
        int[] test3 = new int[]{1,4,2};
        System.out.println(stockBuyAndSell(test1));
        // System.out.println("-------------");
        // System.out.println(stockByAndSell(test2));
        // System.out.println("-------------");
        // System.out.println(stockByAndSell(test3));
    }
}
