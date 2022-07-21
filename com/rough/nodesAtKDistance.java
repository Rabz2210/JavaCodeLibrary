package com.rough;

public class nodesAtKDistance {

    public static void distanceFromNode(int k, treeNode node){
        if(node==null)return;
        if(k==0 && node!=null){
            System.out.print(node.data+" ");
            return;
        }
        distanceFromNode(k-1, node.left);
        distanceFromNode(k-1, node.right);
        
    }
    

    public static void main(String[] args) {
        treeNode n1 = new treeNode(10);
        n1.left = new treeNode(20);
        n1.left.left = new treeNode(40);
        n1.left.right = new treeNode(50);
        n1.right = new treeNode(30);
        n1.right.right = new treeNode(70);
        distanceFromNode(2,n1);
        System.out.println();
        treeNode n2 = new treeNode(10);
        n2.left = new treeNode(6);
        n2.right = new treeNode(8);
        n2.right.right = new treeNode(7);
        n2.right.right.left = new treeNode(11);
        n2.right.right.right = new treeNode(12);
        distanceFromNode(3,n2);
    }
}
