package com.lambton;
import com.lambton.person.Customer;
import com.lambton.person.Driver;
import com.lambton.person.Gender;
import com.lambton.vehicle.Car;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;


public class VehicleRentingSystem {
    public static void main(String[] args) throws FileNotFoundException {
        // Creating a File object that represents the disk file.
       PrintStream o = new PrintStream(new File("Output.txt"));
        // Store current System.out before assigning a new value
        PrintStream console = System.out;
        // Assign o to output stream
        System.setOut(o);
        System.out.println("This will be written to the text file");
        System.out.println("This will be written to the text file 2 ");
        System.out.println("This will be written to the text file 3 ");
        // Use stored value for output stream
        System.setOut(console);
        System.out.println("This will be written on the console!");


        LocalDate c1birthDate = LocalDate.of(1993,02,27);
        Customer c1 = new Customer(1,"John", "Thomas", Gender.MALE, c1birthDate,
        "4782257410", "John123@gmail.com", "John_123", "John123", "26,Painted Post",
        "Brampton");

        LocalDate c2birthDate = LocalDate.of(1979,12,2);
      Customer c2 = new Customer(2,"Johnsan", "Kale", Gender.MALE, c2birthDate,
                "4782275810", "Johnsan123@gmail.com", "John35", "John@123",
              "26,Markham Road","Toronto");

        LocalDate c3birthDate = LocalDate.of(1989,04,30);
        Customer c3 = new Customer(3,"Christiana", "Roger", Gender.FEMALE, c3birthDate,
                "6478587419", "Christ@gmail.com", "Christiana_Roger", "xaY32@tyu",
                "B143,Mornington Road","Scarborough");

        LocalDate c4birthDate = LocalDate.of(1990,11,16);
        Customer c4 = new Customer(4,"Aubrie", "Clucas", Gender.MALE, c4birthDate,
                "8795514792", "Aurbie@gmail.com", "Ruby_12", "tre5TY@tyu",
                "6488 Bellgrove Plaza","Okinawa ");

        LocalDate c5birthDate = LocalDate.of(1986,07,19);
        Customer c5 = new Customer(5,"Lorelei ", "Anshell", Gender.FEMALE, c5birthDate,
                "2576690158", "lanshell1@reverbnation.com", "lanshell1", "L7ZvtX5wJN",
                "34 Fuller Lane","Novorossiysk");


        LocalDate d1birthDate = LocalDate.of(1972,02,17);
        Driver d1 = new Driver(1, "Phebe", "Regitz", Gender.MALE,d1birthDate, "6757862345", "pregitz0@sohu.com",
                "pregitz0", "r6mFc6", 57656258, true, 1500);

        LocalDate d2birthDate = LocalDate.of(1972,02,17);
        Driver d2 = new Driver(2, "Alford", "Greenshields", Gender.FEMALE,d2birthDate, "5792798502", "agreenshields1@mit.edu",
                "agreenshields1", "xpKQpM", 57656723, true, 2000);

        LocalDate d3birthDate = LocalDate.of(1972,02,17);
        Driver d3 = new Driver(3, "Genni", "Tumielli", Gender.MALE,d3birthDate, "7890251963", "gtumielli2@typepad.com",
                "gtumielli2", "L72MVz", 78902514, false, 2500);

        LocalDate d4birthDate = LocalDate.of(1972,02,17);
        Driver d4 = new Driver(4, "Padraig", "Stanwix", Gender.MALE,d4birthDate, "7036971852", "pstanwix3@themeforest.net",
                "pstanwix3", "SOaoCxBAm9Go", 78526723, true, 3000);

        LocalDate d5birthDate = LocalDate.of(1972,02,17);
        Driver d5 = new Driver(5, "Gusty", "Mityakov", Gender.FEMALE,d5birthDate, "6852089175", "gmityakov4@howstuffworks.com",
                "gmityakov4", "CGHjDQVnhA", 57125823, false, 1000);

    }
}
