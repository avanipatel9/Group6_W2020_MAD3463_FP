package com.lambton.vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Car extends Vehicle
{
    String carType;
    String carColor;

    public Car(String vehicleIdNumber, String vehicleInfo, String manufacturerName, Boolean isSelfDrive, String driver, Boolean isInsured, String insuranceProviderName, int numberOfSeats, String fuelType, int ratePerDay, double ratePerKM, String carType, String carColor) {
        super();
        this.carType = carType;
        this.carColor = carColor;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void print() throws FileNotFoundException {
        PrintStream o = new PrintStream(new File("Output.txt"));
        PrintStream console = System.out;
        System.setOut(o);
        System.out.println("---------Car Details--------------");
        System.out.println("Car Type: "+carType);
        System.out.println("Car Color: "+carColor);
    }
}
