package com.DesignPatterns.Builder.pracOne;

import javax.management.RuntimeErrorException;

public class ChairBuilder {
    //Mandatory Attributes
    private String seat;
    private int noOfLegs;

    //Optional Attributes
    private String backRest;
    private String armRest;


    public static Builder builder(){
        return new Builder();
    }


    @Override
    public String toString() {
        return "ChairBuilder [armRest=" + armRest + ", backRest=" + backRest + ", noOfLegs=" + noOfLegs + ", seat="
                + seat + "]";
    }


    public static class Builder{

    //Mandatory Attributes
    private String seat;
    private int noOfLegs;

    //Optional Attributes
    private String backRest;
    private String armRest;

    public Builder buildWithSeat(String seat){
        this.seat = seat;
        return this;
    }
    public Builder buildWithArmRest(String armRest){
        this.armRest = armRest;
        return this;
    }
    public Builder buildWithNoOfLegs(int noOfLegs){
        this.noOfLegs = noOfLegs;
        return this;
    }
    public Builder buildWithBackRest(String backRest){
        this.backRest = backRest;
        return this;
    }

    public ChairBuilder build(){
        if(this.seat==null || this.noOfLegs==0){
            throw new RuntimeErrorException(null, "Mandatory Attributes Mising");
        }
        ChairBuilder chair = new ChairBuilder();
        chair.seat=seat;
        chair.noOfLegs=noOfLegs;
        chair.backRest=backRest;
        chair.armRest=armRest;
        return chair;
    }

    }
}
