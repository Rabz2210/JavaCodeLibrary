package com.DesignPatterns.Factory.Implementation;

import java.util.Random;

import com.strings.palindrome;

public class ObstaclesFactory {

    
    public Animal getObstacles(int playerLevel){
        if(playerLevel<10){
            return new Cat(2, 4, playerLevel);
        }else if(playerLevel <30){
            return new Cat(4, 6, playerLevel);
        }else if(playerLevel<60){
            return new Tiger(2, 4, playerLevel);
        }else{
            return  new Tiger(4, 6, playerLevel);
        }
    }

    public Animal getRandamizedAnimal(){
        Random r  = new Random();
        int low = 0;
        int high=100;
        int level = r.nextInt(high-low)+low;
        return getObstacles(level);
    }
}
