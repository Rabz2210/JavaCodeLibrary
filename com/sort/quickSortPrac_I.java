package com.sort;

public class quickSortPrac_I {
    public static void quickSort(int[] arr){
        int len = arr.length;
        int i=1;
        int j=len-1;
        int pivot = 0;
        while(i<=j){
                if(arr[i]>arr[pivot])i++;
                if(arr[j]<=arr[pivot])j--;
                swap(i,j,arr);
        }
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{10,16,8,12,15,6,3,9,5};
        quickSort(arr);
    }
}
