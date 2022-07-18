package com.DesignPatterns.Decorator.InterviewImpl;

public class TomatoSauce extends PizzaDecorator{

    int price;

    TomatoSauce(Pizza pizza){
        super(pizza);
        price = 10;
        System.out.println("Addint Tomato Sauce");
    }

    @Override
    public String getDescription() {
       return pizza.getDescription()+"With Tomato Sauce";
        
    }

    @Override
    public int  getPrice() {
        return this.price+pizza.getPrice();
    }
    
    
}
