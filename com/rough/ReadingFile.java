package com.rough;

import java.io.*;
import com.rough.tasks;

public class ReadingFile {
    public static void main(String[] args)throws IOException{
        String path = "C:\\Users\\mohammadrabbani\\Documents\\testFolder\\input.txt";
        String ParkinglotCreation = null;
        BufferedReader br = null;
        try{
         br = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e1) {
            System.out.println("The requird file is not present at the location or does not have a read permission on it"+"\n"+"Terminating the programme");
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
            System.exit(0);
        }
        try { ParkinglotCreation = br.readLine();} catch (Exception e) {}

        if(ParkinglotCreation!=null && ParkinglotCreation.split(" ").length==2 &&
            ParkinglotCreation.split(" ")[0].equalsIgnoreCase("Create_parking_lot") &&  Integer.parseInt(ParkinglotCreation.split(" ")[1])>0 && br!=null){
            System.out.println("Create Parking lot of size"+ParkinglotCreation.split(" ")[1]);
            //Operations ops = new Operations(ParkinglotCreation.split(" ")[1]);
            
            String st;
            while((st=br.readLine())!=null){
            String[] command = st.split(" ");
            switch(command[0]){
                case "Park"              : System.out.println("Parking vehicle"+command[1]);break;//Ops.park(command[1] VehicleNuber,command[3] Diver age)
                case "Leave"              : System.out.println("Parking vehicle"+command[1]);break;//Ops.Leave(command[1] Parking slot number)
                case  "Slot_number_for_car_with_number" : System.out.println("getting parking info");break;//Ops.carSlot(command[1])
                case "Slot_numbers_for_driver_of_age " : System.out.println("getting Driver info");break;//ops.slotsByAge(command[1])
                case "Vehicle_registration_number_for_driver_of_age": System.out.println("Driver age:"+command[1]);break;//ops.vehiclesByAge(command[1])
                }
            }
        }
        else{
            System.out.println("Provide correctly formatted input file or a parking lot with size greater than 0");
        }
        
    }
}
