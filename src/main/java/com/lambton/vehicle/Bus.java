package com.lambton.vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Bus extends Vehicle
{
    String busType;
    Boolean serviceAvailability;
    Boolean wifiAvailability;

    public Bus(String vehicleIdNumber, String vehicleInfo, String manufacturerName, Boolean isSelfDrive, String driver, Boolean isInsured, String insuranceProviderName, int numberOfSeats, String fuelType, int ratePerDay, double ratePerKM, String busType, boolean serviceAvailability, boolean wifiAvailability) {
        super();
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
        PrintStream o = new PrintStream(new File("Output.txt"));
        PrintStream console = System.out;
        System.setOut(o);
        System.out.println("---------Bus Details--------------");
        System.out.println("Bus Type: " +busType);
        System.out.println("Service Availability: "+serviceAvailability);
        System.out.println("Wifi Availability: "+wifiAvailability);
    }
}
