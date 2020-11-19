package com.arrays;

//Given an array find the sum of the elements between the given two index positions.
// https://www.geeksforgeeks.org/prefix-sum-array-implementation-applications-competitive-programming/
import java.util.Scanner;

public class prefixSumArray {
    public static int[] prefixsum(int[] ary){
        int[] prefixAry = new int[ary.length];
        prefixAry[0] = ary[0];
        for(int j=1;j<ary.length;j++){
            prefixAry[j]+=prefixAry[j-1]+ary[j];
        }
        return prefixAry;
    }

    public static int getSum(int l, int r,int[] prefixSum){
        if(l!=0){
            return(prefixSum[r]-prefixSum[l-1]);
        }
        else{
            return(prefixSum[r]);
        }
    }

    public static void main(String[] args) {
        
        int[] ary= new int[]{3,4,8,-9,20,6};
        int [] prefixArray = prefixsum(ary);
        System.out.println(getSum(2, 6, prefixArray));
        System.out.println(getSum(0, 4, prefixArray));



    }
    
}
