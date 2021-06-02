package com.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

//https://leetcode.com/problems/meeting-rooms-ii

public class MeetingsII {
    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        Queue<Integer>pq = new PriorityQueue<Integer>();
        pq.add(intervals[0][1]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=pq.peek()){pq.poll();}
            pq.add(intervals[i][1]);
        }
        return pq.size();
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{0,30},{5,10},{15,20}};
        System.out.println(minMeetingRooms(arr));
        
    }
    
}
