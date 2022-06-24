package com.arrays;
import java.util.*;

public class minimumNoOfPlatformsRequired {
    public static int noOfPlatfromsRequired(double[] arr, double[] dept){
        int length = arr.length;
        if(length<2)return 1;
        int maxNoOfPlatforms = 1;
        int j=1;
        int i=0;
        for(i=1;i<length;i++){
            while(j<length && arr[i]>dept[j]){
                maxNoOfPlatforms = Math.max(maxNoOfPlatforms, i-j);
                j++;
                
            }
        }
        maxNoOfPlatforms = Math.max(maxNoOfPlatforms, i-j-1);
        return maxNoOfPlatforms;
    }

    public static void main(String[] args) {
        double[] arr = new double[]{9.00, 9.40};
        double[] dept = new double[]{9.10, 12.00};
        System.out.println(noOfPlatfromsRequired(arr, dept));
    }
}
