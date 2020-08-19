package com.trees;


public class depthFirstSearch {
    public static void inorder(Node root){
        if(root == null)return;
        inorder(root.left);
        System.out.print(" "+root.data);
        inorder(root.right);
    }

    public static void preorder(Node root){
        if(root==null)return;
        System.out.print(" "+root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(" "+root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
}