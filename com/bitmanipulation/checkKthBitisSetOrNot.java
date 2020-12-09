package com.bitmanipulation;

public class checkKthBitisSetOrNot {
    public static boolean kthBitSetOrNot(int n, int k){
        int i=1;
        i=i<<k-1;
        if((n&i)>0)return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(kthBitSetOrNot(5, 1));
        System.out.println(kthBitSetOrNot(2, 3));
    }
    
}
