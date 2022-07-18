package com.rough;

import java.util.Queue;



import java.util.*;

public class bfsTrees {

    public static void bfsTree(treeNode node){
        Queue<treeNode> q = new LinkedList<treeNode>();
        q.add(node);
        while(q.peek()!=null){
            treeNode temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
        }
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
        bfsTree(n1);
        System.out.println();
        treeNode n2 = new treeNode(8);
        n2.right = new treeNode(6);
        n2.right.left = new treeNode(2);
        n2.right.right = new treeNode(4);
        n2.right.right.left =  new treeNode(3);
        bfsTree(n2);
    }
}
