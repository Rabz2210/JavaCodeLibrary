package com.rough;

public class tempString {
    public static void main(String[] args) {
        String arr  = "This,is,Mohammad,Rabbani";
        String[] arrtemp = arr.split(",");
        for(String each: arrtemp){
            System.out.println(each);
        }
        }
}
