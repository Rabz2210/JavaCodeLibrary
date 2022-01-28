package com.strings;

import java.util.Scanner;

public class reverseOnlyAlphabets {
    public static String reverseOnlyAlphabetical(String input) {
        int length = input.length();
        char[] arr = input.toCharArray();
        int i=0;
        int j = length-1;
        while(i<=j){
            if(isAnAlphabet(arr[i]) && isAnAlphabet(arr[j])){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(!isAnAlphabet(arr[i]))i++;
            else j--;
        }
        return new String(arr);
    }

    public static boolean isAnAlphabet(char ch){
        if((ch>64 && ch< 91)|| (ch>96 && ch<123))return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(reverseOnlyAlphabetical(str));
    }
}
