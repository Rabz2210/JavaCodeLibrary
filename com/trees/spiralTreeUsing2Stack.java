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
}
