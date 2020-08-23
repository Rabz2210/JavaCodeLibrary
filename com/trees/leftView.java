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

}