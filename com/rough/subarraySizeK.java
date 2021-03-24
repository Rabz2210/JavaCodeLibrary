package com.rough;
//https://www.geeksforgeeks.org/find-subarray-with-given-sum/
public class subarraySizeK {
    public static int[] maxSubArray(int[] ary,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=ary[i];
        }
        int[] max=new int[3];
        for(int i=k;i<ary.length;i++){
            sum+=ary[i];
            sum-=ary[i-k];
            if(sum>max[0])max[0]=sum;max[1]=i-k;max[2]=i;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {100, 200, 300, 400};
        int[] res = maxSubArray(arr, 2);
        System.out.println("The maximum sum is "+res[0]+" found between indexes "+res[1]+" and "+res[2]);
        
    }
}
