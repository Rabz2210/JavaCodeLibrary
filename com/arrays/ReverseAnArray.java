package com.arrays;
//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
public class ReverseAnArray {
    public static int[] reverse(int[] ary){
        int size=ary.length;
        int temp=0;
        for(int i=0;i<size/2;i++){
            temp=ary[i];
            ary[i] = ary[size-(i+1)];
            ary[size-(i+1)] = temp;
        }
        return ary;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,9,8,11,45,60};
        int[] res = reverse(arr);
        for(int i:res){
            System.out.print(" "+i);
        }
    }
}
