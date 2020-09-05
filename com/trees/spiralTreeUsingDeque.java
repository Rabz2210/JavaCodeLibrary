package com.trees;

import java.util.Deque;
import java.util.LinkedList;

public class spiralTreeUsingDeque {
    public static void spriralTree(Node root){
        if(root==null)System.out.println("The tree is empty");;
        Deque<Node> q = new LinkedList<Node>();
        q.add(root);
        boolean odd=true;
        while(q.peek()!=null){
            int size = q.size();
            for(int i=0;i<size;i++){
                if(odd){
                    Node temp = q.pollFirst();
                     System.out.print(" "+temp.data);
                     if(temp.left!=null)q.add(temp.left);
                     if(temp.right!=null)q.add(temp.right);
                 }
                else{
                    Node temp = q.pollLast();
                    System.out.print(" "+temp.data);
                    if(temp.left!=null)q.addFirst(temp.right);
                    if(temp.right!=null)q.addFirst(temp.left);
                }
            } 
            if(odd)odd=false;
            else{odd=true;}
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.right.left.left = new Node(10);
        spriralTree(root);

        System.out.println(" ");
        Node root2 = new Node(10);
        root2.left = new Node(20);
        root2.right = new Node(30);
        root2.right.left = new Node(40);
        root2.right.right = new Node(50);
        root2.right.left.left = new Node(60);
        root2.right.left.right = new Node(70);
        root2.right.right.right = new Node(80);
        spriralTree(root2);
    }
}
