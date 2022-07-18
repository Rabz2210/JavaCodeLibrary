package com.DesignPatterns.Factory.pracOne;

public class Client {
    public static void main(String[] args) {
        AnimalFactoryImpl animalFactory = new AnimalFactoryImpl();
        Obstacles obj = animalFactory.getMostFuriousAnimal(7, 3);
        
    }
}
