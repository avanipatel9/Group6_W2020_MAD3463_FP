package com.lambton.vehicle;

import java.io.FileNotFoundException;

public class Bus extends Vehicle
{
    String busType;
    Boolean serviceAvailability;
    Boolean wifiAvailability;

    public Bus() {
    }

    public Bus(String vehicleIdNumber, String vehicleInfo, String manufacturerName, Boolean isSelfDrive, String driver, Boolean isInsured,
               String insuranceProviderName, int numberOfSeats, FuelType fuelType, int ratePerDay, double ratePerKM, String busType,
               boolean serviceAvailability, boolean wifiAvailability)
    {
        super(vehicleIdNumber,  vehicleInfo, manufacturerName, isSelfDrive, driver, isInsured, insuranceProviderName,numberOfSeats, fuelType,  ratePerDay, ratePerKM);
        this.busType = busType;
        this.serviceAvailability = serviceAvailability;
        this.wifiAvailability = wifiAvailability;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public boolean isServiceAvailability() {
        return serviceAvailability;
    }

    public void setServiceAvailability(boolean serviceAvailability) {
        this.serviceAvailability = serviceAvailability;
    }

    public boolean isWifiAvailability() {
        return wifiAvailability;
    }

    public void setWifiAvailability(boolean wifiAvailability) {
        this.wifiAvailability = wifiAvailability;
    }

    @Override
    public void print() throws FileNotFoundException {

        System.out.println("--------------Bus Details-------------");
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
        System.out.println("Bus Type : " + busType);
        System.out.println("WiFi : " + wifiAvailability);
        System.out.println("Service availability : " + serviceAvailability);

    }
}
