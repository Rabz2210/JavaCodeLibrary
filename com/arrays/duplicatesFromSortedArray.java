package com.arrays;

public class duplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i=1;
        int j=0;
        for(i=1;i<len;i++){
            if(nums[i]!=nums[j]){
                ++j;
                nums[j]=nums[i];
            }
        }
        return ++j;
    }
    
    public static void main(String[] args) {
        int[] nums =  new int[]{1,1,2};
        int res=removeDuplicates(nums);
        System.out.println(res);
        for(int i=0;i<res;i++){
                System.out.println(nums[i]);
        }
    }
}
