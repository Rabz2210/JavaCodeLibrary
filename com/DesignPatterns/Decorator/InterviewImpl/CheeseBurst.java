package com.DesignPatterns.Decorator.InterviewImpl;

public class CheeseBurst extends PizzaDecorator{

    int price;
    

    CheeseBurst(Pizza pizza){
        super(pizza);
        this.price = 5;
        System.out.println("Adding Cheese to the pizza");
    }

    @Override
    public String getDescription() {
       return pizza.getDescription()+" With Cheese ";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice()+this.price;
    }
    
}
