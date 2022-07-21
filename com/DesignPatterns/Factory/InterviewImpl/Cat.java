package com.DesignPatterns.Factory.InterviewImpl;

public class Cat extends Animal {
    int killPower;
    int speed;


    Cat(int gameLevel, int characterLevel){
        killPower(gameLevel,characterLevel);
        speed(gameLevel,characterLevel);
    }
    
    @Override
    public void speed(int gameLevel, int characterLevel){
         this.speed = (gameLevel-1)+characterLevel;

    }

    @Override
    public void killPower(int gameLevel, int characterLevel){
            this.killPower = speed+gameLevel+characterLevel;
    }

    @Override
    public void animalDescriptions() {
        // TODO Auto-generated method stub
        System.out.println(this.getClass().getSimpleName()+" : Speed : "+this.speed+" , killpower : "+ this.killPower);
        
    }

    public int getKillPower() {
        return killPower;
    }

    public int getSpeed() {
        return speed;
    }


    

}
