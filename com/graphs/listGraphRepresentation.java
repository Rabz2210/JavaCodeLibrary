package com.graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class listGraphRepresentation {
    public static void addEdge(ArrayList<ArrayList<Integer>> al, int u, int v){
        al.get(u).add(v);
        al.get(v).add(u);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++){
                adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);

        
    }
}
