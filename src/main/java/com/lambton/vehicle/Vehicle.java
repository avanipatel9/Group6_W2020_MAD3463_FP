package com.lambton.vehicle;

import com.lambton.IDisplay;

import java.io.FileNotFoundException;
import java.util.HashMap;

public abstract class Vehicle implements IDisplay
{
    String vehicleIdNumber;
    String vehicleInfo;
    String manufacturerName;
    Boolean isSelfDrive;
    String driver;
    Boolean isInsured;
    String insuranceProviderName;
    int numberOfSeats;
    FuelType fuelType;
    int ratePerDay;
    double ratePerKM;
    HashMap<String, String> ratePerKmVehicleTpe = new HashMap<String, String>();

    public Vehicle() {
    }

    public Vehicle(String vehicleIdNumber, String vehicleInfo, String manufacturerName, Boolean isSelfDrive, String driver, Boolean isInsured, String insuranceProviderName, int numberOfSeats, FuelType fuelType, int ratePerDay, double ratePerKM, HashMap<String, String> ratePerKmVehicleTpe) {
        this.vehicleIdNumber = vehicleIdNumber;
        this.vehicleInfo = vehicleInfo;
        this.manufacturerName = manufacturerName;
        this.isSelfDrive = isSelfDrive;
        this.driver = driver;
        this.isInsured = isInsured;
        this.insuranceProviderName = insuranceProviderName;
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
        this.ratePerDay = ratePerDay;
        this.ratePerKM = ratePerKM;
        this.ratePerKmVehicleTpe = ratePerKmVehicleTpe;
    }

    public HashMap<String, String> getRatePerKmVehicleTpe() {
        return ratePerKmVehicleTpe;
    }

    public void setRatePerKmVehicleTpe(HashMap<String, String> ratePerKmVehicleTpe) {
        this.ratePerKmVehicleTpe = ratePerKmVehicleTpe;
    }


    public String getVehicleIdNumber() {
        return vehicleIdNumber;
    }

    public String getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(String vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Boolean getSelfDrive() {
        return isSelfDrive;
    }

    public void setSelfDrive(Boolean selfDrive) {
        isSelfDrive = selfDrive;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Boolean getInsured() {
        return isInsured;
    }

    public void setInsured(Boolean insured) {
        isInsured = insured;
    }

    public String getInsuranceProviderName() {
        return insuranceProviderName;
    }

    public void setInsuranceProviderName(String insuranceProviderName) {
        this.insuranceProviderName = insuranceProviderName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    public int getRatePerDay() {
        return ratePerDay;
    }

    public int setRatePerDay(int ratePerDay) {
        this.ratePerDay = ratePerDay;
        return ratePerDay;
    }
    public double getRatePerKM() {
        return ratePerKM;
    }
    public void setRatePerKM(int ratePerKM) {
        this.ratePerKM = ratePerKM;
    }

    @Override
    public void print() throws FileNotFoundException {
    }
}
