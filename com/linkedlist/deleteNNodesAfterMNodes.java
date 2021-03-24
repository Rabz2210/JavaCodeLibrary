package com.linkedlist;

//https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/
public class deleteNNodesAfterMNodes {

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


        public static Node deleteNodes(Node head, int m, int n) {
            Node fakeHead = head;
            while(fakeHead!=null){
                int toKeep = 1;
                while(fakeHead!=null && toKeep<m){
                    fakeHead = fakeHead.next;
                    toKeep++;
                }
                if(fakeHead==null)return head;
                Node remove = fakeHead.next;
                int toRemove = 1;
                while(remove!=null && toRemove<n){
                    remove = remove.next;
                    toRemove++;
                }
                if(remove==null){fakeHead.next=null;return head;}
                fakeHead.next = remove.next;
                fakeHead = fakeHead.next;
            }
            return head;
        }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
        Node head = null;
        head  = createlinkedListFromArray(arr);
        System.out.println("Printing Out the LinkedList");
        // while(head!=null){
        //     System.out.print(" "+head.data);
        //     head = head.next;
        // }
        System.out.println(" ");
        System.out.println("Deleating n nodes after m nodes");

        head = deleteNodes(head,2,3);

        while(head!=null){
            System.out.print(" "+head.data);
            head = head.next;
        }
    }
}
