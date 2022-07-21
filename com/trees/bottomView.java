package com.trees;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class bottomView {

    private static SortedMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
    
    private static void bottonView(Node n){
        view(n, 0);
        for(Map.Entry<Integer,Integer> each:map.entrySet()){
            System.out.println(each.getValue());
        }
        
    }

    private static void view(Node n, Integer d){
        if(n==null)return;
        map.put(d,n.data);
        if(n.left!=null)view(n, --d);
        if(n.right!=null)view(n, ++d);
    }

    public static void main(String[] args) {
        
    }
}
