package com.arrays;

//https://www.geeksforgeeks.org/equilibrium-index-of-an-array/

public class EquilibriuminAnArray {
    public static int[] prefixArray(int[] ary){
        int[] prefixArray = new int[ary.length];
        prefixArray[0] = ary[0];
        for(int i=1;i<ary.length;i++){
            prefixArray[i] = prefixArray[i-1]+ary[i];
        }
        return prefixArray;
    }

    public static int Equilibrium(int[] arry){
        int sum=0;
        for (int i : arry) {
            sum+=i;
        }

        int leftSum = 0;
        for(int i=0;i<arry.length;i++){
            if(leftSum == (sum-arry[i])){
                return i;
            }
            else{
                leftSum+=arry[i];
                sum-=arry[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
        System.out.println(Equilibrium(arr));
    }
}
