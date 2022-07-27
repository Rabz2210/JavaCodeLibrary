package com.queue;
import java.util.Comparator;
import java.util.PriorityQueue;


// Priority Queue Implementation of Max Heap, Maximum Element is always at the top

public class DescendingPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        pq.add(10);
        pq.add(7);
        pq.add(100);
        pq.add(1);
        System.out.println(pq.peek());
    }   
}



class IntegerComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer I1, Integer I2){
        return I2.compareTo(I1);

    }
}
