package com.rough;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestingSets {
    public static void main(String[] args) {
        SortedSet<Integer> st = new TreeSet<Integer>();
        st.add(2);
        st.add(4);
        st.add(3);
        st.add(1);
        System.out.println(st.size());
        st.remove(1);
        System.out.println(st.size());

            
        
    }
}
