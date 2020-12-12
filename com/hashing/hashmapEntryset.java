package com.hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
https://www.educative.io/edpresso/how-to-iterate-a-hashmap-in-java?utm_source=
Google%20AdWords&aid=5082902844932096&utm_medium=cpc&utm_campaign=kb-dynamic-edpresso&gclid=
CjwKCAjwz6_8BRBkEiwA3p02Vcj1sKRHhJ8VYtSLDMKG0KxlReJIrO99jl_DMw3bpWytj5jRMxgSCRoC33gQAvD_BwE

Ways to iterate a hashmap
*/


public class hashmapEntryset {
    public static void main(String[] args) {

        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        hm.put(10, 101);
        hm.put(23, 134);
        hm.put(56, 199);
        hm.put(34, 170);
        Iterator<Map.Entry<Integer,Integer>> itr = hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,Integer> element = (Map.Entry<Integer,Integer>)itr.next();
            System.out.println("Key :"+element.getKey()+" "+"Value :"+element.getValue());

        }

        System.out.println("===============================================");
        for(Map.Entry<Integer,Integer> entryset:hm.entrySet()){
            System.out.println("Key :"+entryset.getKey()+" "+"value :"+entryset.getValue());
        }

        System.out.println("===================================================");
        Set<Integer> set = hm.keySet();
        Iterator<Integer> setItr = set.iterator();
        while(setItr.hasNext()){
            int key = (int)setItr.next();
            System.out.println("key :"+key+" value: "+hm.get(key));
        }
        System.out.println("Ending");
    }
    


    
}
