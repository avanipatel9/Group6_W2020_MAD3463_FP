package com.lambton.person;

import com.lambton.VehicleRent;
import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person
{
    private String address;
    private String city;
    ArrayList<VehicleRent> vehicleRents;

    public Customer(int id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String emailID, String userName, String password, String address, String city, ArrayList<VehicleRent> vehicleRents) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailID, userName, password);
        this.address = address;
        this.city = city;
        this.vehicleRents = vehicleRents;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void display() {

    }
}
