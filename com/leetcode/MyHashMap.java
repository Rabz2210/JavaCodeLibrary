package com.leetcode;

public class MyHashMap {
    int[] arr;
    int index;
    MyHashMap(){
        arr = new int[1000000];
        int i=0;
        while(i<1000000){
            arr[i]=-1;
            i++;
        }
    }

    public void put(int key, int value){
        index = key%1000000;
        arr[index]=value;
    }
    public int get(int key){
        index = key%1000000;
        return arr[index];
    }

    public void remove(int key){
        index = key%1000000;
        arr[index] = -1;
    }
}
