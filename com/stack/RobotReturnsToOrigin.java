package com.stack;

import java.util.Scanner;

public class RobotReturnsToOrigin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Moves = scan.nextLine();
        char[] move = Moves.toCharArray();
        int vertical=0;
        int horizontal=0;
        for(char each:move){
            switch(each){
                case 'U': vertical+=1;break;
                case 'D': vertical-=1;break;
                case 'L': horizontal-=1;break;
                case 'R': horizontal+=1;break;
            }
        }
        if(vertical==0 && horizontal==0)System.out.println("at origin");
        else{System.out.println("lost");}
    }
}
