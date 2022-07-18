package com.DesignPatterns.Factory.Implementation;

public class Tiger extends Animal{

    int killLevel;

    Tiger(int eye, int legs, int playerLevel){
        super(eye, legs);
        killLevel = playerLevel;
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("eat any character");
        
    }

    @Override
    public void kill() {
        // TODO Auto-generated method stub
        System.out.println("will brutally kill the player");
    }
    
}
