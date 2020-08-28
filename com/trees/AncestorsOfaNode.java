package com.trees;

public class AncestorsOfaNode {
    public static boolean anstr(Node root, int data){
        if(root==null)return false;
        if(root.data==data)return true;
        if(anstr(root.left,data) || anstr(root.right, data)){
            System.out.println(" "+root.data);
        }
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);
        anstr(root, 3);
    }
}