package com.lambton;
import com.lambton.vehicle.Vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;

public class VehicleRent implements IDisplay
{
    LocalDate rentStartDate;
    LocalDate rentEndDate;
    int totalDaysOfRent;
    Vehicle vehicle;
    double noOfKmDerived;
    double totalBillToPay;
    public VehicleRent(){}

    public VehicleRent(LocalDate vr1startDate, LocalDate vr1endDate, int noOfDays, String vehicleId, int noOfKmDrived)
    { }


    public LocalDate getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(LocalDate rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public LocalDate getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(LocalDate rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public int getTotalDaysOfRent() {
        return totalDaysOfRent;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getNoOfKmDerived() {
        return noOfKmDerived;
    }

    public double getTotalBillToPay() {
        return totalBillToPay;
    }

    public  int rentInNoOfDays() throws ArithmeticException
    {
        totalDaysOfRent = (Period.between(rentStartDate,rentEndDate).getYears()) * vehicle.getRatePerDay();
        return totalDaysOfRent;
    }
    public double totalBillToPay() throws ArithmeticException
    {
        totalBillToPay = totalDaysOfRent + (noOfKmDerived * vehicle.getRatePerKM());
        return totalBillToPay;
    }




    @Override
    public void print() throws FileNotFoundException {
        PrintStream o = new PrintStream(new File("Output.txt"));
        PrintStream console = System.out;
        System.setOut(o);
        System.out.println("----------------Vehicle Rent Details-----------------");
        System.out.println("Rent Start Date : " +rentStartDate);
        System.out.println("Rent End  Date : " +rentEndDate);
        System.out.println("Total Days Of Rent : " +rentInNoOfDays());
        System.out.println("No Of Km Derived : " +noOfKmDerived);
        System.out.println("Total Bill To Pay : " +totalBillToPay());

    }
}

