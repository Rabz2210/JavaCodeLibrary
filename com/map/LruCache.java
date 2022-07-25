package com.map;
import java.util.*;

/*
 
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4); 


 */

public class LruCache {

}


class Node{
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class cache{
    Map<Integer,Node> mp;
    Node head;
    Node tail;
    int capacity;

    cache(int capacity){
        mp = new HashMap<>(capacity);
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    public void put(int key, int value){
       if(mp.containsKey(key)){
        remove(mp.get(key));
       }
       if(mp.size()==capacity){
        remove(tail.prev);
       }
       add(new Node(key, value));

    }

    public int get(int key){
            if(mp.containsKey(key)){
                Node temp = mp.get(key);
                remove(temp);
                add(temp);
                return temp.value;
            }else{
                return -1;
            }
    }

    public void remove(Node node){
        mp.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }


    public void add(Node node){
        mp.put(node.key, node);
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    

}