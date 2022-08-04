package com.rough;


//Binary Search template where low and high both cross each other

public class binarySearchPracI {
    public static int binarySearch(int[]arr, int target){
        int low=0;
        int high = arr.length-1;
        int mid;
        while(low<high){
         mid = low+high-low/2;
         if(arr[mid]==target) return mid;
         if(target>arr[mid]){
          low = mid+1;
         }else{
            high = mid-1;
         }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr, 2));
    }
}
