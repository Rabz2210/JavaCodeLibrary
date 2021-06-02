package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

//https://www.geeksforgeeks.org/leaders-in-an-array/
public class LeadersInAnArray {
    public static ArrayList<Integer> Leaders(int[] arr,int n){
       // Your code here
        ArrayList<Integer>res = new ArrayList<Integer>();
        return res;
        
    }
    public static void main(String[] args) {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        ArrayList<Integer>res = Leaders(arr,arr.length);
        for(int each:res){
            System.out.println(each);
        }
    }
}
