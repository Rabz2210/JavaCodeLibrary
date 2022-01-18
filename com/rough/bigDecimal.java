package com.rough;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class bigDecimal {
    public static void main(String[] args) {
        BigDecimal dc  = new BigDecimal("10.86734945636");
        System.out.println("Before Conversion " + dc);
        BigDecimal cl = dc.setScale(0, RoundingMode.UP);
        System.out.println("After Conversion "+cl);
    }
    
}
