package com.strings;

import java.util.Scanner;

public class fizzBuzz {
    public static String fizzBuzz(Integer num) {
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=num;i++){
            String str = getStringRep(i);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String getStringRep(Integer i){
        if(i%3==0 && i%5==0){
            return "fizzbuzz";
        }
        else if(i%3==0){
            return "fizz";
        }
        else if(i%5==0){
            return "buzz";
        }
        else{
            return i.toString();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        System.out.println(fizzBuzz(n));
    }
}
