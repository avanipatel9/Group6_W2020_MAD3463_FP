package com.lambton.person;

import com.lambton.VehicleRent;
import com.lambton.person.Person;

import java.util.ArrayList;

public class Customer extends Person
{
    private String address;
    private String city;
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
