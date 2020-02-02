package com.lambton.person;

import java.time.LocalDate;

public class Driver extends Person
{
    private int drivingLicenceNumber;
    private boolean isDrivingHistoryCleared;
    private float salary;

   public Driver(int id, String firstName, String lastName,Gender gender, LocalDate birthDate, String mobileNumber, String emailID, String userName, String password, int drivingLicenceNumber, boolean isDrivingHistoryCleared, float salary) {
        super(id, firstName, lastName,gender, birthDate, mobileNumber, emailID, userName, password);
        this.drivingLicenceNumber = drivingLicenceNumber;
        this.isDrivingHistoryCleared = isDrivingHistoryCleared;
        this.salary = salary;
    }

    public int getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public void setDrivingLicenceNumber(int drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public boolean isDrivingHistoryCleared() {
        return isDrivingHistoryCleared;
    }

    public void setDrivingHistoryCleared(boolean drivingHistoryCleared) {
        isDrivingHistoryCleared = drivingHistoryCleared;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void display() {

    }
}
