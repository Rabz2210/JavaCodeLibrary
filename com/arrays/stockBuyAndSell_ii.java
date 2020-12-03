package com.arrays;

public class stockBuyAndSell_ii {
    public static int stockBuyAndSell(int[] arr){
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        boolean bought = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                minPrice = arr[i];
                bought=true;
            }
            else if(bought && arr[i]>arr[i+1]){
                profit += minPrice - arr[i];
                bought = false;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] test1 = new int[]{7,1,5,3,6,4};
        int[] test2 = new int[]{1,2,3,4,5};
        System.out.println(stockBuyAndSell(test1));
        System.out.println(stockBuyAndSell(test2));
    }
}
