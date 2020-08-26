package com.trees;

public class heightOfBinaryTree {

    public static int hob(Node root){
        if(root==null)return 0;
        int height=1;
        return (height+Math.max(hob(root.left), hob(root.right)));
    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.left.right = new Node(50);
        System.out.println("height of binary tree "+hob(root));
    }
}