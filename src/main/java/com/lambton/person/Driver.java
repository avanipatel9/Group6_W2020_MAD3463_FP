package com.lambton.person;

import com.lambton.person.Person;

public class Driver extends Person
{
    private int drivingLicenceNumber;
    private boolean isDrivingHistoryCleared;
    private float salary;

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
}
