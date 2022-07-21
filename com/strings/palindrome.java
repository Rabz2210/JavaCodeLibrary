package com.strings;

public class palindrome {
    public static boolean ifPalindrome(String s){
        int len = s.length();
        if(len<2)return true;
        int low=0;
        int hi = len-1;
        while(low<hi && s.charAt(low)==s.charAt(hi)){
           low++;
           hi--;
        }
        if(low==hi)return true;
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(ifPalindrome("Rabbani"));
        System.out.println(ifPalindrome("malayalam"));
    }
}
