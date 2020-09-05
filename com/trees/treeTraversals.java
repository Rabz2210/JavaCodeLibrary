package com.trees;



public class treeTraversals {

    public static void inorderTraversal(Node root){
        if(root==null)return;
        inorderTraversal(root.left);
        System.out.print(" "+root.data);
        inorderTraversal(root.right);
    }

    public static void preOrderTraversal(Node root){
        if(root==null)return;
        System.out.print(" "+root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    public static void  postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" "+root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(50);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right.right = new Node(60);

        System.out.println("In-order Traversal");
        inorderTraversal(root);
        System.out.println();

        System.out.println("Pre-Order Traversal");
        preOrderTraversal(root);
        System.out.println();
        
        System.out.println("Post-Order Traversal");
        postOrder(root);
    }
}
