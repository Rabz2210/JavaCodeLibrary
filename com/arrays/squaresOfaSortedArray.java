package com.arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array/solution/
public class squaresOfaSortedArray {
    public static int[] sortedSquareArray(int[] arr){
        int j=0;
        int length = arr.length;
        while(arr[j]<0){
            j++;
        }
        int i=j-1;
        int[] res = new int[length];
        int t=0;
        while(i>=0 && j<length){
            if(arr[i]*arr[i]<arr[j]*arr[j]){
                res[t]=arr[i]*arr[i];
                i--;
                t++;
            }else{
                res[t]=arr[j]*arr[j];
                j++;
                t++;
            }
        }
        while(i>=0){
            res[t]=arr[i]*arr[i];
            i--;
            t++;
        }
        while(j<length){
            res[t]=arr[j]*arr[j];
            j++;
            t++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = new int[]{-4,-1,0,3,10};
        int[] test1 = new int[]{-7,-3,2,3,11};
        int[] res = sortedSquareArray(test);
        int[] res1 = sortedSquareArray(test1);
        System.out.println(" ");
        for(int each:res){
            System.out.print(" "+each);
        }
        System.out.println(" ");
         for(int each:res1){
             System.out.print(" "+each);
         }
    }
}
