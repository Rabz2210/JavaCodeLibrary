package com.DesignPatterns.Factory.Implementation;

public class GameClient {

    public static void main(String[] args) {
        ObstaclesFactory obstaclesFactory = new ObstaclesFactory();
        Animal a = obstaclesFactory.getObstacles(100);
        a.killPlayer();
    }
    
}
