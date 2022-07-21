package com.search;

public class BinarySearch_A {
    public static int binarySearch(int[] arr, int target){
        int lo = 0;
        int high = arr.length-1;
        int mid = -1;
        while(lo<=high){
            mid = lo +(high-lo)/2;
            if(arr[mid]==target)return mid;
            if(arr[mid]<target){
                lo = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int test1[] = { 2, 3, 4, 10, 40 };
        int res = binarySearch(test1,-10);
        System.out.println(" "+res);
    }
}
