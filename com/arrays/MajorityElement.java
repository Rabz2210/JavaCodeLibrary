package com.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/majority-element/
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int length = nums.length;
        if(length==1)return nums[0];
        int majoritynumber = length/2;
        int max = 0;
        Arrays.sort(nums);
        for(int i=0;i<length;i++){
            max=1;
            while(i<length-1 && nums[i]==nums[i+1]){
                max++;
                i++;
            }
            if(max>majoritynumber)return nums[--i];
        }
        return -1;
    }


//Boyer-Moore Voting Algorithms
    public static int majorityElementII(int[] nums){
        int length = nums.length;
        int candidate = nums[0];
        int count = 0;
        for(int each:nums){
            if(candidate==each){
                count++;
            }
            else{count--;}
            if(count<0){candidate=each;count=1;}
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    
}
