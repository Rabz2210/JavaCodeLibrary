package com.arrays;
//https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
public class searchRotatesSortedArray {
    public static int searchRotatedArray(int[] arr, int l, int h,int key){
        if(l>h)return -1;
        int mid = (l+h)/2;
        if(arr[mid]==key)return mid;
        else if(arr[l]<=arr[mid]){
            if(key>arr[l]&&key<arr[mid])return searchRotatedArray(arr, l, mid-1, key);
            else{return searchRotatedArray(arr, mid+1, h, key);}
        }
        else{
            if(key>=arr[mid+1] && key<=arr[h])return searchRotatedArray(arr, mid+1, h, key);
            else{return searchRotatedArray(arr, l, mid-1, key);}
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,1,2};
        System.out.println(searchRotatedArray(arr, 0, arr.length-1,4));
    }
    
}
