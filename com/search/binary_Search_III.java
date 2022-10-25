package com.search;

public class binary_Search_III {
    public static boolean binarySearch(int[] arr, int target){
        int low = -1;
        int high = arr.length-1;
        while(low+1<high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target) return true;
            else if(ok(arr,mid, target)){
                high = mid;
            }else{
                low = mid-1;
            }
        }
        return arr[high]==target?true:false;
    }

    public static boolean ok(int[] arr, int index, int target){
        return arr[index]>=target;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(binarySearch(arr, -11));
    }
}
