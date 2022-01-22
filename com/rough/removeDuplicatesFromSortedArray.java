package com.rough;

public class removeDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        int j=0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[i+1]){
                count++;
                j++;
                nums[j] = nums[i+1];
            }
        }
       return count;
    }

    public static void main(String[] args) {
        int[] arr =  new int[]{1,2};
        int count = removeDuplicates(arr);
        System.out.println(count);
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }
    }
    
}
