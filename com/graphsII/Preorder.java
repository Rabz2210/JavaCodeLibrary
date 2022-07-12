package com.graphsII;

public class Preorder {
    public static void BFS_Preorder(Node root){
        if(root==null)return;
        System.out.print(" "+root.data);
        BFS_Preorder(root.left);
        BFS_Preorder(root.right);
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        BFS_Preorder(root);
    }
}
