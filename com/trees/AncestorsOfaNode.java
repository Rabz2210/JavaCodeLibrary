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
    
}