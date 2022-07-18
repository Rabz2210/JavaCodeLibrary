package com.queue;


public class QueueUsingArray {

    static Integer[] arr;
    static int length;
    static int EnqueuePointer;


    public static void createQueue(int size){
        arr = new Integer[size];
        length = size;
        EnqueuePointer = 0;
        System.out.println("Creating a Queue of size "+size);
    }

    public static boolean Enqueue(int element){
        if(EnqueuePointer>=length)
        {
        System.out.println("Queue is full");
        return false;
        }
        arr[EnqueuePointer] = element;
        EnqueuePointer+=1;
        return true;
    }

    public static Integer deQueue(){
        if(EnqueuePointer==0){
        System.out.println("Nothing to De-queue, Queue is empty");
        return null;
        }
        Integer ele = arr[0];
        shift();
        return ele;
    }

    private static void shift(){
        int i=0;
        while(i<EnqueuePointer-1){
            arr[i] = arr[i+1];
            i++;
        }
        --EnqueuePointer;
    }

    public static Integer front(){
        if(EnqueuePointer==0){
            System.out.println("Empty List");
            return null;
        }
        Integer temp = arr[0];
        return temp;
    }

    public static void display(){
        for(int i=0;i<EnqueuePointer;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        createQueue(7);
        Enqueue(1);
        Enqueue(2);
        Enqueue(3);
        display();
        System.out.println(deQueue());
        display();
        System.out.println(deQueue());
        System.out.println(deQueue());
        Enqueue(4);
        display();


    }
}
