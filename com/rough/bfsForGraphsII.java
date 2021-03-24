package com.rough;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class bfsForGraphsII {
   public static void addEdge(LinkedList<Integer>[] arr, int u, int v){
        arr[u].add(v);
        arr[v].add(u);
    }

    public static int shortestPath(LinkedList<Integer>[] arr, int source,int destination){
        boolean[] visited = new boolean[arr.length];
        Queue<Integer>qu = new LinkedList<Integer>();
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++)res[i]=Integer.MAX_VALUE;
        res[source]=0;
        Iterator<Integer>itr;
        qu.add(source);
        while(qu.size()!=0){
            int x = qu.poll();
            itr = arr[x].iterator();
            while(itr.hasNext()){
                int j = itr.next();
                if(!visited[j]){
                    visited[j]=true;
                    res[j]=res[x]+1;
                    qu.add(j);
                }
            }
        }
        return res[destination];
        
    }




    public static void main(String[] args) {
        LinkedList<Integer>[] arr = new LinkedList[5];
        int v = 5;
        for(int i=0;i<5;i++){
            arr[i] = new LinkedList<Integer>();
        }
        addEdge(arr,0,1);
        addEdge(arr,0,2);
        addEdge(arr,0,3);
        addEdge(arr,2,4);
        addEdge(arr,4,3);
        System.out.println(shortestPath(arr,4,1));
    }
    
}
