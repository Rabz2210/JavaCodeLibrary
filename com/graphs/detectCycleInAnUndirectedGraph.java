package com.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import com.apple.laf.resources.aqua_ja;

public class detectCycleInAnUndirectedGraph {
    
    private static LinkedList<Integer>[] arr;

    private static void addEdge(int u, int v){
        arr[u].add(v);
        arr[v].add(u);
    }

    public static boolean detectCycleInUndirectedGraph(Integer source){
        boolean[] visited =  new boolean[arr.length];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(source);
        int[] parent = new int[arr.length];
        int predecessor = source;
        visited[source] = true;
        parent[source] = source;
        while(q.peek()!=null){
            Integer temp = q.poll();
            LinkedList<Integer> adjacentnode = arr[temp];
            for(Integer neighbour: adjacentnode){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    parent[neighbour] = temp;
                    q.add(neighbour);
                }else if(parent[temp]!=neighbour){
                    return true;
                }
            }
            predecessor = temp;
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
        boolean res = detectCycleInUndirectedGraph(0);
        System.out.println(res);

        arr = new LinkedList[6];
        for(int i=0;i<6;i++){
            arr[i] = new LinkedList<Integer>();
        }
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(1, 4);
        addEdge(2, 3);
        res = detectCycleInUndirectedGraph(0);
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
        res = detectCycleInUndirectedGraph(0);
        System.out.println(res);
    }
}

