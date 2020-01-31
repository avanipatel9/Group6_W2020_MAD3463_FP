package com.lambton;
import java.util.ArrayList;
import  java.util.Date;

public class VehicleRent
{
    Date rentStartDate;
    Date rentEndDate;
    int totalDaysOfRent;
    ArrayList<Vehicle> vehicles;
    double noOfKmDerived;
    double totalBillToPay;

    public Date getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(Date rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public Date getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(Date rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public int getTotalDaysOfRent() {
        return totalDaysOfRent;
    }

    public double getNoOfKmDerived() {
        return noOfKmDerived;
    }

    public double getTotalBillToPay() {
        return totalBillToPay;
    }
}
