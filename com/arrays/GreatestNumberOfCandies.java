package com.arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/

public class GreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int sum = Integer.MIN_VALUE;
        int length = candies.length;
        int i=0;
        while(i<length){
            if(sum<candies[i]){sum = candies[i];}
            i++;
        }

        List<Boolean> resboolean = new ArrayList<Boolean>();
        for(int j=0;j<length;j++){
            if((candies[j]+extraCandies)>=sum){resboolean.add(true);}
            else{resboolean.add(false);}
        }
        return resboolean;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,1,3};
        List<Boolean> resBoolean = kidsWithCandies(arr, 3);
        for(boolean each:resBoolean){
            System.out.print(" "+each);
        }
    }
}
