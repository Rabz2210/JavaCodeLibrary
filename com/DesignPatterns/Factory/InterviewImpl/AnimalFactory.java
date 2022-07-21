package com.DesignPatterns.Factory.InterviewImpl;

public interface AnimalFactory {
    
    public Animal getAnimalBasedOnLevelAndCharacter(int gameLevel, int characterLevel);
    public Animal getLastLevelAnimal(int characterLevel);
}
