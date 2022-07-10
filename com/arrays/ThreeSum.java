package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls= new ArrayList<List<Integer>>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            if(nums[i]<=0){
                if(i==0 || nums[i]!=nums[i-1])
                twoSum(i,ls,nums);
            }
        }
        return ls;
    }
    
    public static void twoSum(int i, List<List<Integer>> ls, int[] nums)
    {
        int sum;
        int low=i+1;
        int high = nums.length-1;
        while(low<high){
            sum = nums[i]+nums[low]+nums[high];
            if(sum==0){
                ls.add(Arrays.asList(new Integer[]{nums[i],nums[low],nums[high]}));
                while(low<high && nums[low]==nums[low+1])++low;
                while(low<high && nums[high]==nums[high-1])--high;
                low++;
                high--;
            }
            else if(sum>0)--high;
            else ++low;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0};
        List<List<Integer>>  res = threeSum(nums);
        for(List<Integer> each: res){
            for(Integer i:each){
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
        
    }
}
