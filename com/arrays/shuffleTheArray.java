package com.arrays;

//https://leetcode.com/problems/shuffle-the-array/

public class shuffleTheArray {
    public static int[] shuffle(int[] nums,int n) {
        int[] resArr = new int[2*n];
        int index=0;
        for(int i=0,j=n;i<n && j<(2*n);i++,j++){
            resArr[index]=nums[i];index++;
            resArr[index]=nums[j];index++;
        }
        return resArr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,1,3,4,7};
        int[] resArray = shuffle(arr,3);
        for(int each:resArray){System.out.print(","+each);}
    }
}
