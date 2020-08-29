package com.trees;
//This solution Requires only one traversal of the binary tree and retruns incorrect solution if only 
// one of the given key is present.

public class lowestCommonAncestorOptimized {
    public static Node LCA(Node root, int n1,int n2){
        if(root==null)return null;
        if(root.data==n1||root.data==n2)return root;
        Node lcaL = LCA(root.left, n1, n2);
        Node lcaR = LCA(root.right, n1, n2);

        if(lcaL!=null && lcaR!=null){
            return root;
        }
        if(lcaL!=null)return lcaL;
        else{
            return lcaR;
        }
    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(50);
        root.right.left.left = new Node(70);
        root.right.right = new Node(60);
        root.right.right.left = new Node(80);
        root.right.right.right = new Node(90);
        root.right.right.right.right = new Node(40);
        System.out.println(" "+LCA(root,70,40).data);
    }
}