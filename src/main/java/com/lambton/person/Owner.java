package com.lambton.person;

import com.lambton.vehicle.Vehicle;

import java.time.LocalDate;
import java.util.List;

public class Owner extends Person
{
    private String companyTitle;
    private  String landlineNumber;
    private String website;
    List<Vehicle> vehicles;



    public Owner(int id, String firstName, String lastName, String gender, LocalDate birthDate, String mobileNumber, String emailID, String userName, String password, String companyTitle, String landlineNumber, String website, List<Vehicle> vehicles) {
        super(id, firstName, lastName,gender, birthDate, mobileNumber, emailID, userName, password);
        this.companyTitle = companyTitle;
        this.landlineNumber = landlineNumber;
        this.website = website;
        this.vehicles = vehicles;
    }

    public Owner() {

    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
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
        System.out.println("Company Name : " + companyTitle);
        System.out.println("Landline number : " + landlineNumber);
        System.out.println("Website : " + website);
    }
}
