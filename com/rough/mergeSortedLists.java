package com.rough;


public class mergeSortedLists {
    public static Node mergeLists(Node l1, Node l2){
        if(l1==null && l2==null)return null;
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1.data<l2.data){
            l1.next = mergeLists(l1.next, l2);
            return l1;
        }else{
            
        }
        return null;
    }
    
    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);
        Node res = mergeLists(l1, l2);
        if(res!=null){
        while(res!=null){
            System.out.print(res.data+" ");
            res = res.next;
            }
        }
        else{
            System.out.println("List is empty");
        }
    }
}
