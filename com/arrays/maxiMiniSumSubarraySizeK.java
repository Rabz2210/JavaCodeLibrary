package com.arrays;

//https://www.geeksforgeeks.org/find-maximum-minimum-sum-subarray-size-k/

public class maxiMiniSumSubarraySizeK {
    public static int subarraySizeK(int[] ary, int k){
        int sum=0;
        for (int i = 0; i < k ; i++) {
            sum+=ary[i];
        }
        for (int i=0, j=i+k;i<(ary.length-(k))&&j<(ary.length); i++,j++) {
            int temp = sum;
            temp-=ary[i];
            temp+=ary[j];
            if(temp>sum)sum=temp;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] inputAry =  new int[]{100,200,300,400};
        System.out.println(" "+subarraySizeK(inputAry,2));
        int[] inputAry1 = new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println(""+subarraySizeK(inputAry1, 4));
    }
}
