package com.rough;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class graphRepresentation {

    private static LinkedList<Integer>[] arr;

    public static void addEdge(int u, int v){
        arr[u].add(v);
        arr[v].add(u);
    }

    public static void bfs(Integer u){
        int size = arr.length;
        boolean[] Visited = new boolean[size];
        Visited[u] = true;
        Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(u);
        while(qu.peek()!=null){
            int temp = qu.poll();
            System.out.println(temp+" ");
            for(Integer each:arr[temp]){
                if(!Visited[each]){
                    Visited[each]=true;
                    qu.add(each);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        arr = new LinkedList[4];
        for(int i=0;i<4;i++){
            arr[i] = new LinkedList<Integer>();
        }
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(1, 3);
        bfs(0);
    }

}
