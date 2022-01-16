package com.arrays;


public class findPivotIndex {

    public static int pivotIndex(int[] nums) {
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
        }
        int left_sum = 0;
        for(int i=0;i<nums.length;i++){
            if(sum-(left_sum+nums[i])==left_sum)return i;
            left_sum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{2,1,-1}));
    }
}
