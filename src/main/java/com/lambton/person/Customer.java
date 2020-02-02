package com.lambton.person;

import com.lambton.VehicleRent;
import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person
{
    private String address;
    private String city;
    ArrayList<VehicleRent> vehicleRents;

    public Customer(int id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String emailID, String userName, String password, String address, String city)
    //ArrayList<VehicleRent> vehicleRents)
    {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailID, userName, password);
        this.address = address;
        this.city = city;
        //this.vehicleRents = vehicleRents;
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
    public void print()
    {
        System.out.println("Customer First Name : " + super.firstName);
        System.out.println("Customer Last Name : " + super.lastName);
        System.out.println("Gender : " + super.gender);
        System.out.println("Birth Date : " + super.birthDate);
        System.out.println("Age : " + super.getAge());
        System.out.println("Mobile Number : +1 " + super.mobileNumber);
        System.out.println("Email Id : " + super.emailID);
        System.out.println("Username : " + super.userName);
        System.out.println("Address : " + this.address);
        System.out.println("City : " + this.city);
    }
}
