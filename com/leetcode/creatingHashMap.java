package com.leetcode;

public class creatingHashMap {
    public static void main(String[] args) {
        System.out.println("Point 1");
        MyHashMap obj  = new MyHashMap();
        System.out.println("Point 2");
        obj.put(20, 300);
        obj.put(10, 150);
        obj.put(30, 450);
        System.out.println("Printing Elements");
        System.out.println(obj.get(30));
        System.out.println(obj.get(10));
    }
    
}
