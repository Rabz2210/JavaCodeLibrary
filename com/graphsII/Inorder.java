package com.graphsII;

public class Inorder {
    public static void BFS_Inorder(Node root){
        if(root==null)return;
        BFS_Inorder(root.left);
        System.out.print(" "+root.data);
        BFS_Inorder(root.right);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        BFS_Inorder(root);
    }
    
}
