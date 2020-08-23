//Iterative Approch

package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class leftViewBinaryTree {
    public static void leftVBinary(Node root){
        Queue<Node> q = new LinkedList<Node>();
        if(root!=null)q.add(root);
        while(q.peek()!=null){
            int count = q.size();
            for(int i=0;i<count;i++){
                if(i==0){
                    System.out.println(" "+root.data);
                }
                if(root.left!=null){
                    q.add(root.left);
                }
                if(root.right!=null){
                    q.add(root.right);
                }
            }
        }
    }
    
    
}