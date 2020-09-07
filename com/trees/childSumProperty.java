package com.trees;

public class childSumProperty {
    public static boolean childSum(Node root){
        if(root==null)return true;
        if(root.left==null && root.right==null)return true;
        if((root.left==null && (root.right.data == root.data))||(root.right==null &&(root.left.data==root.data)))return true;
        if(root.data == Math.addExact(root.left.data, root.right.data) && childSum(root.left) && childSum(root.right))return true;
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        System.out.println(" "+childSum(root));

        Node root1 = new Node(10);
        root1.left = new Node(8);
        root1.right = new Node(2);
        root1.right.left = new Node(2);
        System.out.println(" "+childSum(root1));
    }
}