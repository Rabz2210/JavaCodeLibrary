package com.rough;

public class longestPalindromicSubstring{
    public static void longest(String s){
        int len = s.length();
        if(len<2)System.out.println(s);
        int low;
        int high;
        int start=0;
        int maxlength = -1;
        for(int i=0;i<len;i++){
            low = i-1;
            high = i+1;
            while(high<len && s.charAt(i)==s.charAt(high))
            high++;
            
            while(low>0 && s.charAt(low)==s.charAt(i))
            low--;

            while(low>=0 && high<len && s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;
            }

            int length = high-low-1;
            if(length>maxlength){
                 start = low+1;
                maxlength = length;
            }
            
        }
        System.out.println(s.substring(start, (start+maxlength)));
    }

    public static void main(String[] args) {
        String s="geeksforgteetks";
        longest(s);
    }
}