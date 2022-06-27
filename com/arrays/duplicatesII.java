package com.arrays;
import java.util.*;


public class duplicatesII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<len;i++){
            int absValue = Math.abs(k-i);
            if(mp.containsKey(absValue) && mp.get(absValue)==nums[i]){
                return true;
            }else{
                mp.put(i,nums[i]);
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1,2,3};
        int k=2;
        System.out.println(containsNearbyDuplicate(arr,k));
    }
}
