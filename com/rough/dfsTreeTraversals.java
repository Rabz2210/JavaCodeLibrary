package com.rough;

import java.util.LinkedList;
import java.util.Queue;

public class dfsTreeTraversals {

    public static void preOrder(treeNode root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(treeNode root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(treeNode root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    
    public static void BFS(treeNode root){
        Queue<treeNode> q = new LinkedList<treeNode>();
        q.add(root);
        while(q.peek()!=null){
           treeNode temp = q.poll();
           System.out.print(temp.data+" ");
           if(temp.left!=null)q.add(temp.left);
           if(temp.right!=null)q.add(temp.right);
        }
    }

    public static void main(String[] args) {
        treeNode n = new treeNode(1);
        n.left = new treeNode(2);
        n.right = new treeNode(3);
        n.left.left = new treeNode(4);
        n.left.right = new treeNode(5);
        System.out.print("Inorder : ");
        inOrder(n);
        System.out.println();
        System.out.print("PreOrder : ");
        preOrder(n);
        System.out.println();
        System.out.print("PostOrder : ");
        postOrder(n);
        System.out.println();
        System.out.println();
        System.out.println("BFS : ");
        BFS(n);
    }
}
