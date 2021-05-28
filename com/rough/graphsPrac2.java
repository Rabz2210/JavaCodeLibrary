package com.rough;

import java.util.Iterator;
import java.util.LinkedList;



public class graphsPrac2 {

    public static void addEdge(LinkedList<Integer>[] adj, int u, int v){
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void dfs(LinkedList<Integer>[] adj, int u, boolean[] visited){
        visited[u]=true;
        System.out.println(u);
        Iterator<Integer>itr = adj[u].iterator();
        while(itr.hasNext()){
            int ele = itr.next();
            if(!visited[ele]){
                dfs(adj, ele, visited);
            }
        }
    }
    
    public static void main(String[] args) {
        LinkedList<Integer>[] adj = new LinkedList[5];
        for (int i = 0; i < 5; i++) {
            adj[i] = new LinkedList<Integer>();
        }
         int count = 0;

         boolean[] visited = new boolean[5];
         addEdge(adj, 0, 1);
         addEdge(adj, 2, 4);
         addEdge(adj, 3, 4);
         for(int i=0;i<5;i++){
             if(!visited[i]){
                 dfs(adj, i, visited);
                 count++;
             }
         }
         System.out.println("Number of Islands: "+count);
    }
    
}
