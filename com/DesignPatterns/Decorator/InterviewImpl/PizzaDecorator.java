package com.DesignPatterns.Decorator.InterviewImpl;

abstract public class PizzaDecorator implements Pizza{

    Pizza pizza;
    PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    abstract public String getDescription();

    @Override
    abstract public int getPrice();
    
}
