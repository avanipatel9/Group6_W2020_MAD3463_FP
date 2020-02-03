package com.lambton;
import com.lambton.vehicle.Vehicle;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class VehicleRent
{
    LocalDate rentStartDate;
    LocalDate rentEndDate;
    int totalDaysOfRent;
    Vehicle vehicle;
    double noOfKmDerived;
    double totalBillToPay;

    //Singleton class implementation
    private static volatile VehicleRent vVehicleRent = new VehicleRent();

    //private constructor.
    public VehicleRent(){}

    public VehicleRent(LocalDate vr1startDate, LocalDate vr1endDate, int noOfDays, String vehicleId, int noOfKmDrived)
    {

    }

    public static VehicleRent getInstance() {
        return vVehicleRent;
    }


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

    public void display() {
        
    }

    public Vehicle getVehicle() {
    }
}




