package com.arrays;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/array-rotation/
//Given an array we need to rotate it counterClockwise

public class rotateAnArray {
    /*Rotates an array using O(n) time and O(n) Space using a different array to store the elements
    We use the second array to store the elements to be rotated. Shift all the elements in the original array 
    and then add the elements form the second array back towards the end of the original array , thus rotating the array.
    to be rotated.
    */
    public static int[] rotateUsingTwoDifferentArrays(int[] arr,int noOfRotations){
    int size = arr.length;
    List<Integer>ls = new ArrayList<Integer>();
    int i;
    for(i=0;i<noOfRotations;i++){
        ls.add(arr[i]);
        }
    for(i=0;i<arr.length-noOfRotations;i++){
        arr[i]=arr[i+noOfRotations];
        }
        int j=0;
        for(i=arr.length-noOfRotations,j=0;i<arr.length && j<noOfRotations; i++,j++){
            arr[i] = (int)ls.get(j);
        }
        return arr;
    }

    /*Rotates an array in place but in O(n^2) time complexity without using any extra space
    We use tow loops. We take the first element of the array into a temp varable. shift all the elements of the original array and then
    add the temp variable to the end of the array. we do this for k time if the array is to be rotated k time.
    */
    public static int[] rotateInPlace(int[] arr, int noOfRotations){
        int i=0;
        int j=0;
        while(i<noOfRotations){
            int temp = arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j] = temp;
            i++;
        }
        return arr;

    }

    /*Rotates array in place in O(n) time
    
    */
    public static int[] jugglingAlgorithm(int[] arr, int noOfRotations){

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        int k=3;
        int[] res = rotateInPlace(arr, k);
        for(int i:res){
            System.out.print(i);
        }
    }
    
}
