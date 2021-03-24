package com.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class dfsUndirectedGraph {
    List<Integer>[] adj;
    int v;

    dfsUndirectedGraph(int v){
        this.v = v;
        adj = new LinkedList[this.v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

public void addEdge(int u,int v){
    adj[u].add(v);
} 


public void dfs(int x, boolean[] visited){

    //Mark the current node and print it
    visited[x]=true;
    System.out.println(x);

    //Recur for all vertices adjacent to this
    Iterator<Integer>itr = adj[x].listIterator();
        while(itr.hasNext()){
            int n = itr.next();
            if(!visited[n]){
                dfs(n, visited);
            }
        }
    }

    public static void main(String[] args) {
        dfsUndirectedGraph g = new dfsUndirectedGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        boolean[] visited = new boolean[4];
        g.dfs(2, visited);
        
    }


}
