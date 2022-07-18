package com.rough;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightViewTree {
    
    public static List<Integer> rightView(treeNode node){
        Queue<treeNode> q = new LinkedList<treeNode>();
        q.add(node);
        List<Integer> res = new ArrayList<Integer>();
        int size;
        while(q.peek()!=null){
            treeNode temp = q.peek();
            res.add(temp.data);
            size = q.size();
            while(size!=0){
                treeNode ob = q.poll();
                if(ob.right!=null)q.add(ob.right);
                if(ob.left!=null)q.add(ob.left);
                --size; 
            }
        }
        return res;
    }

    public static void main(String[] args) {
        
    }
}
