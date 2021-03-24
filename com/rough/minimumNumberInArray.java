package com.rough;

public class minimumNumberInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,-6,4,2,1,5,4};
        int min = Integer.MAX_VALUE;
        for(int each:arr){
            if(min>each){
                min = each;
            }
        }
        System.out.println(min);
    }
}
