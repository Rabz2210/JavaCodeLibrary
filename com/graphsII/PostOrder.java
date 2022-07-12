package com.graphsII;

public class PostOrder {
    public static void BFS_PostOrder(Node root){
            if(root==null)return;
            BFS_PostOrder(root.left);
            BFS_PostOrder(root.right);
            System.out.print(" "+root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        BFS_PostOrder(root);
    }
}
