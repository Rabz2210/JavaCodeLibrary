package com.rough;

public class subArrayWithGivenSum {

    //Handles only positive numbers
    public static void subArrayGivenSum_I(int[] nums, int target){
        if(nums.length>0){
            int start = 0;
            int i=0;
            int sum=0;
            while(i<nums.length){
                while(sum>target && start<i){
                    sum -=nums[start];
                    start++;
                }
                if(sum==target){
                    System.out.println("sum found between indexes "+start+" and "+i);
                    return;
                }
                else{
                    sum+=nums[i];
                    i++;
                }
            }
            System.out.println("No subarray with given sum found");
            return;

        }
        else{
            System.out.println("The given array is empty");
        }
    }
    

    //Handles both postive and negative numbers
    public static void subArrayGivenSum_II(int[] nums, int target){
        
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 20, 3, 10, 5};
        subArrayGivenSum_I(arr,33);
        
    }
}
