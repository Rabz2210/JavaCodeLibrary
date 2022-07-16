package com.DesignPatterns.Builder.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

public class CarWithBuilder {
    
    //Mandatory Requirements
    String engine;
    int Wheels;
 

    //Optional Requriements;
    List<Integer> Seats;
    int headlights;

    public static Builder builder(){
        return new Builder();
    }


    //Builder Class

    public static class Builder{
    //Mandatory Requirements
     String engine;
     int Wheels;
   

    //Optional Requriements;
     List<Integer> Seats;
     int headlights;
    }

    // public Builder buildWithEngine(String engine){
    //     this.engine = engine;
    //     return this;
    // }

    // public Builder buildWithWheels(int Wheels){
    //     this.Wheels = Wheels;
    //     return this;
    // }

    // public Builder buildWithSeats(List<Integer> seats){
    //     this.Seats = seats;
    //     return this;
    // }

    // public Builder buildWithHeadLights(int lights){
    //     this.headlights = lights;
    //     return this;
    // }


    public CarWithBuilder build(){
        
        if(this.engine==null || this.Wheels==0) throw new RuntimeErrorException(null, "all Mandoatory required");
        CarWithBuilder car = new CarWithBuilder();
        car.engine = engine;
        car.Wheels = Wheels;
        car.Seats = Seats;
        car.headlights = headlights;
        return car;
    }

}
