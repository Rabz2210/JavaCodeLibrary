package com.linkedlist;

//https://leetcode.com/problems/plus-one-linked-list/
public class plusOneLinkedList {
    public static ListNode plusOne(ListNode head) {
        ListNode sentinal = new ListNode(0,head);
        ListNode tempsentinal = plusOne_recursiveCalculation(sentinal.next);
        if(tempsentinal.val==0){return sentinal.next;}
        else {
              return sentinal;
             }
    }
    
    public static ListNode plusOne_recursiveCalculation(ListNode head){
        if(head==null)return new ListNode(1);
        head.val = head.val+plusOne_recursiveCalculation(head.next).val;
        if(head.val>9){
            head.val = 0;
            return new ListNode(1);
        }else{
            return new ListNode(0);
        }
    }

    public static void main(String[] args) {
        ListNode head = CreatingDynamicLinkedList.createlinkedListNode(new int[]{9});
        System.out.println("Printing ListNode");
        ListNode fakeHead = head;
        while(fakeHead!=null){
            System.out.print(" "+fakeHead.val);
            fakeHead = fakeHead.next;
        }
        System.out.println();
        fakeHead = plusOne(head);
        while(fakeHead!=null){
            System.out.print(" "+fakeHead.val);
            fakeHead = fakeHead.next;
        }
        System.out.println();
    }
}
