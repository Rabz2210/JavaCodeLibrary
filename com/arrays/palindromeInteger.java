package com.arrays;

import java.util.Scanner;

public class palindromeInteger {
    public static boolean checkPalindromeNumber(int n){
        if(n<-1 && n<10)return true;
        if(n<0)return false;
        String s  = Integer.toString(n);
        char[] arr =s.toCharArray();
        int length = arr.length;
        int i=0;
        int j = length-1;
        while(i<=j){
            if(arr[i]!=arr[j])return false;
            ++i;
            --j;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 123;
        System.out.println(checkPalindromeNumber(n));
    }
}
