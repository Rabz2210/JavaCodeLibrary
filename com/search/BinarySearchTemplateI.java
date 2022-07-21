package com.search;



//

public class BinarySearchTemplateI {
    public static int binarySearch(int[] arr, int target){
            int mid = -1;
            int lo = 0;
            int high = arr.length-1;
            while(lo<=high){
                mid = lo+(high-lo)/2;
                if(arr[mid]==target)return mid;
                if(target < arr[mid])high = mid-1;
                else{lo = mid+1;}
            }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
