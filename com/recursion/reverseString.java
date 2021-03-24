package com.recursion;

public class reverseString {
    public static char[] reverse(int si,int ei, char[] toReverse){
        if(si>ei)return toReverse;
        char temp = toReverse[si];
        toReverse[si] = toReverse[ei];
        toReverse[ei] = temp;
        toReverse = reverse(si+1,ei-1,toReverse);
        return toReverse;  
    }
    public static void main(String[] args) {
        char[] arr = {'M','O','H','A','M','M','A','D'};
        char[] res = reverse(0, arr.length-1, arr);
    }
}
