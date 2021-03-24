package com.hashing;

//This is a basic implementation of a hashMap that is used to store only numbers
class hashMap{
    int maxVaue;
    int[] arr;
    
    hashMap(){
        maxVaue = 100000;
        arr = new int[maxVaue];
        for(int i=0;i<maxVaue;i++){
            arr[i]=-1;
        }
    }

    public int put(int key,int value){
        int hash = key%maxVaue;
        if(arr[hash]!=-1)return -1;
        arr[hash]=value;
        return 0;
    }

    public int get(int key){
        int hash = key%maxVaue;
        return arr[hash];
    }
}

public class designingHashmap {
    public static void main(String[] args) {
        hashMap obj = new hashMap();
        obj.put(2, 45);
        obj.put(5, 60);
        obj.put(12, 36);
        System.out.println(obj.get(5));
        System.out.println(obj.get(4));
        System.out.println(obj.hashCode()&(15));
    }
}
