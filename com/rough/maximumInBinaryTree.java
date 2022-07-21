package com.rough;

public class maximumInBinaryTree {

    public static int maximumInTree(treeNode node){
        if(node==null)return Integer.MIN_VALUE;
        return Math.max(node.data,Math.max(maximumInTree(node.left), maximumInTree(node.right)));
    }

    public static void main(String[] args) {
        treeNode n1 = new treeNode(10);
        n1.left = new treeNode(20);
        n1.right = new treeNode(30);
        n1.left.left = new treeNode(8);
        n1.left.right = new treeNode(7);
        n1.left.right.left = new treeNode(9);
        n1.left.right.right = new treeNode(15);
        n1.right.right = new treeNode(6);
        System.out.println(maximumInTree(n1));
        treeNode n2 = new treeNode(8);
        n2.right = new treeNode(6);
        n2.right.left = new treeNode(2);
        n2.right.right = new treeNode(4);
        n2.right.right.left =  new treeNode(3);
        System.out.println(maximumInTree(n2));
    }
    
}
