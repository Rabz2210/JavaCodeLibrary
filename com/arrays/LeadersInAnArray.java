package com.arrays;

//https://www.geeksforgeeks.org/leaders-in-an-array/
public class LeadersInAnArray {
    public static void Leaders(int[] ary){
        int i=0;
        for(i=0;i<ary.length-1;i++){
            if(ary[i]>ary[i+1])System.out.print(" "+ary[i]);
        }
        System.out.print(" "+ary[i]);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        Leaders(arr);
    }
}
