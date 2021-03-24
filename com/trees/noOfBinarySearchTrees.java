package com.trees;

public class noOfBinarySearchTrees {
    public static int catalanNumber(int n){
        if(n<=1)return 1;
        int res=0;
        for(int i=0;i<n;i++){
            res+=catalanNumber(i)*catalanNumber(n-i-1);
        }
        return res;
    }

    public static int catalanNumberDynamic(int n){
        int[] catalanRes = new int[n+2];
        catalanRes[0]=1;
        catalanRes[1]=1;
        for(int i=2;i<=n;i++){
            catalanRes[i]=0;
            for(int j=0;j<i;j++){
                catalanRes[i] += catalanRes[j]*catalanRes[i-j-1];
            }
        }
        return catalanRes[n];
    }

    public static void main(String[] args) {
        System.out.println(catalanNumber(3));
        System.out.println(catalanNumberDynamic(3));
    }
}
