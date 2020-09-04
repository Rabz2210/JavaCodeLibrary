package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
    public static int maxWidth(Node root){
       if(root==null)return 0;
       Queue<Node> q = new LinkedList<Node>();
       q.add(root);
       int size = 0;
       while(q.peek()!=null){
           int count = q.size();
            if(size<q.size())size=q.size();
            for(int i=0;i<count;i++){
                Node temp = q.poll();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
       }
       return size;
    }


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left  = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        System.out.println("Max Width: "+maxWidth(root));
    }
    
}