package com.leetcode;

public class binarySearch {
    public static int bsearch(int[] arr,int l,int r, int x){
        if(l<r){
        int mid = l+(r-l)/2;
        if(arr[mid]==x)return mid;
        else if(arr[mid]>x){return bsearch(arr,l,mid-1,x);}
        else{return bsearch(arr, mid+1, r, x);}
        }
        else{return -1;}

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(bsearch(arr,0,arr.length-1,3));
    }
}
