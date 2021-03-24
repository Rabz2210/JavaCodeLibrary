package com.trees;

//https://leetcode.com/problems/symmetric-tree/solution/
public class symmetricTress {
    public boolean isSymmetric(Node root) {
        return isMirror(root, root);
    }

    public boolean isMirror(Node root1, Node root2){
        if(root1==null && root2==null)return true;
        if(root1==null || root2==null)return false;
        return (root1.data == root2.data && isMirror(root1.left, root2.right) 
        && isMirror(root1.right, root2.left));
    }
}
