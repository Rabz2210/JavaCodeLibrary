package com.linkedlist;

public class LinkedListFromArrayII {
    public static Node LinkedListFromArray(int[] arr){
        Node head=null;
        for(int i=0;i<arr.length;i++){
            head = insert(head,arr[i]);
        }
        return head;
    }

    public static Node insert(Node head,int data){
        Node temp = new Node(data);
        if(head==null)return temp;
        Node ptr = head;
        while(ptr.next!=null){
            ptr = ptr.next;
        }
        ptr.next = temp;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        
    }
}
