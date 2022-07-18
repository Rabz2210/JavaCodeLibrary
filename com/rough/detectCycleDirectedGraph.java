package com.rough;

import java.util.LinkedList;


public class detectCycleDirectedGraph {

    private static LinkedList<Integer>[] arr;

    private static void addEdge(int source, int destination){
        arr[source].add(destination);
    }
    
    public static boolean detectCycle(boolean[] recurStack, int node, boolean[] visited){
        if(recurStack[node])return true;
        if(visited[node])return false;
        visited[node] = true;
        recurStack[node] = true;
        for(Integer each: arr[node]){
            if(detectCycle(recurStack, each, visited))return true;
        }
        recurStack[node]=false;
        return false;
    }

    public static void main(String[] args) {
        int size = 6;
        for(int i=0;i<size;i++){
            arr[i] = new LinkedList<Integer>();
        }
        addEdge(0, 1);
        addEdge(2, 1);
        addEdge(2, 3);
        addEdge(3, 4);
        addEdge(4, 5);
        addEdge(5, 3);

        boolean[] visited = new boolean[size];
        boolean[] recursionStack = new boolean[size];
        boolean res;
        for(int i=0;i<6;i++){
            if(!visited[i]){
               if(detectCycle(recursionStack,i,visited)){
                   System.out.println("true");
                   System.exit(0);
               }
                
            }
        }
    }

}
