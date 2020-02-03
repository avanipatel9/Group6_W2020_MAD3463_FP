package com.lambton.vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class MotorCycle extends Vehicle
{
    int maxSpeed;
    float milage;

    public MotorCycle() {
    }

    public MotorCycle(String vehicleIdNumber, String vehicleInfo, String manufacturerName, Boolean isSelfDrive, String driver,
                      Boolean isInsured, String insuranceProviderName, int numberOfSeats, String fuelType, int ratePerDay, double ratePerKM, int maxSpeed, float milage)
    {
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

<<<<<<<<< Temporary merge branch 1
    @Override
    public void print() throws FileNotFoundException {
        PrintStream o = new PrintStream(new File("output_vehicle_renting_system.txt"));
        PrintStream console = System.out;
        System.setOut(o);
        System.out.println("--------------Motar Cycle Details-------------");
        System.out.println("Vehicle Identification Number : " + super.vehicleIdNumber);
        System.out.println("Vehicle Information : " + super.vehicleInfo);
        System.out.println("Manufacturer : " + super.manufacturerName);
        System.out.println("Is insured : " + super.isInsured);
        System.out.println("Insurence Provider : " + super.insuranceProviderName);
        System.out.println("Vehicle Information : " + super.vehicleInfo);
        System.out.println("No. of Seats : " + super.numberOfSeats);
        System.out.println("Fuel Type : " + super.fuelType);
        System.out.println("Rate Per Day : " + getRatePerDay());
        System.out.println("Rate Per Kilometer : " + getRatePerKM());
        System.out.println("Maximum Speed : " + maxSpeed);
        System.out.println(("Milage : " + milage));
    }
=========
>>>>>>>>> Temporary merge branch 2

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
<<<<<<<<< Temporary merge branch 1

=========
    public void print() throws FileNotFoundException {
        PrintStream o = new PrintStream(new File("Output.txt"));
        PrintStream console = System.out;
        System.setOut(o);
        System.out.println("---------MotorCycle Details--------------");
        System.out.println("Max Speed Allowed: " +maxSpeedAllowedByAge(19)+"km/hr");
        System.out.println("Max Speed Allowed: " +maxSpeedAllowedByAge(36)+"km/hr");
        System.out.println("Milage: " + milage);
    }
>>>>>>>>> Temporary merge branch 2
}
