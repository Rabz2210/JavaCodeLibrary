package com.DesignPatterns.Builder.InterviewImpl;

import javax.management.RuntimeErrorException;

public class ChairBuilder {
    //Mandatory Requirements
    private String seat;
    private int noOfLegs;

    //Optional
    private String backRest;
    private String Armrest;
    private String cupholder;

    @Override
    public String toString() {
        return "ChairBuilder [Armrest=" + Armrest + ", backRest=" + backRest + ", cupholder=" + cupholder
                + ", noOfLegs=" + noOfLegs + ", seat=" + seat + "]";
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{

    //Mandatory Requirements
    private String seat;
    private int noOfLegs;

    //Optional
    private String backRest;
    private String Armrest;
    private String cupholder;


    public Builder buildWithSeats(String seat){
        this.seat = seat;
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
    public Builder buildWithArmRest(String ArmRest){
        this.Armrest = ArmRest;
        return this;
    }
    public Builder buildWitCupHolder(String seat){
        this.seat = seat;
        return this;
    }

    public ChairBuilder build(){
        if(this.seat==null || this.noOfLegs==0){
            throw new RuntimeErrorException(null,"Mandatory Values Should be passedd for th object to be constructed");
        }
        ChairBuilder chair = new ChairBuilder();
        chair.seat = seat;
        chair.Armrest = Armrest;
        chair.backRest = backRest;
        chair.noOfLegs = noOfLegs;
        chair.cupholder = cupholder;
        return chair;
    }

    }
}
