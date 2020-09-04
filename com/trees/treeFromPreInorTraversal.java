package com.trees;

public class treeFromPreInorTraversal {
    static int preIndex=0;
    public static Node treeCons(int[] inOr,int[] preOr, int si, int ei){
        if(si>ei)return null;
        Node root  = new Node(preOr[preIndex++]);
        int index=0;
        for(int i=si;i<=ei;i++){
            if(root.data==inOr[i]){
                index=i;
                break;
            }
        }
        root.left = treeCons(inOr, preOr, si, index-1);
        root.right = treeCons(inOr, preOr, index+1, ei);
        return root;
    }

    public static void main(String[] args) {

        int[] inOr = new int[]{40,20,50,10,30,80,70,90};
        int[] preOr = new int[]{10,20,40,50,30,70,80,90};
        Node root = treeCons(inOr, preOr, 0, preOr.length-1);
        System.out.println("Root: "+root.data);
    }
    
}