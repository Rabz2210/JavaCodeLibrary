package com.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacters {
    public static char nonRepeat(String S){
        Map<Character,Integer>mp = new LinkedHashMap<Character,Integer>();
        for(int i=0;i<S.length();i++){
            char temp = S.charAt(0);
            if(mp.containsKey(temp)){
                int count = mp.get(temp);
                count++;
                mp.put(temp,count);
            }
            else{
                mp.put(temp,1);
            }
        }
        for(Map.Entry<Character,Integer> temp:mp.entrySet()){   
                if(temp.getValue()==1)
                return temp.getKey();
        }
        return '$';
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(nonRepeat(s));

    }
    
}
