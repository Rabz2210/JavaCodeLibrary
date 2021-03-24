package com.trees;



public class rough {
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
        if(checkBal(root)>1)System.out.println("Imbalanced");
        else{
            System.out.println("Balanced");
        }

        Node root2 = new Node(3);
        root2.left = new Node(4);
        root2.left.left = new Node(5);
        if(checkBal(root2)>1)System.out.println("Imbalanced");
        else{
            System.out.println("Balanced");
        }

        Node root3 = new Node(30);
        root3.left = new Node(40);
        root3.right = new Node(80);
        root3.left.right = new Node(70);
        root3.left.right.left = new Node(20);
        root3.left.right.right = new Node(10);
        root3.right.left = new Node(5);
        if(checkBal(root3)>1)System.out.println("Imbalanced");
        else{
            System.out.println("Balanced");
        }
    }
}
