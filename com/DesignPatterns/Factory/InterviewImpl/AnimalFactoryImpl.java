package com.DesignPatterns.Factory.InterviewImpl;

public class AnimalFactoryImpl implements AnimalFactory{


    @Override
    public Animal getAnimalBasedOnLevelAndCharacter(int gameLevel, int character) {
        if(gameLevel+character<2)return new Cat(gameLevel,character);
        if(gameLevel+character<6)return new Cat(gameLevel,character);
        if(gameLevel+character<=8)return new Tiger(gameLevel,character);
        return new Tiger(gameLevel,character);
    }

    @Override
    public Animal getLastLevelAnimal(int characterLevel){
        return new Tiger(5,characterLevel);
    }

    
}
