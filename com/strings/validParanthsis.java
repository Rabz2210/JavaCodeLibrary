package com.strings;

import java.util.Scanner;

public class validParanthsis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pal = scan.nextLine();
        pal = pal.toLowerCase();
        int length = pal.length();
        int i=0;
        int j=length-1;
        while(i<=j){
            if(pal.charAt(i)!=pal.charAt(j)){
               System.out.println(false);
               System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println(true);
    
    }
}
