package com.algoexpert;

public class validateSubsequence {
    public static boolean validate(int[] seq,int[] sub){
        int i=0;
        int j=0;
        while(i<seq.length && j<sub.length){
            if(seq[i]==sub[j])j++;
            i++;
        }
        return j==(sub.length)?true:false;
    }
    
    public static void main(String[] args) {
        int[] seq = new int[]{5,1,22,25,6,-1,8,10};
        int[] sub = new int[]{1,6,-1,10};
        System.out.println(validate(seq, sub));
    }
}
