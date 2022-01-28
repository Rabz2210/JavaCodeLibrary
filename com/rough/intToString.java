package com.rough;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = Integer.toString(n);
        System.out.println(s);
    }
}
