package com.linkedlist;

public class reverseALinkedList {
    public static Node reverseList(Node head) {
        if(head.next == null)
            return head;
        Node temp =  reverseList(head.next);
        head.next = null;
        head.next.next = head;
        return temp;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        Node head = reverseList(n1);
        System.out.println("hello WOrld");
        while(head!=null){
            System.out.println(" "+head.data);
            head = head.next;
        }
    }
}
