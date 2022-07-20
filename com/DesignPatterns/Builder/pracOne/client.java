package com.DesignPatterns.Builder.pracOne;

public class client {
    public static void main(String[] args) {
        ChairBuilder chair = ChairBuilder.builder().buildWithSeat("soft Cushion")
        .buildWithNoOfLegs(3)
        .buildWithArmRest("ArmRest low")
        .buildWithBackRest("Relaxed").build();

        System.out.println(chair.toString());

        System.out.println("____________________");
        ChairBuilder temp = ChairBuilder.builder().build();
        
    }
}
