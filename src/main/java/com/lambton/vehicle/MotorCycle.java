package com.lambton.vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class MotorCycle extends Vehicle
{
    int maxSpeed;
    float milage;


    public MotorCycle(String vehicleIdNumber, String vehicleInfo, String manufacturerName, Boolean isSelfDrive, String driver,
                      Boolean isInsured, String insuranceProviderName, int numberOfSeats, String fuelType, int ratePerDay, double ratePerKM, int maxSpeed, float milage)
    {
        super();
   
        this.maxSpeed = maxSpeed;
        milage = milage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getMilage() {
        return milage;
    }

    public void setMilage(float milage) {
        milage = milage;
    }


    //Limit maxSpeed function
    public int maxSpeedAllowedByAge(int age)
    {
        if(age<20)
        {
            maxSpeed= 100;
        }
        else
            maxSpeed=150;
        return  maxSpeed;
    }
    public void print() throws FileNotFoundException {
        PrintStream o = new PrintStream(new File("Output.txt"));
        PrintStream console = System.out;
        System.setOut(o);
        System.out.println("---------MotorCycle Details--------------");
        System.out.println("Max Speed Allowed: " +maxSpeedAllowedByAge(19)+"km/hr");
        System.out.println("Max Speed Allowed: " +maxSpeedAllowedByAge(36)+"km/hr");
        System.out.println("Milage: " +milage);
    }
}
