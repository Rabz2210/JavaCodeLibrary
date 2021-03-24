package com.leetcode;

public class ReachingPoints {
    public static boolean testreachingPoints(int sx, int sy, int tx, int ty) {
        while(tx>=sx && ty>=sy){
            if(tx==sx && ty==sy)return true;
            if(tx>ty){
                if(tx==sx);
                else{tx%=ty;}
            }
            else{
                    if(ty==sy);
                    else{ty%=tx;}
                }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(testreachingPoints(3,3,12,9));
    }
}
