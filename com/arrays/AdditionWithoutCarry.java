package com.arrays;

public class AdditionWithoutCarry {
    public static int addWithoutCarry(int num1, int num2){
        int i=0;
        double res=0.0;
        while(num1!=0 || num2 !=0){
            int bit_sum = num1%10 + num2%10;
            bit_sum =bit_sum%10;
            res = res+(bit_sum * Math.pow(10, i));
            i++;
            num1 /=10;
            num2 /=10;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(addWithoutCarry(456, 4));
    }
}
