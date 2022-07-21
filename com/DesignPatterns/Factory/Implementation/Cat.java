package com.DesignPatterns.Factory.Implementation;

public class Cat extends Animal{

    int cutenessLevel;

    Cat(int eye, int legs, int playerLevel){
        super(eye, legs);
        cutenessLevel = 100/playerLevel;
    }

    @Override
    public void eat() {
        System.out.println("will eat candies");
        
    }

    @Override
    public void kill() {
        // TODO Auto-generated method stub
        System.out.println("will lick the player");
        
    }
    
}
