package com.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class shortestWayToFormString {
    public static int shortestWay(String source, String target){
        Map<Character, List<Integer>> hm = new HashMap<Character, List<Integer>>();
        char[] sourceArry = source.toCharArray();
        char[] targetArry = target.toCharArray();
        for(int i=0;i<sourceArry.length;i++){
            if(hm.containsKey(sourceArry[i])){
                hm.get(sourceArry[i]).add(i);
            }else{
                ArrayList<Integer> indices = new ArrayList<Integer>();
                indices.add(i);
                hm.put(sourceArry[i], indices);
            }
        }
        int count = 0;
        int currentMaxIndex = -1;
        for(char letter:targetArry){
            if(!hm.containsKey(letter))return -1;
            if(currentMaxIndex==sourceArry.length-1){
                count++;
                currentMaxIndex = -1;
            }
            for(Integer index:hm.get(letter)){
                if(currentMaxIndex<index){
                    currentMaxIndex = index;
                    break;
                }
                
            }
        }
        return count>=0?count+1:-1;
    }

    public static void main(String[] args) {
        System.out.println(shortestWay("xyz", "xzyxz"));
    }
}
