package com.bitmanipulation;

public class checkPowerOfTwo {
    //Approach one
    public static void powerOfTwo(int n){
        int i=2;
        while(!(i>n)){
            if(i==n){
                System.out.println("Power of Two");
                return;
            }
            i=i<<1;
        }
        System.out.println("Not Power of two");
    }
    
    //If a number is power of 2 then it's leftmost bit is set 4 ->100, 8->1000, so binary and with a lower
    //number would yeild a zero
    public static void pwrOfTwo(int n){
        if(n!=0 && 0==(n&(n-1))){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        powerOfTwo(5);
        powerOfTwo(12);
        powerOfTwo(8);
        powerOfTwo(16);

    }
    
}
