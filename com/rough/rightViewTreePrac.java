package com.rough;

import java.util.LinkedList;
import java.util.Queue;

public class rightViewTreePrac {
    public static void rightViewtree(treeNode root){
        Queue<treeNode> q = new LinkedList<treeNode>();
        q.add(root);
        int count =0;
        while(q.peek()!=null){
            treeNode temp = q.poll();
            System.out.println(temp.data);
            count = q.size();
            if(temp.right!=null)q.add(temp.right);
            if(temp.left!=null)q.add(temp.left);
            while(count!=0){
                temp = q.poll();
                if(temp.right!=null)q.add(temp.right);
                if(temp.left!=null)q.add(temp.left);
                --count;
            }
        }
        

    }
    
    public static void main(String[] args) {
        treeNode root = new treeNode(4);
        root.left = new treeNode(5);
        root.right = new treeNode(2);
        root.right.right = new treeNode(1);
        root.right.left = new treeNode(3);
        root.right.left.left = new treeNode(6);
        root.right.left.right = new treeNode(7);
        rightViewtree(root);
        System.out.println();
        System.out.println();
        treeNode root1 = new treeNode(1);
        root1.left = new treeNode(2);
        root1.right = new treeNode(3);
        root1.left.left = new treeNode(4);
        root1.left.right = new treeNode(5);
        root1.right.right = new treeNode(7);
        root1.right.left = new treeNode(6);
        System.out.println();
        System.out.println();
        System.out.println();
        rightViewtree(root1);
    }
}
