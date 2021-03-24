//https://www.geeksforgeeks.org/window-sliding-technique/
package com.slidingwindow;

public class maximumSumOfKConsecutiveElements {
    public static int sumOfConsecutiveK(int[] arr,int k){
        int sum = 0;
        int max = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max = sum;
        for(int j=k;j<arr.length;j++){
            sum+=arr[j];
            sum-=arr[j-k];
            if(sum>max)max=sum;
        }
        return max;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{100, 200, 300, 400};
        System.out.println(sumOfConsecutiveK(arr, 2));
    }
}
