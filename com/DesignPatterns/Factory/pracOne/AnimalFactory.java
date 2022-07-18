package com.DesignPatterns.Factory.pracOne;

import java.io.ObjectInputStream.GetField;

public interface AnimalFactory {
    
    public Obstacles getAnimal(int gameLevel, int CharacterLevel);

    public Obstacles getRandomAnimal();

    public Obstacles getMostFuriousAnimal(int gameAnimal, int CharacterLevel);
}
