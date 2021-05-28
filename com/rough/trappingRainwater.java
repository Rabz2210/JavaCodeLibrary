package com.rough;

public class trappingRainwater {

    public static int TrappedRainwater(int[] arr){

        int res = 0;
        for(int i=1;i<arr.length-1;i++){
            int left = arr[i];
            for(int j=0;j<i;j++){
                left = Math.max(left, arr[j]);
            }
            int right = arr[i];
            for(int k=i+1;k<arr.length;k++){
                right = Math.max(right, arr[k]);
            }
            res+=Math.min(left, right)-arr[i];
        }
        return res;
    }



    public static int TrappedRainWaterII(int[] arr){
        int res = 0;
        int leftMax = 0;
        int rightMax=0;
        int lo=0;
        int hi = arr.length-1;
        while(lo<=hi){
            if(arr[lo]<arr[hi]){
                if(arr[lo]>leftMax)leftMax=arr[lo];
                else{
                    res+=leftMax-arr[lo];
                }
                lo++;
            }else{
                if(arr[hi]>rightMax){
                    rightMax = arr[hi];
                }else{
                    res+=rightMax-arr[hi];
                }
                hi--;
            }
        }


        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,0,2,0,4};
        System.out.println(TrappedRainWaterII(arr));
        
    }
    
}
