package com.lambton.vehicle;

public class Bus extends Vehicle
{
    String busType;
    Boolean serviceAvailability;
    Boolean wifiAvailability;

    public Bus(String vehicleIdNumber, String vehicleInfo, String manufacturerName, Boolean isSelfDrive, String driver, Boolean isInsured, String insuranceProviderName, int numberOfSeats, String fuelType, int ratePerDay, double ratePerKM, String busType, boolean serviceAvailability, boolean wifiAvailability) {
        super(vehicleIdNumber, vehicleInfo, manufacturerName, isSelfDrive, driver, isInsured, insuranceProviderName, numberOfSeats, fuelType, ratePerDay, ratePerKM);
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
    public void print() {

    }
}
