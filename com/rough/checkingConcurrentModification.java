package com.rough;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.rough.eligibilityResponse;

public class checkingConcurrentModification {
    public static void main(String[] args) {
        eligibilityResponse e1 = new eligibilityResponse(1,"Rabbani",29);
        eligibilityResponse e2 = new eligibilityResponse(2,"Mohammad",30);
        eligibilityResponse e3 = new eligibilityResponse(3,"Arman",31);
        eligibilityResponse e4 = new eligibilityResponse(4,"Razia", 28);
        List<Integer> ids = Arrays.asList(3,4);
        List<eligibilityResponse> els = new ArrayList<eligibilityResponse>();
        els.add(e1);
        els.add(e2);
        els.add(e3);
        els.add(e4);
        List<eligibilityResponse> temp = els.stream().filter(elo -> ids.contains(elo.getId())).collect(Collectors.toList());
        System.out.println(els.size());
        System.out.println(temp.size());
        System.out.println();
        for (eligibilityResponse each: els) {
            System.out.println(each.getId());
        }        
    }
}
