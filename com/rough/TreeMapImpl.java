package com.rough;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl {

    public static void main(String[] args) {
        Map<Integer,Integer> tmp = new TreeMap<Integer,Integer>(Collections.reverseOrder());
        tmp.put(9, 90);
        tmp.put(8, 80);
        tmp.put(7, 70);
        tmp.put(6, 60);
        for(Map.Entry<Integer,Integer>m:tmp.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    
}
