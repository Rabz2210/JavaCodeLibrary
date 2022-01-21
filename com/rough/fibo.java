package com.rough;

import java.util.concurrent.CompletableFuture;

class teacher implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Teacher Thread");
        Thread teacherThread = Thread.currentThread();
        long teacherThreadId = teacherThread.getId();
        for(int i=0;i<10000;i++){
            System.out.println("Teacher Thread Id"+teacherThreadId);
            try {
                System.out.println("Sleeping");
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Child Thread Exiting");
        
    }

}

public class fibo {
    public static void main(String[] args) {
        Thread currThread = Thread.currentThread();
        long MainThreadId = currThread.getId();
        System.out.println("MainThreadId : "+currThread.getId());
        CompletableFuture.runAsync(new teacher());
        System.out.println("Main Thread Exiting");
    }
    
}
