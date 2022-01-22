package com.strings;

import java.util.Scanner;

public class isAnAnagram {

    public static boolean Anagram(String inputA, String inputB) {
        if(inputA.length()!=inputB.length())return false;
        int[] charArry = new int[126];
        int length = inputA.length();
        for(int i=0;i<length;i++){
            charArry[inputA.charAt(i)+0] +=1; 
            charArry[inputB.charAt(i)+0] -=1;
        }
        
        for(int i:charArry){
            if(i!=0)return false;
        }
        return true;
      }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(Anagram("cinema", "iceman"));


    }
}
