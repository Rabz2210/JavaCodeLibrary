package com.bitmanipulation;

public class elementOccuringOddtimes {
    public static int oddNumberOfTimes(int[] ary){
        int res=ary[0];
        for(int i=1;i<ary.length;i++){
            res = res ^ ary[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ary = new int[]{3,3,3,4,5,5,4};
        System.out.println(oddNumberOfTimes(ary));
    }
    
}
