package com.datastructures;

import java.util.Scanner;

public class linkedList {
   static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ele = scan.nextLine().split(" ");
        if(ele[0]!=null)
        for(String each:ele){
            Node temp = new Node(Integer.parseInt(each));
        }
        scan.close();

    }
    
}