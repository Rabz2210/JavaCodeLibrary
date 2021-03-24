package com.rough;
import com.linkedlist.CreatingDynamicLinkedList;
import com.linkedlist.Node;


public class reverseALinkedList {

    public static Node reverList(Node head){
        if(head.next==null)return head;
        Node temp = reverList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    public static void main(String[] args) {
        Node head = CreatingDynamicLinkedList.createlinkedListFromArray(new int[]{1,2,3,4,5});
        head = reverList(head);
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    
}
