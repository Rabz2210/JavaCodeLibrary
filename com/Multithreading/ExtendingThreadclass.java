package com.Multithreading;

public class ExtendingThreadclass {
    public static void main(String[] args) {
        calculate obj = new calculate();
        System.out.println(Thread.currentThread());
        
        obj.start();
        System.out.println("Main Thread Exiting");
    }
}



class calculate extends Thread{

    @Override
    public void run(){
        this.setName("Child Thread");
        System.out.println(Thread.currentThread());
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(i);
            System.out.println(this.getName());
        }
    }

}