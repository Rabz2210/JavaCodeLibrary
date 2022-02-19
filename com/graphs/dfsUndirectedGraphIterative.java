package com.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class dfsUndirectedGraphIterative {

      private static void dfsForGraphsIterative(LinkedList<Integer>[] adj, int startingIndex){

        boolean[] visited = new boolean[adj.length];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(startingIndex);
        visited[startingIndex]=true;
        while(q.peek()!=null){
            int temp = q.poll();
            System.out.print(temp+" ");
            LinkedList<Integer> templist = adj[temp];
            for(Integer each: templist){
                if(!visited[each]){
                    visited[each]=true;
                    q.add(each);
                }
            }
        }

      }


       public static void addEdge(List<Integer>[] adj,int u, int v){
           adj[u].add(v);
           adj[v].add(u);
       }
    

    public static void main(String[] args) {
        int size = 4;
        LinkedList<Integer>[] adj = new LinkedList[size]; 
        for(int i=0;i<4;i++){
                adj[i] = new LinkedList<>();
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 2);
        dfsForGraphsIterative(adj, 0);

    }
}
