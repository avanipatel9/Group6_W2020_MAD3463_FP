package com.lambton.vehicle;

public class MotorCycle extends Vehicle
{
    int maxSpeed;
    float Milage;

    public MotorCycle(String vehicleIdNumber, String vehicleInfo, String manufacturerName, Boolean isSelfDrive, String driver, Boolean isInsured, String insuranceProviderName, int numberOfSeats, String fuelType, int ratePerDay, double ratePerKM, int maxSpeed, float milage) {
        super(vehicleIdNumber, vehicleInfo, manufacturerName, isSelfDrive, driver, isInsured, insuranceProviderName, numberOfSeats, fuelType, ratePerDay, ratePerKM);
        this.maxSpeed = maxSpeed;
        Milage = milage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getMilage() {
        return Milage;
    }

    public void setMilage(float milage) {
        Milage = milage;
    }

    @Override
    public void print() {

    }
}
