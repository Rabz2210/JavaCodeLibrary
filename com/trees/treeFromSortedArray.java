package com.trees;

public class treeFromSortedArray {

    public static Node createBST(int[] arr, int l,int h){
        if(l>h)return null;
        int mid = l+(h-l)/2;
        Node nd = new Node(arr[mid]);
        nd.left = createBST(arr,l,mid-1);
        nd.right = createBST(arr,mid+1,h);
        return nd;
    }
    
    public static void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        Node root = createBST(arr,0,arr.length-1);
        postOrder(root);
    }
    
}
