package com.trees;

public class pathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root==null && sum==0)return true;
        else if(root==null && sum!=0){return false;}
        else return (hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        System.out.println(hasPathSum(root,0));
    }
    
}
