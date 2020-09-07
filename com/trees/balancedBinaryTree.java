package com.trees;

//Here are two approches in this file.
//the first one makes sure that even if one of the subtree is misbalanced, the entire tree is misbalance
//The second approch keeps track of balance at each and every node , and it's only on the root node it decides that the tree is balanced or not

public class balancedBinaryTree {

    //The first approach
    public static int ifBalanced(Node root){
        if(root==null)return 0;
        int lefth = ifBalanced(root.left);
        int righth = ifBalanced(root.right);
        if(lefth!=-1 || righth!=-1){
            if(Math.abs(lefth-righth)<2){
                return (1+Math.max(lefth, righth));
            }else {return -1;}
        }else{
            return -1;
        }
    }

    //The Second approach
    public static int checkBal(Node root){
        if(root==null)return 0;
        int leftheight = 0;
        int rightheight = 0;
        if(root.left!=null){leftheight=1+(checkBal(root.left));}
        if(root.right!=null){rightheight=1+(checkBal(root.right));}
        if(Math.abs(leftheight-rightheight)>1){
            return Math.abs(leftheight-rightheight);
        }
        return Math.abs(leftheight - rightheight);
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

        Node root2 = new Node(3);
        root2.left = new Node(4);
        root2.left.left = new Node(5);
        if(ifBalanced(root2)==-1)System.out.println("Imbalanced");
        else{
            System.out.println("Balanced");
        }
    }
    
}