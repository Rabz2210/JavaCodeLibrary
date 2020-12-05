package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    //The array consists of positive and negative integers and the numbers not sorted
    public static boolean twoNumberSum_I(int[] nums,int target){
        if(nums.length!=0){
            Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
            int i=0;
            while(i<nums.length){
                int compliment = target-nums[i];
                if(mp.containsKey(compliment))return true;
                mp.put(nums[i],i);
                i++;
            }
        }
        else{
            return false;
        }
        return false;
    }

    //The array consists of positive and negative integers and the numbers are sorted
    //We can also solve the above situation by first sorting it and then using the below technique
    public static boolean twoNumberSum_II(int[] nums, int target){
        if(nums.length>0){
            int start=0;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[start]+nums[end];
                if(sum==target)return true;
                else if(sum>target)end--;
                else start++;
            }
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,-4,8,11,1,-1,6};
        System.out.println(""+twoNumberSum_II(arr, 10));
    }
}
