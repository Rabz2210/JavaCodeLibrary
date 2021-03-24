package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class connectingNropes {
    public static int costOfConnectingRopes(int[] arr){
        if(arr.length==0)return 0;
        int cost=0;
        Queue<Integer>qu = new PriorityQueue<Integer>((a,b)->a-b);
        for(int each:arr){
            qu.add(each);
        }
        while(qu.size()>1){
            int r1 = qu.poll();
            int r2 = qu.poll();
            cost += r1+r2;
            qu.add(r1+r2);
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,13,15};
        System.out.println(costOfConnectingRopes(arr));
    }
    
}
