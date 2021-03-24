package com.queue;

import java.util.Arrays;
import java.util.List;
import java.lang.Integer;

public class HighFive {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,4,2,3,1};
        int[] freq = new int[6];
        for(int each:arr){
            freq[each]++;
        }

        for(int i=1;i<freq.length;i++){
            freq[i]+= freq[i-1];
        }
         int[] res = new int[6];
        for(int i=0;i<arr.length;i++){
            res[freq[arr[i]]-1]=arr[i];
            --freq[arr[i]];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = res[i];
        }
        for(int each:arr){
            System.out.println(each);
        }

    }
}
