package com.arrays;

   //https://leetcode.com/problems/maximum-subarray/

public class maximumSumSubarray {
 
    //This will handle all the cases, except the ones where all the numbers are negative
    public static int maxSubArray(int[] nums){
        int maxsoFar = Integer.MIN_VALUE;
        int maxEnding_here=0;
        int start=0;
        int len=nums.length;
        while(start<len){
            maxEnding_here +=nums[start];
            if(maxsoFar<(maxEnding_here)){
                maxsoFar = maxEnding_here;
            }
            if(maxEnding_here<0){
                maxEnding_here = 0;
            }
            start++;
        }
       return maxsoFar;
    }
    
    public static void main(String[] args) {
        int[] test = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        int[] test1 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
       System.out.println(maxSubArray(test));
       System.out.println(maxSubArray(test1));
    }
}
