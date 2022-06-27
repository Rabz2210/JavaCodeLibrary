package com.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class shortestDistFromSourceToEveryVertex {
    
    private static LinkedList<Integer>[] arr;

    private static void addEdge(int u, int v){
        arr[u].add(v);
        arr[v].add(u);
    }

    public static int[] shortestDist(int source){
        int[] dist = new int[arr.length];
        boolean[] visited = new boolean[arr.length];
        visited[source] = true;
        dist[source]=0;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(source);
        while(q.peek()!=null){
            Integer temp = q.poll();
            Iterator itr = arr[temp].listIterator();
            while(itr.hasNext()){
                Integer neighbour = (Integer)itr.next();
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    dist[neighbour] = dist[temp]+1;
                    q.add(neighbour);
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        arr = new LinkedList[4];
        for(int i=0;i<4;i++){
            arr[i] = new LinkedList<Integer>();
        }
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 3);
        int[] res = shortestDist(0);
        for(int each: res){
            System.out.println(" "+each);
        }

        arr = new LinkedList[6];
        for(int i=0;i<6;i++){
            arr[i] = new LinkedList<Integer>();
        }
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(0, 4);
        addEdge(1, 3);
        addEdge(2, 3);
        addEdge(2, 4);
        addEdge(3, 5);
        addEdge(4, 5);
        res = shortestDist(0);
        for(int each:res){
            System.out.println(each+" ");
        }
    }
}
