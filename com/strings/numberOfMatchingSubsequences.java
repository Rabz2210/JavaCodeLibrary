package com.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class numberOfMatchingSubsequences {

    public static int numMatchingSubseq(String s, String[] words){
        Map<Character, List<Integer>> hashMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hashMap.containsKey(s.charAt(i))){
                hashMap.get(s.charAt(i)).add(i);
            }else{
                ArrayList<Integer> indices = new ArrayList<Integer>();
                indices.add(i);
                hashMap.put(s.charAt(i), indices);
            }
        }
        int count=0;
        for(String test:words){
            boolean StringMatch = false;
            int currentIndex=-1;
            for(Character letter: test.toCharArray()){
                boolean Match=false;
                if(!hashMap.containsKey(letter)){StringMatch=false;break;}
                for(Integer index:hashMap.get(letter)){
                    if(currentIndex<index){
                        currentIndex = index;
                        Match = true;
                        break;
                    }
                }
                if(!Match) {StringMatch=false;break;}
                else StringMatch = true;
            }
            if(StringMatch)count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"};
        System.out.println(numMatchingSubseq("dsahjpjauf",words));
    }
    
}
