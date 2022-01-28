package com.rough;




public class testBigDecimml {
    public static void main(String[] args) {
        int radix = 10;
        int a = 1;
        StringBuilder sb = new StringBuilder();
        char ch = Character.forDigit(a,radix);
        sb.append(ch);
        String s = sb.toString();
        System.out.println("Res :"+sb.toString());
    }
   
   
}
