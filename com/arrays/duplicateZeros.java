package com.arrays;

public class duplicateZeros {
    public static void duplicate_Zeros(int[] arr) {
        int length = arr.length;
        for(int i=0;i<length;i++){
            if(arr[i]==0){
                int start = length-1;
                while(start!=i){
                    arr[start] = arr[start-1];
                    start--;
                }
                i++;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] test = new int[]{1,0,2,3,0,4,5,0};
        int[] test1 = new int[]{1,2,3};
        duplicate_Zeros(test);
        duplicate_Zeros(test1);
        for(int each:test){
            System.out.print(" "+each);
        }
        System.out.println();
        for(int each:test1){
            System.out.print(" "+each);
        }
    }
}
