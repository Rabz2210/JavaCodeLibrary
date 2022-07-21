package com.DesignPatterns.Factory.pracOne;

abstract public class Obstacles {
    
    int baseKillSpeed;
    int baseKillLevel;
     
    Obstacles(){
        baseKillLevel=10;
        baseKillSpeed=10;
    }

    abstract public int killSpeed(int gamePlayerParameter);
    abstract public int killLevel(int gamePlayerParameter);
}
