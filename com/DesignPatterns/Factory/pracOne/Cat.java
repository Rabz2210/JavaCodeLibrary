package com.DesignPatterns.Factory.pracOne;

public class Cat extends Obstacles{

    Cat(){
        super();
    }
    
    @Override
    public int killSpeed(int gamePlayerParameter){
        return gamePlayerParameter+super.baseKillSpeed+10;
    }

    @Override
    public int killLevel(int gamePlayerParameter){
        return gamePlayerParameter+baseKillLevel+10;
    }
}
