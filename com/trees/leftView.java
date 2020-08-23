package com.trees;

public class leftView {
    static int maxlevel=0;
    public static void lfView(Node root, int level){
        if(root==null)return;
        if(maxlevel<level){
            System.out.println(" "+root.data);
            maxlevel = level;
        }
        lfView(root.left, level++);
        lfView(root.right, level++);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        lfView(root,1);
    }

}