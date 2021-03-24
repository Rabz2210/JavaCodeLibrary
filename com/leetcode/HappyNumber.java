package com.leetcode;

public class HappyNumber {
    public static boolean happyNumber(int n){
        int sum=0;
        while(n!=0){
             sum += Math.pow(n%10,2);
             n=n/10;
        }
        if(sum==1)return true;
        else if(sum==2 || sum==3)return false;
        else return happyNumber(sum);
    }

    public static void main(String[] args) {
        //System.out.println(happyNumber(19));
        System.out.println(happyNumber(2));
    }
    
}
