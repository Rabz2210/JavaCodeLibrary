package com.trees;

// Here we are taking into considertion that one of the key , or both the keys might not be present in the tree.
//We can optimize the solution if we assume that both the keys are present in the tree.
import java.util.ArrayList;

public class lowestCommonAncestor {

    public static Boolean pthFinder(Node root, ArrayList<Integer> p, int n){
        if(root==null)return false;
        p.add(root.data);
        if(root.data==n) return true;
        if(pthFinder(root.left, p, n)||pthFinder(root.right, p, n)){
            return true;
        }
        p.remove(p.size()-1);
        return false;
    }



    public static void LCA(Node root, int n1, int n2){
        ArrayList<Integer> p1 = new ArrayList<Integer>();
        ArrayList<Integer> p2 = new ArrayList<Integer>();
        int i,j;
        if(pthFinder(root, p1, n1)&& pthFinder(root, p2, n2)){
            for(i=0,j=0;i<p1.size()-1&&j<p2.size()-1;i++,j++) {
                if(p1.get(i+1)!=p2.get(j+1)){
                    System.out.println(" "+p1.get(i));
                    return;
                }
            }
        }
        System.out.println("No common ancestor");
        return;
        }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);
        LCA(root, 7,5);
    }
}