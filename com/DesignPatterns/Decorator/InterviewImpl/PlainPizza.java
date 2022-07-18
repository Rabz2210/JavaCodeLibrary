package com.DesignPatterns.Decorator.InterviewImpl;

public class PlainPizza implements Pizza{

    int price;
    Pizza pizza;

    PlainPizza(){
        this.price = 100;
    }
    @Override
    public String getDescription() {
        return "Simple Thin Crust";
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
