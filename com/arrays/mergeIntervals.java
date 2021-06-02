package com.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
//https://leetcode.com/problems/merge-intervals/
public class mergeIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]>merged = new LinkedList<>();
        for(int[] interval:intervals){
            if((merged.size()!=0) && (merged.getLast()[0]>=interval[0])){
                merged.getLast()[1] = interval[1];
            }else{
                merged.add(interval);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }


    
}
