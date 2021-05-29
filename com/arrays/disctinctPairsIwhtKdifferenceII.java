package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class disctinctPairsIwhtKdifferenceII {
    
    public static int distinctPairs(int[] arr, int k){
        Set<Integer>hs = new HashSet<Integer>();
        for(int each:arr){
            hs.add(each);
        }
        int count=0;
        for(int each:arr){
            if(hs.contains(each+k)){count++;}
            if(hs.contains(each-k)){count++;}
            hs.remove(each);
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{8, 12, 16, 4, 0, 20};
        int k =4;
        System.out.println(distinctPairs(arr, k));
        
    }
}
