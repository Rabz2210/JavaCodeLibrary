package com.rough;

import java.util.List;
import java.util.*;
import java.util.Scanner;

public class scannertest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer>al = new ArrayList<Integer>();
        while(scan.hasNext()){
            al.add(scan.nextInt());
        }
        System.out.println(al.size());
    }
    
}
