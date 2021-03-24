package com.slidingwindow;

//https://www.techiedelight.com/find-minimum-sum-subarray-given-size-k/

public class minimumSubarrayLength {
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int sum=nums[0];
        int i=1;
        int j=0;
        int min = Integer.MAX_VALUE-1;
        while(j<=i && i<nums.length){
            sum+=nums[i];
            if(j==i && nums[i]==target){
                min = (i-j)+1;
                sum-=nums[j];
                j++;}
            else if(sum>target){
                min = (i-j)+1;
                sum-=nums[j];
                j++;
            }
            if(minLength>min)minLength=min;
            i++;
        }
        return minLength;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, arr));
    }
}
