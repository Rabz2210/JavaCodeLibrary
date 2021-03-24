package com.rough;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class maps {
    public static void main(String[] args) {
        Map<Integer,Integer>mp = new HashMap<Integer,Integer>();
        mp.put(1, 10);
        mp.put(2, 20);
        mp.put(3, 30);
        mp.put(4, 40);
        Set<Integer>st = mp.keySet();
        Iterator<Integer>itr = st.iterator();
        while(itr.hasNext()){
            System.out.println(mp.get(itr.next()));
        }
        for(Map.Entry<Integer,Integer> m:mp.entrySet()){
            System.out.println(m.getKey()+": "+m.getValue());
        }
        
    }
}
