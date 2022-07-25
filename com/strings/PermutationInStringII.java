package com.strings;

public class PermutationInStringII {

    public static boolean checkInclusion(String s1,String s2){
        int[] s1map = frequencyMap(s1);
        int size  = s1.length();
        for(int i=0;i+size<=s2.length();i++){
            int[] s2map = frequencyMap(s2.substring(i, i+size));
            if(MapEquals(s1map,s2map))return true;
        }
        return false;
    }

    public static boolean MapEquals(int[] s1map, int[] s2map){
        for(int i=0;i<26;i++){
            if(s1map[i]!=s2map[i])return false;
        }
        return true;
    }

    public static int[] frequencyMap(String s){
        int length = s.length();
        int[] charFrequency = new int[26];
        for(int i=0;i<length;i++){
            charFrequency[s.charAt(i)-'a'] = charFrequency[s.charAt(i)-'a']+1;
        }
        return charFrequency;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
}
