package com.search;

public class BinarySearchI {

    public static int BinarySearchI(int[] arr, int target){
        int mid=-1;
        int hi = arr.length;
        int lo = 0;
        while(lo<=hi){
            mid = lo+(hi-lo)/2;
            if(arr[mid]==target)return mid;
            if(target > arr[mid]) lo = mid+1; 
            if(target < arr[mid])  hi = mid-1;
        }
            return -1;
    }


    public static int BinarySearchII(int[] arr, int target){
        int lo = 0;
        int high = arr.length-1;
        int mid = -1;
        while(lo<=high){
             mid = lo+(high-lo)/2;
             if(arr[mid]==target)return mid;
             if(target<arr[mid])high = mid-1;
             else{
                 lo = mid+1;
             }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int index = BinarySearchII(arr, 6);
        System.out.println("Index: "+index);
    }
}
