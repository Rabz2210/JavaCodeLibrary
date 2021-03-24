package com.graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class bfsForDirectedGraph {
    
    public List<Integer>[] adj;
    public int v;

    bfsForDirectedGraph(int v){
        this.v = v;
        adj = new LinkedList[this.v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int u,int v){
    adj[u].add(v);
    }

    public void BFS(int x){
        boolean[] visited = new boolean[this.v];
        Queue<Integer> qu = new LinkedList<Integer>();
        visited[x]=true;
        qu.add(x);
        while(qu.size()!=0){
            int n  = qu.poll();
            System.out.println(n);
            Iterator<Integer>itr = adj[n].listIterator();
            while(itr.hasNext()){
                int j = itr.next();
                if(!visited[j]){
                    visited[j]=true;
                    qu.add(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        bfsForDirectedGraph g = new bfsForDirectedGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.BFS(2);
    }
}
