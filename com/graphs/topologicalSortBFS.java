package com.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class topologicalSortBFS {
    private static LinkedList<Integer>[] arr;

    public static void add(int u, int v){
        arr[u].add(v);
    }

    private static void topological(){
        int[] indegree = constructInDegree(arr.length);
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(indegree[i]==0)q.add(i);
        }
        if(q.size()==0){
            System.out.println("This is a cyclic graph");
            return;
        }

        while(q.peek()!=null){
           int parent = q.poll();
           System.out.print(parent+" ");
            for(Integer each: arr[parent]){
                indegree[each]-=1;
                if(indegree[each]==0){
                    q.add(each);
                }
            }
        }
    }

    private static int nextZeroIndegree(int[] indegree){
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                indegree[i]=-1;
                return i;
            }
        }
        return -1;
    }

    private static int[] constructInDegree(int size){
        int[] res = new int[size];
        for(int i=0;i<size;i++){
            for(Integer each:arr[i]){
                res[each]+=1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int size = 8;
        arr = new LinkedList[size];
        for(int i=0;i<size;i++){
            arr[i] = new LinkedList<Integer>();
        }
        // add(0, 2);
        // add(0, 3);
        // add(2, 3);
        // add(1, 3);
        // add(1, 4);
        // topological(0);

        add(0, 3);
        add(3 , 5);
        add(1, 4);
        add(4, 6);
        add(3, 6);
        add(1, 7);
        add(3, 7);
        add(2, 4);
        add(2, 7);
        topological();
    }

    
}
