package com.rough;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class sets {
    public static void main(String[] args) {
        // Set<Integer>st = new HashSet<>();
        // st.add(1);
        // st.add(2);
        // st.add(null);
        // st.add(5);
        // for(Integer i:st){
        //     System.out.print(" "+i);
        // }
        // System.out.println();
        // System.out.println("======================");
        // System.out.println();
        
        // Set<Integer>lhs = new LinkedHashSet<Integer>();
        // lhs.add(5);
        // lhs.add(1);
        // lhs.add(2);
        // lhs.add(4);
        // for(Integer i:lhs){
        //     System.out.print(" "+i);
        // }
        // System.out.println();
        System.out.println("");
        Set<Integer>tst = new TreeSet<Integer>();
        tst.add(10);
        tst.add(11);
        tst.add(12);
        tst.add(1);
        tst.add(-4);
        for(Integer i:tst){
            System.out.println(i);
        }
        System.out.println(tst.contains(12));
        System.out.println(tst.add(7));

    }
}
