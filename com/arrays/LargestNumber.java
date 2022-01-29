package com.arrays;

//https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/

public class LargestNumber {

    public static int dominantIndex(int[] nums) {
        int largestTwiceTillNow = nums[0]*2;
        int largest = nums[0];
        int pos = 0;
        for(int i=1;i<nums.length;i++){
            int currentTwice = nums[i]*2;
            if(largest<nums[i]){
                largest = nums[i];
                if(largestTwiceTillNow<=largest){
                    pos = i;
                    largestTwiceTillNow = nums[i]*2;
                }else{
                    pos = -1;
                    largestTwiceTillNow = largest*2;
                }
            }else{
                if(currentTwice>largest){
                    pos = -1;
                    largestTwiceTillNow = currentTwice;
                }
            }
        }
        return pos;
    } 

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(dominantIndex(arr));
    }
    
}
