package com.lambton.vehicle;

public class Car extends Vehicle
{
    String carType;
    String carColor;

    public Car(String vehicleIdNumber, String vehicleInfo, String manufacturerName, Boolean isSelfDrive, String driver, Boolean isInsured, String insuranceProviderName, int numberOfSeats, String fuelType, int ratePerDay, double ratePerKM, String carType, String carColor) {
        super(vehicleIdNumber, vehicleInfo, manufacturerName, isSelfDrive, driver, isInsured, insuranceProviderName, numberOfSeats, fuelType, ratePerDay, ratePerKM);
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
}
