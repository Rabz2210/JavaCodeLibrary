package com.strings;
//https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
public class allPermutationsOfString {

    public static void permutationsOfString(String str, int l, int h){
        if(l==h){
            System.out.println(str);
            return;
        }
        for(int i=l;i<h;i++){
            str = swap(str,l,i);
            permutationsOfString(str, l+1, h);
            str = swap(str, i, l);
        }
    }
    
   public static String swap(String str, int i, int j){
            char[] arr= str.toCharArray();
            char temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String str = "ABC";
        permutationsOfString(str, 0, str.length());
    }
}
