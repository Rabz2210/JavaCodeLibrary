package com.rough;

public class lowestCommonAnsc {

    public static void LCA (treeNode root,int q, int p){
        treeNode temp = getLCANode(root, p, q);
        System.out.println(temp.data);
    }

    public static treeNode getLCANode(treeNode root, int p, int q){

        if( root==null ||root.data==p || root.data==q)return root;

        treeNode left = getLCANode(root.left, p, q);
        treeNode right = getLCANode(root.right, p, q);

        if(left!=null && right!=null)return root;
        return left!=null?left:right;

    } 
    

    public static void main(String[] args) {
        treeNode root = new treeNode(3);
        root.left = new treeNode(5);
        root.right = new treeNode(1);
        root.left.left = new treeNode(6);
        root.left.right = new treeNode(2);
        root.left.right.left = new treeNode(7);
        root.left.right.right = new treeNode(4);
        root.right.right = new treeNode(8);
        root.right.left = new treeNode(0);
    }
}
