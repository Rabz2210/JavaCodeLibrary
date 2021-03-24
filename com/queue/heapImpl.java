package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class heapImpl {
    public static void main(String[] args) {
        Queue<Integer>qu = new PriorityQueue<Integer>((a,b)->a-b);
        qu.add(9);
        qu.add(5);
        qu.add(2);
        qu.add(4);
        qu.add(1);
        while(qu.size()!=0){
            System.out.println(qu.poll());
        }
    }
}
