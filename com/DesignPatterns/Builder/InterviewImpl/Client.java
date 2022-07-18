package com.DesignPatterns.Builder.InterviewImpl;

import com.rough.maps;

public class Client {
    public static void main(String[] args) {
        ChairBuilder basicChair = ChairBuilder.builder().buildWithSeats("Wooden Seat").buildWithNoOfLegs(4).build();
        
        System.out.println("_____________________________");
        System.out.println(basicChair.toString());
        System.out.println("_____________________________");

        ChairBuilder comfortableChair = ChairBuilder.builder().buildWitCupHolder("StarBucks Size").buildWithArmRest("Short Armrest").build();
        System.out.println(comfortableChair.toString());
    }
}
