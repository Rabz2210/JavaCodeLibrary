package com.linkedlist;

public class duplicateElementsFromSortedLinkedList {
    public static Node deleteDuplicates(Node head){
        Node fixedHead = head;
        while(head!=null && head.next!=null){
            while(head.data==head.next.data){
                if(head.next.next==null){head.next = null;return fixedHead;}
                else{head.next = head.next.next;}
            }
            head = head.next;
        }
        return fixedHead;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(1);
        n1.next.next = new Node(1);
        n1.next.next.next= new Node(2);
        n1.next.next.next.next = new Node(2);
        Node head = deleteDuplicates(n1);
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
