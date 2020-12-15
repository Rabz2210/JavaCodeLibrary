package com.leetcode;

import java.util.ArrayList;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-paths/

public class BinaryTreePath {
    public static void treePath(Node root,ArrayList<Integer> arr){
        if(root==null && arr.size()==0){System.out.println("Empty tree");return;}
        if(root.left==null && root.right==null && arr.size()!=0){
            for (Integer integer : arr) {
                System.out.print(integer+"->");
            }
            System.out.print(root.Data);
            System.out.println();
            return;
        }

        arr.add(root.Data);
        if(root.left!=null){
            ArrayList<Integer>larraylist = new ArrayList<Integer>(arr);
            treePath(root.left, larraylist);
            
        }
        if(root.right!=null){
            ArrayList<Integer>rarraylist = new ArrayList<Integer>(arr);
            treePath(root.right, rarraylist);
            
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<Integer>();
        Node root = new Node();
        root.Data = 1;
        root.left = new Node();
        root.left.Data = 2;
        root.right = new Node();
        root.right.Data = 3;
        root.left.right = new Node();
        root.left.right.Data=5;
        root.left.left = new Node();
        root.left.left.Data = 6;
        treePath(root, arr);
    }
    
}
