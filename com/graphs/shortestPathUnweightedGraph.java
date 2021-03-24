package com.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class shortestPathUnweightedGraph {
    public static void addEdge(LinkedList<Integer>[] arr, int u, int v){
        arr[u].add(v);
        arr[v].add(u);
    }

    public static int[] shrotestDistance(LinkedList<Integer>[] arr, int source){
        boolean[] visited = new boolean[arr.length];
        Queue<Integer>qu = new LinkedList<Integer>();
        int[] dist = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[source]=0;
        Iterator<Integer>itr;
        qu.add(source);
        while(qu.size()!=0){
            int x = qu.poll();
            visited[x]=true;
            itr = arr[x].iterator();
            while(itr.hasNext()){
                int j = itr.next();
                if(!visited[j]){
                    visited[j]=true;
                    dist[j]=dist[x]+1;
                    qu.add(j);
                }
            }
        }
        return dist;
        
    }

    public static void main(String[] args) {
        int size =5;
        LinkedList<Integer>[] arr = new LinkedList[size];
        for(int i=0;i<5;i++){
            arr[i] = new LinkedList<Integer>();
        }
        addEdge(arr, 0, 1);
        addEdge(arr, 0, 2);
        addEdge(arr, 0, 3);
        addEdge(arr, 2, 4);
        addEdge(arr, 4, 3);
        int[] res = shrotestDistance(arr,0);
        for(int i=0;i<arr.length;i++){
            System.out.println(i+" :"+res[i]);
        }
    }
    
}
