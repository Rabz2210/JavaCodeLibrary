package com.rough;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.Scanner;


public class twoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[]{3,3};
        int target = 6;
        int[] res = twoSum(arr, target);
        System.out.println(res[0]+","+res[1]);    
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int length = nums.length;
        for(int i=0;i<length;i++){
            int secondHalf  = target - nums[i];
            if(map.containsKey(secondHalf)){
                return new int[]{map.get(secondHalf),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}


