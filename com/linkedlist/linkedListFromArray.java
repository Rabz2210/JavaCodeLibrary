package com.linkedlist;

public class linkedListFromArray {

    public static Node getLinkedList(int[] arr){
        Node sentinalHead = new Node(arr[0]);
        Node head=sentinalHead;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            sentinalHead.next = temp;
            sentinalHead = sentinalHead.next;
        }
        return head;
    }

    public static void printLinkedList(Node head){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1};
        Node res = getLinkedList(arr);
        printLinkedList(res);

    }
}
