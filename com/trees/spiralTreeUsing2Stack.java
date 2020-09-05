package com.trees;

import java.util.Stack;

public class spiralTreeUsing2Stack {
    public static void spiralTree(Node root){
        if(root==null)System.out.println("empty Tree");
        Stack<Node>st1 = new Stack<Node>();
        Stack<Node>st2 = new Stack<Node>();
        st1.push(root);
        while(!st1.empty() || !st2.empty()){
                while(!st1.empty()){
                    Node temp = st1.pop();
                    System.out.print(" "+temp.data);
                    if(temp.left!=null)st2.push(temp.left);
                    if(temp.right!=null)st2.push(temp.right);
                }
                while(!st2.empty()){
                    Node temp = st2.pop();
                    System.out.print(" "+temp.data);
                    if(temp.right!=null)st1.push(temp.right);
                    if(temp.left!=null)st1.push(temp.left);
                }
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
        spiralTree(root);

        System.out.println(" ");
        Node root2 = new Node(10);
        root2.left = new Node(20);
        root2.right = new Node(30);
        root2.right.left = new Node(40);
        root2.right.right = new Node(50);
        root2.right.left.left = new Node(60);
        root2.right.left.right = new Node(70);
        root2.right.right.right = new Node(80);
        spiralTree(root2);
    }
}
