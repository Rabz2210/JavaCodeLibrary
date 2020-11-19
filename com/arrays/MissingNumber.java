package com.arrays;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {

    //We use the Gaus Formulae here , calculate the total sum till n and the sum of all the
    //integers in the array, substract it from the total to get the missing number
    public static int missingNumber_I(int[] arr){
        int sum=0;
        int length = arr.length;
        for(int each:arr){
            sum +=each;
        }
        int totalSum = length*(length+1)/2;
        return totalSum-sum;
        }

    //We use the XOR approach here
    public static int missingNumber_II(int[] arr){
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            n ^= i ^ arr[i];
        }
        return n;
    }
    

    public static void main(String[] args) {
        int[] test = new int[]{3,0,1};
        int[] test1 = new int[]{0,1};
        int[] test2 = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber_II(test1));
        System.out.println(missingNumber_I(test2));

    }
}
