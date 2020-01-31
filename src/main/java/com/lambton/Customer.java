package com.lambton;

import java.util.ArrayList;

public class Customer extends  Person
{
    String address;
    String city;
    ArrayList<VehicleRent> vehicleRents;

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
}
