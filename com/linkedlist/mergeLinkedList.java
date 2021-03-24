package com.linkedlist;

public class mergeLinkedList {
    //Recursive Approach
    public  static Node MergeLists_Recursive(Node l1,Node l2){
        if(l1==null)return l2;
        else if(l2==null)return l1;
        else if(l1.data<=l2.data){
            l1.next = MergeLists_Recursive(l1.next, l2);
            return l1;
        }else{
            l2.next = MergeLists_Recursive(l1, l2.next);
            return l2;
        }
    }

    //Iterative Approach 
    public static Node MergeLists_Iterative(Node l1,Node l2){
        Node head = new Node(-1);
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            }
            else{
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
            head.next = l1==null?l2:l1;
        }

        return l1;
    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(4);
        Node l2 = new Node(1);
        l2.next = new Node(3);
        l2.next.next = new Node(4);
        Node res = MergeLists_Recursive(l1, l2);
        while(res!=null){
            System.out.print(" "+res.data);
            res = res.next;
        }

    }
}
