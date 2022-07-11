package com.graphs;

import java.util.LinkedList;
import java.util.Stack;

public class topologicalSortDFS {

    private static LinkedList<Integer>[] arr;

    public static void add(int u, int v){
        arr[u].add(v);
    }

    public static void topologicalSorting(int source,boolean[] visited,Stack<Integer> st){
        visited[source] = true;
        for(Integer each:arr[source]){
            if(!visited[each]){
                topologicalSorting(each, visited, st);
            }
        }
        st.push(source);
    }


    public static void main(String[] args) {
        int size = 8;
        arr = new LinkedList[size];
        for(int i=0;i<size;i++){
            arr[i] = new LinkedList<Integer>();
        }
        // add(0, 2);
        // add(0, 3);
        // add(2, 3);
        // add(1, 3);
        // add(1, 4);
        // topological(0);

        boolean[] visited = new boolean[size];
        Stack<Integer> st = new Stack<Integer>();
        add(0, 3);
        add(3 , 5);
        add(1, 4);
        add(4, 6);
        add(3, 6);
        add(1, 7);
        add(3, 7);
        add(2, 4);
        add(2, 7);
        for(int i=0;i<size;i++){
            if(!visited[i]){
                topologicalSorting(i, visited, st);
            }
        }
        while(st.size()!=0){
            System.out.print(" "+st.pop());
        }
        
    }
}
