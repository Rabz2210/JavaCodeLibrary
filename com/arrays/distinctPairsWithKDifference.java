package com.arrays;
//https://www.geeksforgeeks.org/count-pairs-difference-equal-k/
public class distinctPairsWithKDifference {
    public static void mergeSort(int l, int r,int[] arr){
        if(l<r){
            int mid = l+(r-l)/2;
            mergeSort(l, mid,arr);
            mergeSort(mid+1, r, arr);
            merge(l,mid,r,arr);
        }
    }

    public static void merge(int l, int m,int r,int[] arr){
            int n1 = (m-l)+1;
            int n2 = (r-m);
            int[] L = new int[n1];
            int[] R = new int[n2];

            for(int i=0;i<n1;i++){
                L[i] = arr[l+i];
            }
            for(int j=0;j<n2;j++){
                R[j] = arr[m+1+j];
            }
        int k=l;
        int i=0;
        int j=0;
    while(i<n1 && j<n2){
                if(L[i]<R[j]){
                    arr[k]=L[i];
                    k++;
                    i++;
                }else{
                    arr[k]=R[j];
                    k++;
                    j++;
                }
            }
            while(i<n1){
                arr[k]=L[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k]=R[j];
                k++;
                j++;
            }
    }
    
    public static boolean binarySerach(int[] arr, int low, int high, int key){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==key)return true;
            if(arr[mid]>key){high=mid-1;}
            else{low=mid+1;}
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 4, 2};
        int k=3;
        int count=0;
        mergeSort(0, arr.length-1,arr);
        int length = arr.length;
        for(int i=0;i<length-1;i++){
            if(binarySerach(arr, i+1, length-1, arr[i]+k))count++;
        }
        System.out.println(count);

    }
}
