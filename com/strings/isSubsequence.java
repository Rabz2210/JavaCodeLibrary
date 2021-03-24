package com.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/is-subsequence/

public class isSubsequence {

    public static boolean testSubsequence(String s, String t) {
        char[] sub = s.toCharArray();
        char[] tstring = t.toCharArray();
        int j=0;
        int count = 0;
        for(int i=0;i<sub.length;i++){
            while(j<tstring.length){
                 if(sub[i]==tstring[j]){
                     count++;
                     j++;
                     break;
                 }
                j++;
            }
        }
        return count==sub.length;
    }

    public static boolean testSubsequence_hashMap(String s, String t){
        Map<Character, List<Integer>> hashMap = new HashMap<Character, List<Integer>>();
        for(int i=0;i<t.length();i++){
            if(hashMap.containsKey(t.charAt(i))){
                hashMap.get(t.charAt(i)).add(i);
            }else{
                ArrayList<Integer> indices = new ArrayList<Integer>();
                indices.add(i);
                hashMap.put(t.charAt(i), indices);
            }
        }

        int currentIndex = -1;
        for(Character letter: s.toCharArray()){
            boolean Matched=false;
            if(!hashMap.containsKey(letter))return false;
            for(Integer index : hashMap.get(letter)){
                if(currentIndex<index){
                    currentIndex = index;
                    Matched=true;
                    break;
                }
            }
            if(!Matched)return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(testSubsequence_hashMap("abc", "ahbgdc"));
        System.out.println(testSubsequence_hashMap("axc", "ahbgdc"));
    }
    
}
