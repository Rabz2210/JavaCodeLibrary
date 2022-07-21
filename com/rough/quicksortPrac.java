package com.rough;

public class quicksortPrac {

    public static void quickSort(int[] arr, int start, int end){

            if(start<end){
                int partiIndex = getParitions(arr, start, end);
                quickSort(arr, start, partiIndex-1);
                quickSort(arr, partiIndex+1, end);
            }
    }


    public static int getParitions(int[] arr, int start, int end){
        int pivot = arr[end];
        int pIndex = start;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                swap(arr, i, pIndex);
                ++pIndex;
            }
        }
        swap(arr, pIndex, end);
        return pIndex;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,4,9,0,1,3,6,13,63,5};
        quickSort(arr, 0, arr.length-1);
        for(int each: arr){
            System.out.println(each);
        }
    }
}
