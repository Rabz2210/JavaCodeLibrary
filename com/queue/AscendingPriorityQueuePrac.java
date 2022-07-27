package com.queue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Min Heap Implementation

//Lowest Element at the top


public class AscendingPriorityQueuePrac {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(1);
        pq.add(5);
        pq.add(-1);
        System.out.println(pq.peek());
        
        System.out.println();
        System.out.println();
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        int[] arr = new int[]{5,2,9,0,-1};
        List<Integer> ls = Arrays.stream(arr).boxed().collect(Collectors.toList());
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(ls);

    }
}
