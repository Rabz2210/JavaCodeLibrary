package com.sort;

public class quickSortPrac_II {
    public static void sort(int[] arr, int start, int end){

        if(start<end){
            int partion = partitionIndex(arr, start, end);
            sort(arr, start, partion-1);
            sort(arr, partion+1, end);
        }
    }

    public static int partitionIndex(int[] arr, int start, int end){

        int pIndex=start;
        int pivot = arr[end];
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                swap(i, pIndex, arr);
                ++pIndex;
            }
        }
        swap(pIndex, end, arr);
        return pIndex;
    }


    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{3,45,7,8,7,2,1,0,4};
        sort(arr, 0, arr.length-1);
        for(int each: arr){
            System.out.println(each);
        }

    }
}
