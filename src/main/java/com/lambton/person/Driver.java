package com.lambton.person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;

public class Driver extends Person
{
    private int drivingLicenceNumber;
    private boolean isDrivingHistoryCleared;
    private float salary;


    public Driver() {
    }

   public Driver(int id, String firstName, String lastName,String gender, LocalDate birthDate, String mobileNumber, String emailID, String userName, String password, int drivingLicenceNumber, boolean isDrivingHistoryCleared, float salary) {

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
    public void print() throws FileNotFoundException {
        PrintStream o = new PrintStream(new File("Output.txt"));
        PrintStream console = System.out;
        System.setOut(o);
        System.out.println("--------------Driver Details-------------");
        System.out.println("Customer First Name : " + super.firstName);
        System.out.println("Customer Last Name : " + super.lastName);
        System.out.println("Gender : " + super.gender);
        System.out.println("Birth Date : " + super.birthDate);
        System.out.println("Age : " + super.getAge());
        System.out.println("Mobile Number : +1 " + super.mobileNumber);
        System.out.println("Email Id : " + super.emailID);
        System.out.println("Username : " + super.userName);
        System.out.println("Address : " + this.drivingLicenceNumber);
        System.out.println(("Salary : " + salary));
    }
}
