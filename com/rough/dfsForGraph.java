package com.rough;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class dfsForGraph {
    
    private static LinkedList<Integer>[] arr;

    private static void addEdge(int u, int v){
        arr[u].add(v);
        arr[v].add(u);
    }

    private static void dfs(boolean[] visited, Integer node){
        visited[node]=true;
        System.out.println(node+" ");
        Iterator itr = arr[node].listIterator();
        while(itr.hasNext()){
            Integer temp = (Integer) itr.next();
            if(!visited[temp]){
                dfs(visited, temp);
            }
        }
    }

    public static void main(String[] args) {
        boolean[] visited = new boolean[4];
        arr = new LinkedList[4];
        for(int i=0;i<4;i++){
            arr[i] = new LinkedList<Integer>();
        }
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 0);
        addEdge(2, 3);
        addEdge(3, 3);
        dfs(visited,1);
    }
}
