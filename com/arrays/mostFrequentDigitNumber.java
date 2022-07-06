package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class mostFrequentDigitNumber {
    public static void mostRepeatingDigit(int num){
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int count=0;
        int digit = 0;
        while(num!=0){
            digit = num%10;
            if(mp.containsKey(digit)){
                count = mp.get(digit);
                ++count;
                mp.put(digit, count);
            }else{
                mp.put(digit, 1);
            }
            num /=10;
        }
        count = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> each:mp.entrySet()){
            if(count<each.getValue()){
                count =each.getValue();
                digit = each.getKey();
            }
        }
        System.out.println(digit);
    }
    
    public static void main(String[] args) {
        mostRepeatingDigit(100000000);
    }
}
