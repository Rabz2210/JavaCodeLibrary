package com.arrays;


//https://www.geeksforgeeks.org/maximum-occurred-integer-n-ranges/

public class maxiOccurIntergerNRanges {
    

    public static int maximumOccuredElement(int[] L,int[] R, int size){

        int indexArray[] = new int[1000];
        int maxi = -1;
        for(int i=0;i<size;i++){
            indexArray[L[i]]+=1;
            indexArray[R[i]+1] -= 1;
            if(R[i]>maxi){
                maxi = R[i];
            }
        }
        
        int[] prefixSum = new int[1000];
        prefixSum[0] = indexArray[0];
        int maxValue=0;
        int maxValueIndex=-1;
        for(int i=1;i<1000;i++){
            prefixSum[i]+=prefixSum[i-1]+indexArray[i];
            if(prefixSum[i]>maxValue){maxValue=prefixSum[i];maxValueIndex=i;}
        }
        return maxValueIndex;

    }

    public static void main(String[] args) {
        int[] L = { 1, 4, 9, 13, 21 }; 
        int[] R = { 15, 8, 12, 20, 30 }; 
        int n = L.length; 
        System.out.println(maximumOccuredElement(L, R, n)); 
    }
    
}
