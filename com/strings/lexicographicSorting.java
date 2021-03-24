package com.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lexicographicSorting {
    public static void main(String[] args) {
        List<String> sl = new ArrayList<String>();
        sl.add("abc");
        sl.add("cde");
        sl.add("acb");
        System.out.println(sl.size());
        Collections.sort(sl);
        for(String each:sl){
            System.out.print(each+" ");
        }
    }
}
