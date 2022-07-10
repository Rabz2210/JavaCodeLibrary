package com.arrays;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        if(len==2)return new int[]{1,2};
        int low = 0;
        int high = len-1;
        int sum =0;
        int[] res = new int[2];
        while(low<high){
            sum = Math.addExact(numbers[low],numbers[high]);
            if(sum==target){
                res=new int[]{low+1,high+1};
                break;
            }
            if(numbers[high]>target)--high;
            else{++low;}
            }
            return res;
        }

    public static void main(String[] args) {
        
    }
}
