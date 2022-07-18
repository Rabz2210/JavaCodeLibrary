package com.rough;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.swing.text.View;

public class bottomViewTree {
    private static SortedMap<Integer,Integer> mp = new TreeMap<Integer,Integer>();

    public static void bottomView(treeNode node){
        view(node,0);
        for(Map.Entry<Integer,Integer> each:mp.entrySet()){
            System.out.print(each.getKey()+":"+each.getValue()+" ");
        }
    }

    public static void view(treeNode node, int d){
        if(node==null)return;
        mp.put(d,node.data);
        if(node.left!=null)view(node.left,d-1);
        if(node.right!=null)view(node.right,d+1);
    }

    public static void main(String[] args) {
        treeNode n1 = new treeNode(10);
        n1.left = new treeNode(20);
        n1.right = new treeNode(30);
        n1.left.left = new treeNode(40);
        n1.left.right = new treeNode(50);
        n1.right.right = new treeNode(60);
        bottomView(n1);
        // System.out.println();
        // treeNode n2 = new treeNode(30);
        // n2.right = new treeNode(50);
        // n2.right.left = new treeNode(60);
        // n2.right.left.right = new treeNode(10);
        // bottomView(n2);
        // System.out.println();
        // treeNode n3 = new treeNode(10);
        // n3.right = new treeNode(20);
        // n3.right.right = new treeNode(30);
        // n3.right.right.right = new treeNode(40);
        // bottomView(n3);
        // System.out.println();
        // treeNode n4 = new treeNode(10);
        // n4.left = new treeNode(20);
        // n4.right = new treeNode(30);
        // n4.right.left = new treeNode(40);
        // n4.right.right = new treeNode(50);
        // n4.right.right.left = new treeNode(60);
        // bottomView(n4);
    }
    
}
