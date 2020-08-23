package com.trees;

public class kthElementInTree {
    public static void kthElement(Node root, int height){
        if(root==null)return;
        if(height==0)
        {System.out.print(" "+root.data);
        }else{
            kthElement(root.left, height-1);
            kthElement(root.right, height-1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        kthElement(root, 2);
    }
}