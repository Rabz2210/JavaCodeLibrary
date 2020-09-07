//Iterative Approch

package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class leftViewBinaryTree {
    public static void lfview(Node root){
        if(root==null)System.out.println("Tree is empty");
        Queue<Node>q = new LinkedList<Node>();
        q.add(root);
        while(q.peek()!=null){
            Node temp;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                if(i==0){
                    temp=q.poll();
                    System.out.print(" "+temp.data);
                    if(temp.left!=null)q.add(temp.left);
                    if(temp.right!=null)q.add(temp.right);
                }
                else{
                    temp =q.poll();
                    if(temp.left!=null)q.add(temp.left);
                    if(temp.right!=null)q.add(temp.right);
                }
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
        root.right.left.right = new Node(7);
        lfview(root);
    }
}