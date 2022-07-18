package com.DesignPatterns.Factory.pracOne;

public class tiger  extends Obstacles{
    
    tiger(){
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
