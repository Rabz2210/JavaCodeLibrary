package com.trees;

public class heightOfBinaryTree {

    public static int hob(Node root, int height){
        if(root==null)return height;
        height++;
        return Math.max(hob(root.left,height), hob(root.right, height));
    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.left.right = new Node(50);
        System.out.println("height of binary tree "+hob(root, 0));
    }
}