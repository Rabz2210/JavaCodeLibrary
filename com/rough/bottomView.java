package com.rough;

import java.util.Map;
import java.util.TreeMap;

public class bottomView {

    public static void bottomView(treeNode root){
        Map<Integer,treeNode> mp = new TreeMap<Integer,treeNode>();
        view(mp, root, 0);
        for(Map.Entry<Integer,treeNode> set: mp.entrySet()){
            System.out.println(set.getValue().data);
        }
    }

    public static void view(Map<Integer,treeNode> mp,treeNode root, int q){
            mp.put(q, root);
            if(root.left!=null)view(mp, root.left, --q);
            if(root.right!=null)view(mp, root.right, ++q);
    }
    

    public static void main(String[] args) {
        treeNode root = new treeNode(20);
        root.left = new treeNode(8);
        root.right = new treeNode(22);
        root.left.left = new treeNode(5);
        root.left.right = new treeNode(3);
        root.left.right.left = new treeNode(10);
        root.left.right.right = new treeNode(14);
        root.right.right = new treeNode(25);
        bottomView(root);
    }
}
