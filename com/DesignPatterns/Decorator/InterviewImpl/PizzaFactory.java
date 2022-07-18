package com.DesignPatterns.Decorator.InterviewImpl;

public class PizzaFactory {
    public static void main(String[] args) {
        Pizza pizza = new CheeseBurst(new PlainPizza());
        System.out.println("__________");
        String desc = pizza.getDescription();
        System.out.println(""+ desc);
       
    }
}
