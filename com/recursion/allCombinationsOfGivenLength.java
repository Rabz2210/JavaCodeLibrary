package com.recursion;

public class allCombinationsOfGivenLength {
    public static void allCombiLength(char[] arr, int n,String prefix){
        if(n<=0){System.out.println(prefix);return;}
        for(int i=0;i<arr.length;i++){
            allCombiLength(arr, n-1, prefix+arr[i]);
        }
    }
    public static void main(String[] args) {
        allCombiLength(new char[]{'a','b','c'}, 3, "");
    }
}
