package com.trees;

public class maximumOfaTree {
    public static int maxSearch(Node root, int max){
            if(root==null)return max;
            if(root.data>max)max = root.data;
            int submax = Math.max(maxSearch(root.left,max),maxSearch(root.right,max));
            if(max>submax)return max;
            else
            return submax;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(70);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(65);
        System.out.println("The maximum of the tree: "+maxSearch(root, 0));
    }
}