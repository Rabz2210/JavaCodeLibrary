package com.rough;

import java.util.PriorityQueue;

public class testingPriorityQueue {
public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b-a);
    pq.add(10);
    pq.add(11);
    pq.add(2);
    pq.add(5);
    pq.add(18);

    System.out.println("Queue Size: "+pq.size());
    System.out.println("Queue Head element"+pq.poll());
    
}

    
}
