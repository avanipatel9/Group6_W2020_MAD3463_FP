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

    public Owner(int id, String firstName, String lastName,Gender gender, LocalDate birthDate, String mobileNumber, String emailID, String userName, String password, String companyTitle, String landlineNumber, String website, List<Vehicle> vehicles) {
        super(id, firstName, lastName,gender, birthDate, mobileNumber, emailID, userName, password);
        this.companyTitle = companyTitle;
        this.landlineNumber = landlineNumber;
        this.website = website;
        this.vehicles = vehicles;
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

    @Override
    public void display() {

    }
}
