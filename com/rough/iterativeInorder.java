package com.rough;

import java.util.Stack;
import com.trees.Node;

public class iterativeInorder {
    public static void inorder(Node root){
        if(root==null)return;
        Stack<Node>s = new Stack<Node>();
        Node curr = root;
        while(curr!=null || s.size()>0){

            while(curr!=null){
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            System.out.print(curr.data);
            curr=curr.right;
        }
    }

    public static void preOrder(Node root){
        if(root==null){return;}
        Stack<Node> s = new Stack<Node>();
        Node curr = root;
        s.push(curr);
        while(s.empty()==false){
            curr=s.pop();
            System.out.print(curr.data);
            if(curr.right!=null)s.push(curr.right);
            if(curr.left!=null)s.push(curr.left);
        }
    }
    
    //Post order is incomplete need to work on it.
    public static void postOrder(Node root){
        System.out.println();
        if(root==null)return;
        Stack<Node>s = new Stack<Node>();
        Node curr = root;
        s.push(curr.right);
        while(s.empty()==false){
            s.push(curr);
            s.push(curr);
            curr = s.pop();
            
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);

        preOrder(root);
    }
}
