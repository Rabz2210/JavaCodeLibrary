package com.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//BFS for a undirected graph
//https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/tutorial/

public class grapghAdjacencyListRepresentation {

     private LinkedList<Integer>[] adjacency;
     private int v;

     grapghAdjacencyListRepresentation(int v){
         this .v=v;
         adjacency = new LinkedList[v];
         for(int i=0;i<v;i++){
             adjacency[i] = new LinkedList<Integer>();
         }
     }

     public void addEdge(int u, int v){
        adjacency[u].add(v);
        adjacency[v].add(u);
     }

     public void BFS(int s){
         boolean[] visited = new boolean[this.v];
         Queue<Integer>qu = new LinkedList<Integer>();
         qu.add(s);
         while(qu.size()!=0){
             int n = qu.poll();
             System.out.print(n);
             visited[n] = true;;
             Iterator<Integer>itr = adjacency[n].listIterator();
             while(itr.hasNext()){
                 int x = itr.next();
                 if(!visited[x]){
                     visited[x]=true;
                     qu.add(x);
                 }
             }
         }
         
     }
 
     public static void main(String[] args) {
        grapghAdjacencyListRepresentation g = new grapghAdjacencyListRepresentation(8);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,4);
        g.addEdge(1,5);
        g.addEdge(2,6);
        g.addEdge(2,7);
        g.addEdge(3,7);
        g.BFS(0);
     }
}
