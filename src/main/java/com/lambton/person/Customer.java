package com.lambton.person;

import com.lambton.VehicleRent;
import com.lambton.constants.Constants;
import com.lambton.utilities.Blowfish;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person
{

   //Customer Attributes
    private String address;
    private String city;
    ArrayList<VehicleRent> vehicleRents;

//Default Constructor
    
    public Customer() {
    }

    //Paramaterized Constructor
    public Customer(int id, String firstName, String lastName, String gender, LocalDate birthDate, String mobileNumber, String emailID, String userName, String password, String address, String city, ArrayList<VehicleRent> vehicleRents)
    {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailID, userName, password);
        this.address = address;
        this.city = city;
        this.vehicleRents = vehicleRents;
    }

    //Getter Setter
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

    public ArrayList<VehicleRent> getVehicleRents() {
        return vehicleRents;
    }

    public void setVehicleRents(ArrayList<VehicleRent> vehicleRents) {
        this.vehicleRents = vehicleRents;
    }

    @Override
    public void print() throws FileNotFoundException {
      //  PrintStream o = new PrintStream(new File("output_vehicle_renting_system.txt"));
       // PrintStream console = System.out;
       // System.setOut(o);
        System.out.println("--------------Customer Details-------------");
        System.out.println("Customer First Name : " + super.firstName);
        System.out.println("Customer Last Name : " + super.lastName);
        System.out.println("Gender : " + super.gender);
        System.out.println("Birth Date : " + super.birthDate);
        System.out.println("Age : " + super.getAge());
        System.out.println("Mobile Number : +1 " + super.mobileNumber);
        System.out.println("Email Id : " + super.emailID);
        System.out.println("Password : " + Blowfish.encrypt(password, Constants.key));
        System.out.println("Username : " + super.userName);
        System.out.println("Address : " + this.address);
        System.out.println("City : " + this.city);
    }

    public void VehicleRent(List<VehicleRent> c1rnt) {
    }
}
