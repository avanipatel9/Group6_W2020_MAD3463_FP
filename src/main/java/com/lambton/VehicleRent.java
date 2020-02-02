package com.lambton;
import com.lambton.vehicle.Vehicle;
import java.time.LocalDate;
import java.util.ArrayList;

public class VehicleRent
{
    LocalDate rentStartDate;
    LocalDate rentEndDate;
    int totalDaysOfRent;
    ArrayList<Vehicle> vehicles;
    double noOfKmDerived;
    double totalBillToPay;

    //Singleton class implementation
    private static volatile VehicleRent vVehicleRent = new VehicleRent();

    //private constructor.
    private VehicleRent(){}

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

        return 0;
    }


}




