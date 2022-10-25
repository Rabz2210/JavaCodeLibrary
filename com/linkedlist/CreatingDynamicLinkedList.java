package com.linkedlist;

import java.util.Scanner;

public class CreatingDynamicLinkedList {

    public static Node CreateLinkedList(Node head, int element){
            if(head == null)head = new Node(element);
            else{
              Node temp = head;
              Node n1 = new Node(element);
              n1.next = temp;
              head = n1;
            }
            return head;
    }

    public static void traverse(Node head){
        if(head==null)System.out.println("List is empty");
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(" "+temp.data);
                temp = temp.next;
            }
        }
    }

    public static Node createlinkedListFromArray(int[] arr){
        Node sentinal = new Node(-1);
        Node fakehead = sentinal;
        for(int each:arr){
            while(fakehead.next!=null){
                fakehead = fakehead.next;
            }
            fakehead.next = new Node(each);
        }
        return sentinal.next;
    }
    public static ListNode createlinkedListNode(int[] arr){
        ListNode sentinal = new ListNode(-1);
        ListNode fakehead = sentinal;
        for(int each:arr){
            while(fakehead.next!=null){
                fakehead = fakehead.next;
            }
            fakehead.next = new ListNode(each);
        }
        return sentinal.next;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
        Node head = null;
        head  = createlinkedListFromArray(arr);
        //to Create Conflict
    }
    
}
