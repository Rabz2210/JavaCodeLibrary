package com.rough;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class graphsPrac1 {

    public static void addEdge(LinkedList<Integer>[] adj ,int u, int v){
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void bfs(LinkedList<Integer>[] adj,boolean[] visited,int startElement){
        Queue<Integer>qu = new LinkedList<Integer>();
        qu.add(startElement);
        while(qu.size()!=0){
            int ele = qu.poll();
            System.out.println(ele);
            visited[ele]=true;
            Iterator<Integer> itr = adj[ele].listIterator();
            while(itr.hasNext()){
                int i = itr.next();
                if(!visited[i]){
                    visited[i]=true;
                    qu.add(i);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        LinkedList<Integer>[] adj= new LinkedList[5];
        for (int i = 0; i <5; i++) {
            adj[i] = new LinkedList<Integer>();
        }
        boolean[] visited = new boolean[5];
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);
        bfs(adj, visited,0);
    
    }
    
}
