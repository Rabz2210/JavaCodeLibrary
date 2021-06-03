package com.arrays;

public class findSmallestElementRotatedSortedArray {
    
    public static int smalletElement(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int smallest = Integer.MAX_VALUE;
        while(low<high){
            int mid = low+(high-low)/2;
            smallest = Math.min(smallest, arr[mid]);
            if(arr[low]>arr[mid]){
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return smallest;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3};
        int[] arr1 = new int[]{1,2,3,4,5,6,7};
        int[] arr2 = new int[]{5,4,3,2,1};
        System.out.println(smalletElement(arr2));
    }
}
