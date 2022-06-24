package com.arrays;

public class buildFromPermutations {

    public static int[] buildArray(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        // for(int i=0;i<length;i++){
        //     temp = nums[i];
        //     nums[i] = nums[nums[i]];
        // }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,2,1,5,3,4};
        int[] res = buildArray(nums);
        for(int each:res){
            System.out.println(each);
        }

    }
    
}
