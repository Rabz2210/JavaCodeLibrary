package com.arrays;

import java.util.Map;
import java.util.TreeMap;

import com.binarysearch.firstAndLastPosition;

//https://leetcode.com/problems/hand-of-straights/
public class handOfStraights {
    public static boolean isPossibleDivide(int[] nums, int k){
        TreeMap<Integer, Integer>treeMap = new TreeMap<Integer, Integer>();
        for(int each:nums){
            treeMap.put(each, treeMap.getOrDefault(each, 0)+1);
        }
        while(treeMap.size()!=0){
            int start = treeMap.firstKey();
            for(int i=1;i<k;i++){
                int next = start+i;
                if(treeMap.containsKey(next)){
                    treeMap.put(next, treeMap.get(next)-1);
                    if(treeMap.get(next)==0)treeMap.remove(next);
                }else{
                    return false;
                }
            }
            treeMap.put(start,treeMap.get(start)-1);
            if(treeMap.get(start)==0)treeMap.remove(start);
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
    
}
