package com.lambton;

public class Driver extends Person
{
    int drivingLicenceNumber;
    boolean isDrivingHistoryCleared;
    float salary;

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
