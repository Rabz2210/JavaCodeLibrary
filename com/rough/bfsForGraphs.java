package com.rough;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class bfsForGraphs {
    public static void addEdge(ArrayList<Integer>[]arr, int u, int v){
        arr[u].add(v);
        arr[v].add(u);
    }

    public static void bfs(ArrayList<Integer>[]adjList, int root){
        boolean[] visited = new boolean[adjList.length];
        Queue<Integer>qu = new LinkedList<Integer>();
        qu.add(root);
        Iterator<Integer>itr;
        while(qu.size()!=0){
            int n = qu.poll();
            System.out.println(n);
            if(!visited[n])visited[n]=true;
             itr = adjList[n].listIterator();
            while(itr.hasNext()){
                int ele = itr.next();
                if(!visited[ele]){
                    visited[ele]=true;
                    qu.add(ele);
                }
            }
        }
        
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Integer>[] arr = new ArrayList[6];
        for(int i=0;i<=v;i++){
            arr[i] = new ArrayList<Integer>();
        }
        addEdge(arr,1,2);
        addEdge(arr,1,3);
        addEdge(arr,1,5);
        addEdge(arr,5,4);
        addEdge(arr,4,3);
        bfs(arr,1);
    }
    
}
