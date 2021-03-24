package com.rough;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class dfsForGraphs {
    public static void addEdge(LinkedList<Integer>[] arr,int u,int v){
        arr[u].add(v);
        arr[v].add(u);
    }

    public static void dfs(LinkedList<Integer>[] arr, int v,boolean[] visited){
        if(!visited[v])visited[v]=true;
        System.out.print(" "+v);
        Iterator<Integer>itr = arr[v].iterator();
        while(itr.hasNext()){
            int x = itr.next();
            if(!visited[x]){
                visited[x]=true;
                dfs(arr, x, visited);
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer>[] arr = new LinkedList[6];
        int noOfNodes = 5;
        for(int i=0;i<5;i++){
            arr[i] = new LinkedList<Integer>();
        }
        boolean[] visited = new boolean[5];
        addEdge(arr,0,1);
        addEdge(arr,0,2);
        addEdge(arr,0,3);
        addEdge(arr,2,4);
        addEdge(arr,4,3);
        // dfs(arr,0,visited);
        // //System.out.println("_________________________");
        for(int i=0;i<5;i++){
            if(!visited[arr[i].getFirst()])
            dfs(arr,arr[i].getFirst(),visited);
        }
    }
}
