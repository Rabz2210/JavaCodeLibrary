package com.rough;

public class ConstructingTree {
    
    public static void preOrder(treeNode node){
        if(node==null)return;
        System.out.print(node.data+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(treeNode node){
        if(node==null)return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    public static void postOrder(treeNode node){
        if(node==null)return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    public static void main(String[] args) {
        treeNode n1 = new treeNode(1);
        n1.left = new treeNode(2);
        n1.right = new treeNode(3);
        n1.left.left = new treeNode(4);
        n1.left.right = new treeNode(5);
        preOrder(n1);
        System.out.println();
        inOrder(n1);
        System.out.println();
        postOrder(n1);
    }
}
