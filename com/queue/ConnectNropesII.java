package com.queue;
import java.util.*;

public class ConnectNropesII {

    public static long minCost(long arr[], int n) 
    {
        ArrayList<Long> ls = new ArrayList<Long>();
        for(Long each: arr){
            ls.add(each);
        }
        PriorityQueue<Long> pq = new PriorityQueue<Long>(ls);
        Long newRope = 0L;
        Long Cost = 0L;
        while(pq.size()>1){
            Long part1 = pq.poll();
            Long part2 = pq.poll();
            newRope = part1+part2;
            Cost +=newRope;
            pq.add(newRope);
        }
        return Cost;
    }
    
    public static void main(String[] args) {
        long[] arr= new long[]{4, 3, 2, 6};
        System.out.println(minCost(arr, 4));

    }
}
