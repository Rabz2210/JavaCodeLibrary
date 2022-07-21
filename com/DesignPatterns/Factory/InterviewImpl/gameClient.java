package com.DesignPatterns.Factory.InterviewImpl;

public class gameClient {
    public static void main(String[] args) {
        AnimalFactoryImpl factoryImpl = new AnimalFactoryImpl();
        Animal gameAnimal;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                System.out.println();
                gameAnimal = factoryImpl.getAnimalBasedOnLevelAndCharacter(i, j);
                gameAnimal.animalDescriptions();
            }
        }
    }
}
