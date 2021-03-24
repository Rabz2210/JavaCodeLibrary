package com.strings;

import java.util.*;

//https://www.geeksforgeeks.org/program-print-substrings-given-string/

public class allPossibleSubstring {
    
    public static List<String> allPossibleStrings(String s){
        List<String> al = new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                al.add(s.substring(i, j+1));
            }
        }
        return al;
    }


    public static void main(String[] args) {
        String s = "dbca";
        List<String> al = allPossibleStrings(s);
        for(String each:al){
            System.out.println(each);
        }
        
        
    }
}
