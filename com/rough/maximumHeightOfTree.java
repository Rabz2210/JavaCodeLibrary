package com.rough;

public class maximumHeightOfTree {

    public static int getTreeheight(treeNode node){
        if(node==null)return 0;
        return Math.max(getTreeheight(node.left),getTreeheight(node.right))+1;
    }
    
    public static void main(String[] args) {
        treeNode n1 = new treeNode(10);
        n1.left = new treeNode(8);
        n1.right = new treeNode(30);
        n1.right.left = new treeNode(40);
        n1.right.right = new treeNode(60);
        n1.right.right.left = new treeNode(30);
        //System.out.println(getTreeheight(n1));
        treeNode n2 = new treeNode(10);
        //System.out.println(getTreeheight(n2));
        treeNode n3 = new treeNode(30);
        n3.left = new treeNode(40);
        n3.left.left = new treeNode(70);
        n3.left.left.left = new treeNode(80);
        n3.right = new treeNode(60);
        System.out.println(getTreeheight(n3));
        
    }
}
