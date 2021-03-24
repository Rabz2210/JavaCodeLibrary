package com.search;

//https://www.geeksforgeeks.org/binary-search/

public class BinarySearch {

//Recursive Approach
    public static int binarySearchRecursive(int[] arr,int start, int end, int target){
        if(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target)return mid;
            if(target<arr[mid])
                return binarySearchRecursive(arr, start, mid-1, target);
            return binarySearchRecursive(arr, mid+1, end, target);
        }
        return -1;
    }

//Iterative Approach
    public static int binarySearchIterative(int[] arr, int start, int end, int target){
        int mid=-1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==target)return mid;
            if(arr[mid]<target)end=mid-1;
            if(arr[mid]>target)start=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int test1[] = { 2, 3, 4, 10, 40 };
       // System.out.println(binarySearchRecursive(test1, 0, test1.length, 3));
        System.out.println(binarySearchIterative(test1, 0, test1.length, 3));
    }
}
