package com.rough;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AllPermutations {
    
    public static void main(String[] args) {
        String name = "eidbaooo";
        int length = name.length();
        Set<String> hs = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        int size=1;
        while(size<length){
            for(int i=0;i+size<=length;i++){
                hs.add(name.substring(i, i+size));
            }
            size++;
        }
        System.out.println();
        System.out.println();
        for(String each:hs){
            System.out.println(each);
        }
    }
}
