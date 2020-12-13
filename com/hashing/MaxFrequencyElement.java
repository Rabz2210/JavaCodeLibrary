package com.hashing;

import java.util.HashMap;
import java.util.Set;



public class MaxFrequencyElement {
    public static int maximumOccurEle(int[] elements){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int value=0;
        for(int i:elements){
            value=0;
            if(!hm.containsKey(i))hm.put(i,value++);
            else{
                value = hm.get(i).intValue();
                hm.replace(i, value,++value);
            }
        }
        value=0;
        int element=-9999;
        Set<Integer> keys = hm.keySet();
        for (Integer i : keys) {
            if(hm.get(i).intValue()>value){value=hm.get(i).intValue();element=i;}
        }
        return element;
    }
    public static void main(String[] args) {
        int[] ary = new int[]{5,6,8,3,6,8,5,6,6,7};
        System.out.println("Element :"+maximumOccurEle(ary));
        
    }
}
