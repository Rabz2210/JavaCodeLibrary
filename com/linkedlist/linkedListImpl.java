package com.linkedlist;

public class linkedListImpl {
   public static void traverseList(Node Head){
    Node temp=Head;
    while(temp!=null){
        System.out.print(" "+temp.data);
        temp = temp.next;
    }
   }

   public static Node insertAtBeginning(Node head,int element){
        Node temp = head;
        if(temp==null){
            head = new Node(element);
        }
       else{
        Node first = new Node(element);
        first.next=head;
        head = first;
       }
       return head;
   }

   public static Node insertAtEnd(Node head, Node element){
       Node temp = head;
       if(temp==null){
           head = element;
       }
       else{
           while(temp.next!=null)temp = temp.next;
           temp.next = element;
       }
       return head;
   }
   public static Node deleteFirstNodeLinkedList(Node head){
        Node temp = head.next;
        head = temp;
        return head;
   }

   public static void deleteLastNodeLinkedList(Node head){
       Node temp = head;
       while(temp.next.next!=null)temp = temp.next;
       temp.next = null;
   }

   public static void searchLinkedList_Iterative(Node head,int data){
        if(head==null){
            System.out.println("The List is Empty");
            return;
        }else{
            Node temp = head;
            int i=1;
            while(temp!=null){
                if(temp.data==data){System.out.println("Element "+data+"found at index "+i);
                return;}
                temp = temp.next;
                i++;
            }
        }
        System.out.println("Element was not found");
        return;   
   }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        Node head=n1;
        traverseList(head);
        head=insertAtBeginning(head, 5);
        head=insertAtBeginning(head, 6);
        System.out.println("");
        traverseList(head); 
        head = insertAtEnd(head, new Node(7));
        head = insertAtEnd(head, new Node(8));
        System.out.println("");
        traverseList(head);
        head = deleteFirstNodeLinkedList(head);
        System.out.println("After deleting first Node");
        traverseList(head);
        deleteLastNodeLinkedList(head);
        System.out.println("");
        traverseList(head);
        searchLinkedList_Iterative(head,3);
    }
    
}
