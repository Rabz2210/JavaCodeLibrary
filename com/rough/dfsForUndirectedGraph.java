package com.rough;

import java.util.Iterator;
import java.util.LinkedList;

public class dfsForUndirectedGraph {
    public static void addEdge(LinkedList<Integer>[]arr, int u, int v){
        arr[u].add(v);
        arr[v].add(u);
    }

    public static boolean dfs(LinkedList<Integer>[] arr,int v,int parent, boolean[] visited){
        visited[v]=true;
        System.out.println();
        Iterator<Integer>itr = arr[v].iterator();
        while(itr.hasNext()){
          int x = itr.next();
          if(!visited[x]){
              if(dfs(arr, x,v, visited)==true)return true;
          }
          else if(x!=parent)return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        LinkedList<Integer>[] arr = new LinkedList[5];
        boolean[] visited = new boolean[arr.length];
        for(int i=0;i<5;i++){
            arr[i] = new LinkedList();
        }
        addEdge(arr, 0, 1);
        addEdge(arr, 0, 2);
        addEdge(arr, 0, 3);
        addEdge(arr, 2, 4);
        System.out.println(dfs(arr,0,-1,visited));
    }
}
