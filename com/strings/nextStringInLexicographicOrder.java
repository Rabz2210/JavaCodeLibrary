package com.strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class nextStringInLexicographicOrder {
    public static ArrayList<String> als;

    public static void allStringPermutations(String str,int l,int r){
        if(l>r){
            als.add(str);
            return;
        }
        for(int i=l;i<=r;i++){
            str = substitute(str, i, l);
            allStringPermutations(str, l+1, r);
            str = substitute(str, l, i);
        }
    }

    public static String substitute(String s,int j, int k){
        char[] charArray = s.toCharArray();
        char temp = charArray[j];
        charArray[j]=charArray[k];
        charArray[k]=temp;
        return String.valueOf(charArray);
    }

    public static void nextString(String str){
        als = new ArrayList<String>();
        Collections.sort(als);
        allStringPermutations(str, 0, str.length()-1);
        
     
    }

    public static void main(String[] args) {
        nextString("ABC");
    }

}
    
