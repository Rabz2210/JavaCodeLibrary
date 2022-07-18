package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashMaptest {
    
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new TreeMap<Integer,Integer>();
        mp.put(3,3);
        mp.put(5, 7);
        mp.put(1,2);
        mp.put(2,3);
        mp.put(4, 5);
        for(Map.Entry<Integer,Integer> each: mp.entrySet()){
            System.out.println(each.getKey()+" : "+each.getValue());
        }
    }
}
