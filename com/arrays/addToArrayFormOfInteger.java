package com.arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/add-to-array-form-of-integer/
public class addToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int digit = 0;
        int size = A.length;
       for(int j = size-1;j>=0;j--){
           if(A[j]==0){digit +=Math.pow(10, j);}
           digit +=A[j]*Math.pow(10,j);
       }
       digit = digit +K;
       
       ArrayList<Integer>al = new ArrayList<Integer>();
       while(digit!=0){
           al.add(digit%10);
           digit = digit/10;
       }
       return al;
   }
   public static void main(String[] args) {
       int[] arr = new int[]{1,2,0,0};
       int k = 34;
       ArrayList
    }
}
