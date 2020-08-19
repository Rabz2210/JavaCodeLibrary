package com.trees;


import java.util.LinkedList;
import java.util.Queue;

public class breadthFirstSearch {

    public static void leverOrder(Node root){
        if(root==null)return;
        Queue<Node> qu = new LinkedList<Node>();
        System.out.print(" "+root.data);
        qu.add(root.left);
        qu.add(root.right);
        while(qu.peek()!=null){
            Node ele = qu.poll();
            System.out.print(" "+ele.data);
            if(ele.left!=null)qu.add(ele.left);
            if(ele.right!=null)qu.add(ele.right);
            }
        }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        leverOrder(root);
    }
}