package com.sort;

import com.hashing.sortingHashMap;

public class quickSortPartition {
    public static void sort(int[] arr, int start, int end){
            if(start<end){
                int partitionIndex = partitionIndex(arr, start, end);
                sort(arr, start, partitionIndex-1);
                sort(arr, partitionIndex+1, end);
            }
    }

    public static int partitionIndex(int[] arr, int start, int end){
        int pivot = arr[end];
        int pIndex = start;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                swap(i, pIndex, arr);
                ++pIndex;
            }
        }
        swap(end,pIndex,arr);
        return pIndex;
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{7,2,1,6,8,5,3,4};
        sort(arr, 0, arr.length-1);
        for(int each: arr){
            System.out.println(each);
        }
    }
}
