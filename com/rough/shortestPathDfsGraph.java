package com.rough;

import java.util.LinkedList;

public class shortestPathDfsGraph {
    private static LinkedList<Integer>[] arr;
    
    private static void addEdge(int u, int v){
        arr[u].add(v);
        arr[v].add(u);
    }

    private static boolean detectCycleDFS(int root, boolean[] visited,int[] parent){
        visited[root] = true;
        for(Integer each: arr[root]){
            if(!visited[each]){
                parent[each]=root;
                if(detectCycleDFS(each, visited, parent)==true)return true;
            }else if(each!=parent[root]){ return true;}
        }
        return false;
    }

    public static void main(String[] args) {
        
        arr = new LinkedList[4];
        for(int i=0;i<4;i++){
            arr[i] = new LinkedList<Integer>();
        }
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 3);
        boolean[] visited = new boolean[arr.length];
        int[] parent = new int[arr.length];
        parent[0]=0;
        boolean res = detectCycleDFS(0,visited,parent);
        System.out.println(res);

        arr = new LinkedList[6];
        for(int i=0;i<6;i++){
            arr[i] = new LinkedList<Integer>();
        }
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(1, 4);
        addEdge(2, 3);
        visited = new boolean[arr.length];
        parent = new int[arr.length];
        parent[0] = 0;
        res = detectCycleDFS(0,visited,parent);
        System.out.println(res);


        arr = new LinkedList[4];
        for(int i=0;i<4;i++){
            arr[i] = new LinkedList<Integer>();
        }
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(0, 3);
        addEdge(2, 3);
        addEdge(1, 3);
        visited = new boolean[arr.length];
        parent = new int[arr.length];
        parent[0] = 0;
        res = detectCycleDFS(0,visited,parent);
        System.out.println(res);
    }
}
