package com.trees;

public class balancedBinaryTree {
    public static int ifBalanced(Node root){
        if(root==null)return 0;
        int height = 1;
        int lefth = ifBalanced(root.left);
        int righth = ifBalanced(root.right);
        if(lefth!=-1 || righth!=-1){
            if(Math.abs(lefth-righth)<2){
                return (height+Math.max(lefth, righth));
            }else {return -1;}
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(18);
        root.left = new Node(4);
        root.right = new Node(20);
        root.right.left = new Node(13);
        root.right.right = new Node(70);
        if(ifBalanced(root)==-1)System.out.println("Imbalanced");
        else{
            System.out.println("Balanced");
        }


    }
    
}