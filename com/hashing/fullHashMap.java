package com.hashing;

//An Implementation to design a hashmap which handles colliions on the basis of dynamic chaining
import java.util.ArrayList;

class hashNode<K,V>{
    K Key;
    V Value;
    hashNode<K,V>Next;

    hashNode(K Key,V Value){
        this.Key=Key;
        this.Value = Value;
    }
}


class Hash_Map<K,V>{
    private ArrayList<hashNode<K,V>> bucket;

    private int initialsize;

    Hash_Map(){
        initialsize = 16;
        bucket = new ArrayList<hashNode<K,V>>();
        for(int i=0;i<initialsize;i++){
            bucket.add(null);
        }
    }

    private int getHash(K Key){
        return (Key.hashCode() & (initialsize-1));
    }

    public void add(K Key, V Value){
        int index = getHash(Key);
        hashNode<K,V> newNode = new hashNode<K,V>(Key,Value);
        hashNode<K,V> head = bucket.get(index);
        while(head.Next!=null){
            if(head.Key.equals(Key)){head.Value = Value;return;}
            head = head.Next;
        }
        head = bucket.get(index);
        newNode.Next = head;
        bucket.set(index,newNode);
    }

    public V get(K Key){
        int index  = getHash(Key);
        if(bucket.get(index)==null)return null;
        else{return bucket.get(index).Value;}
    }
    
}

public class fullHashMap {
    public static void main(String[] args) {
        
    }
}
