package com.trees;

public class sizeOfBinaryTree {

    public static int treeSize(Node root){
        if(root==null)return 0;
        return ((treeSize(root.left))+1+(treeSize(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        System.out.println("size: "+treeSize(root));
    }
    
}