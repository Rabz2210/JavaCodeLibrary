package com.hashing;

import java.util.HashSet;

//https://www.geeksforgeeks.org/find-if-there-is-a-subarray-with-0-sum/

public class subarrayWith0Sum {
    public static boolean hasZeroSumSubarray(int[] ary){
        int[] prefixSum = new int[ary.length];
        prefixSum[0] = ary[0];
        HashSet<Integer>hs = new HashSet<Integer>();
        int length = ary.length;
        for(int i=1;i<length;i++){
            prefixSum[i] = prefixSum[i-1]+ary[i];
            if(hs.contains(prefixSum[i]))return true;
            else{hs.add(prefixSum[i]);}
        }
        return false;
    }
    
}
