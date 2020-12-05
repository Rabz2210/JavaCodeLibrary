package com.arrays;

public class subarrayWithGivenSum {

    /*
    https://www.geeksforgeeks.org/find-subarray-with-given-sum/
    This method works only if all the numbers in the array are positive and fails with the array 
    containing both +ve and -ve integers.
    */
    public static void SubArrayGivenSumWithPositiveIntegers(int[] ary,int sum){
        int currSum = ary[0];
        int start=0;
        for(int i=1;i<ary.length;i++){
            while(currSum>sum && start<(i-1)){
                currSum -=ary[start];
                start++;
            }
            if(currSum==sum){
                System.out.println("Sum found between indexes "+start+" and "+(i-1));
                return;
            }
            currSum+=ary[i];
            
        }
        System.out.println("No Subarray found");
    }

    /* 
    https://www.geeksforgeeks.org/find-subarray-with-given-sum-with-negatives-allowed-in-constant-space/
    This method handles both negative and positive numbers. It works by modifying the current array to contain only +ve integers
    and then solving it as if all the nubmers are +ve using the above approach
    */
    public static void SubArrayWithGivenSum(int[] ary,int sum){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ary.length;i++){
            min = Math.min(min, ary[i]);
        }
        int curr_sum = (ary[0]+Math.abs(min));
        int start=0;
        for(int i=1;i<ary.length;i++){
            while(curr_sum - (i-start)*Math.abs(min)>sum){
                curr_sum -=(Math.abs(min)+ary[start]);
            }
            if(curr_sum - (i-start)*Math.abs(min)==sum){
                System.out.println("element found between index "+i+" and "+start);
                break;
            }
            curr_sum = Math.abs(min)+ary[i];
        }
        
    }
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 }; 
        int n = arr.length; 
        int sum = 23; 
        SubArrayGivenSumWithPositiveIntegers(arr,sum);
        int negArr[] = {10, 2, -2, -20, 10};
        sum=-10;
        SubArrayGivenSumWithPositiveIntegers(negArr,sum);
    }

}
