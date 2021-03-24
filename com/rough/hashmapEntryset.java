package com.rough;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Ways to iterate a hashmap


public class hashmapEntryset {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        hm.put(10, 101);
        hm.put(23, 134);
        hm.put(56, 199);
        hm.put(34, 170);
        Iterator itr = hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry element = (Map.Entry)itr.next();
            System.out.println("Key :"+element.getKey()+" "+"Value :"+element.getValue());

        }

        System.out.println("===============================================");
        for(Map.Entry entryset:hm.entrySet()){
            System.out.println("Key :"+entryset.getKey()+" "+"value :"+entryset.getValue());
        }

        System.out.println("===================================================");
        Set<Integer> set = hm.keySet();
        Iterator setItr = set.iterator();
        while(setItr.hasNext()){
            int key = (int)setItr.next();
            System.out.println("key :"+key+" value: "+hm.get(key));
        }
        System.out.println("Ending");


    }
    


    
}
