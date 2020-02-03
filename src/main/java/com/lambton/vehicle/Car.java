package com.lambton.vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Car extends Vehicle
{
    String carType;
    String carColor;

    public Car() {
    }

    public Car(String vehicleIdNumber, String vehicleInfo, String manufacturerName, Boolean isSelfDrive, String driver, Boolean isInsured,
               String insuranceProviderName, int numberOfSeats, String fuelType, int ratePerDay, double ratePerKM, String carType, String carColor)
    {

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

    @Override
    public void print() throws FileNotFoundException {

        System.out.println("--------------Car Details-------------");
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
        System.out.println("Car Type : " + carType);
        System.out.println("Car Colour : " + carColor);

    }
}
