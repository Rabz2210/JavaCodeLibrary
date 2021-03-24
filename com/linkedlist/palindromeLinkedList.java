package com.linkedlist;
import com.linkedlist.CreatingDynamicLinkedList;



public class palindromeLinkedList {
    /* Approach One creating an array and using two pointers*/
    public static boolean isPalindrome_ArrayApproach(Node head) {
        if(head==null)return false;
        int size = 0;
        Node fakeHead = head;
            
        //loop to calculate the list size
        while(fakeHead!=null){
            size++;
            fakeHead = fakeHead.next;
            }
        int[] arr = new int[size];
        fakeHead = head;
        int i=0;
        
        //loop to populat the array
        while(fakeHead!=null){
            arr[i] = fakeHead.data;
            fakeHead = fakeHead.next;
            i++;
            }
        i=0;
        int j = size-1;
        System.out.println(j);
        //Palindrome checking logic
        while(i<=j){
            if(arr[i]!=arr[j])return false;
            i++;
            j--;
            }
        return true;
        }

        //Approach Using recursion
        static Node frontPointer;
        public static boolean checkPalindrome_(Node head){
            frontPointer = head;
            return checkPalindrome_recursion(head);
        }

        public static boolean checkPalindrome_recursion(Node currentNode){
            if(currentNode!=null){
                if(!checkPalindrome_recursion(currentNode.next))return false;
                if(frontPointer.data == currentNode.data)
                return true;
                frontPointer = frontPointer.next;
            }
            return true;
        }

        
        

    public static void main(String[] args) {
        Node head = CreatingDynamicLinkedList.createlinkedListFromArray(new int[]{1,2,2,1});
        System.out.println(isPalindrome_ArrayApproach(head));
        System.out.println(checkPalindrome_(head));
    }
}
