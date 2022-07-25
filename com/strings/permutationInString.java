package com.strings;

import java.util.Arrays;

public class permutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        s1 = sort(s1);
        int size = s1.length();
        for(int i=0;i+size<=s2.length();i++){
            if(s1.equals(sort(s2.substring(i,i+size))))return true;
        }
        return false;
    }

    public static String sort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return arr.toString();
    }
    public static void main(String[] args) {
        
    }
}
