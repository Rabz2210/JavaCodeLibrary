package com.rough;

import java.util.LinkedList;
import java.util.Queue;

import com.trees.symmetricTress;

public class leftViewTree {

    public static void leftView(treeNode node){
        Queue<treeNode> q = new LinkedList<treeNode>();
        q.add(node);
        int size;
        while(q.peek()!=null){
            treeNode temp = q.peek();
            System.out.print(temp.data+" ");
            size = q.size();
            while(size!=0){
                treeNode ob = q.poll();
                if(ob.right!=null)q.add(ob.right);
                if(ob.left!=null)q.add(ob.left);
                --size; 
            }
        }
    }
    
    public static void main(String[] args) {
        treeNode n1 = new treeNode(10);
        n1.left = new treeNode(20);
        n1.right = new treeNode(30);
        n1.left.left = new treeNode(40);
        n1.left.right = new treeNode(50);
        n1.right.right = new treeNode(60);
        leftView(n1);
        System.out.println();
        treeNode n2 = new treeNode(30);
        n2.right = new treeNode(50);
        n2.right.left = new treeNode(60);
        n2.right.left.right = new treeNode(10);
        leftView(n2);
        System.out.println();
        treeNode n3 = new treeNode(10);
        n3.right = new treeNode(20);
        n3.right.right = new treeNode(30);
        n3.right.right.right = new treeNode(40);
        leftView(n3);
        System.out.println();
        treeNode n4 = new treeNode(10);
        n4.left = new treeNode(20);
        n4.right = new treeNode(30);
        n4.right.left = new treeNode(40);
        n4.right.right = new treeNode(50);
        n4.right.right.left = new treeNode(60);
        leftView(n4);
    }
}
