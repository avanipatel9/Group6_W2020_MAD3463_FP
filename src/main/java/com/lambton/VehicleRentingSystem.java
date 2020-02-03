package com.lambton;
import com.lambton.person.*;
import com.lambton.vehicle.Bus;
import com.lambton.vehicle.Car;
import com.lambton.vehicle.MotorCycle;
import com.lambton.vehicle.Vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


public class VehicleRentingSystem {
  private ArrayList<Vehicle> Vehicles;

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


    List<Vehicle> vehicleList = new ArrayList<Vehicle>();
    List<Owner> ownerList = new ArrayList<Owner>();
    List<Customer> customerList = new ArrayList<Customer>();


      VehicleRentingSystem vrs = new VehicleRentingSystem();

      vrs.addOwner();
      vrs.showOwnerDetails();
      vrs.addCustomer();
      vrs.showCustomerDetails();
    }

    public void addOwner()
    {

      LocalDate o1birthDate = LocalDate.of(1992,11,12);
      Owner o1 = new Owner(1, "Logan", "Smith", Gender.MALE, o1birthDate, "6851478520", "LoganSmith@yahoo.com",
              "Logan_12", "Logan@12342", "Tillman, Hand and Aufderhar", "9825147", "Carzz@ca", null);

      LocalDate o2birthDate = LocalDate.of(1985,01,13);
      Owner o2 = new Owner(2, "Grannie", "Fairbanks", Gender.MALE, o2birthDate, "6851478520", "gfairbanks0@cbsnews.com",
              "gfairbanks0", "VR8wcd", "Rosenbaum, Schaden and O'Kon", "1791023", "washington.edu", null);

      LocalDate o3birthDate = LocalDate.of(1978,07,15);
      Owner o3 = new Owner(3, "Dicky", "Poli", Gender.MALE, o3birthDate, "6851478520", "dpoli1@drupal.org",
              "dpoli1", "HhTUiByP", "Rice Group", "4229698", "bigcartel.com", null);

      LocalDate o4birthDate = LocalDate.of(1982,10,26);
      Owner o4 = new Owner(4, "Ralf", "Rossetti", Gender.MALE, o4birthDate, "6851478520", "rrossetti2@ca.gov",
              "rrossetti2", "YO43tFQFcqap", "Fadel, Pollich and Schulist", "5288027", "pinterest.com", null);

      LocalDate o5birthDate = LocalDate.of(1991,12,14);
      Owner o5 = new Owner(5, "Madlin", "Leaman", Gender.MALE, o5birthDate, "6851478520", "mleaman3@adobe.com",
              "mleaman3", "lMMMbM3OZu0F", "Christiansen", "9848129", "imdb.com", null);



      LocalDate d1birthDate = LocalDate.of(1972,06,17);
      Driver d1 = new Driver(1, "Phebe", "Regitz", Gender.MALE,d1birthDate, "6757862345", "pregitz0@sohu.com",
              "pregitz0", "r6mFc6", 57656258, true, 1500);

      LocalDate d2birthDate = LocalDate.of(1989,05,27);
      Driver d2 = new Driver(2, "Alford", "Greenshields", Gender.FEMALE,d2birthDate, "5792798502", "agreenshields1@mit.edu",
              "agreenshields1", "xpKQpM", 57656723, true, 2000);

      LocalDate d3birthDate = LocalDate.of(1982,04,30);
      Driver d3 = new Driver(3, "Genni", "Tumielli", Gender.MALE,d3birthDate, "7890251963", "gtumielli2@typepad.com",
              "gtumielli2", "L72MVz", 78902514, false, 2500);

      LocalDate d4birthDate = LocalDate.of(1998,03,12);
      Driver d4 = new Driver(4, "Padraig", "Stanwix", Gender.MALE,d4birthDate, "7036971852", "pstanwix3@themeforest.net",
              "pstanwix3", "SOaoCxBAm9Go", 78526723, true, 3000);

      LocalDate d5birthDate = LocalDate.of(1989,02,29);
      Driver d5 = new Driver(5, "Gusty", "Mityakov", Gender.FEMALE,d5birthDate, "6852089175", "gmityakov4@howstuffworks.com",
              "gmityakov4", "CGHjDQVnhA", 57125823, false, 1000);



      List<Vehicle> o1vehicleList = new ArrayList<Vehicle>();
      o1.setVehicles(o1vehicleList);

      List<Vehicle> o2vehicleList = new ArrayList<Vehicle>();
      o2.setVehicles(o2vehicleList);

      List<Vehicle> o3vehicleList = new ArrayList<Vehicle>();
      o3.setVehicles(o1vehicleList);

      List<Vehicle> o4vehicleList = new ArrayList<Vehicle>();
      o4.setVehicles(o4vehicleList);

      List<Vehicle> o5vehicleList = new ArrayList<Vehicle>();
      o5.setVehicles(o5vehicleList);


      Car ca1 = new Car("Z5K39Z0W76366K354", "DX 4dr Sedan", "Honda", Boolean.TRUE, "Genni", Boolean.TRUE, "Logan",
              4, "Diesel", 100, 5, "SUV", "Black");

      Car ca2 = new Car("6V035N1185A022427", "Limited 4dr SUV (4.7L 8cyl 5A)", "Suzuki", Boolean.FALSE, "Alford", Boolean.TRUE, "Ben",
              6, "Diesel", 100, 5, "Sedan", "Gray");

      Car ca3 = new Car("1V461X50812V17645", "SEL 4dr Sedan (3.0L 6cyl 4A)", "Honda", Boolean.TRUE, "Gusty", Boolean.TRUE, "William",
              2, "Electric", 100, 5, "Compact", "White");

      Car ca4 = new Car("4K0845277599C59LB", "4dr SUV AWD (2.5L 4cyl gas/electric hybrid CVT)", "BMW", Boolean.TRUE, "Alford", Boolean.TRUE, "Edward",
              4, "Petrol", 100, 5, "Luxury", "Red");

      Car ca5 = new Car("6V035N1185A022427", "4dr Sedan w/Technology Package (3.5L 6cyl 6A)", "Toyoto", Boolean.FALSE, "Padraig", Boolean.FALSE, "Phenix",
              8, "Diesel", 100, 5, "Minivan", "Black");



      MotorCycle m1 = new MotorCycle("V99JP7L7808854296", "4dr Crew Cab 4WD SB w/2HY (6.0L 8cyl gas/electric hybrid 4A)", "Yamaha", Boolean.TRUE, "Rocky", Boolean.TRUE,
              "Bella", 2, "Electric", 50, 1, 25, 12);

      MotorCycle m2 = new MotorCycle("4XZ2M7U06Z329433A", "Work Truck 2dr Regular Cab 8 ft. LB (4.3L 6cyl 4A)", "Honda ", Boolean.TRUE, "Jacob", Boolean.TRUE,
              "Benny", 2, "Petrol", 50, 1, 40, 20);

      MotorCycle m3 = new MotorCycle("8H6S28DT397218808", "s Grand Touring 4dr SUV (3.0L 6cyl 6A)", "Ducati", Boolean.FALSE, "Liam", Boolean.TRUE,
              "Keith", 2, "Electric", 50, 1, 55, 30);

      MotorCycle m4 = new MotorCycle("6YV915045UG755121", "LT 4dr Crew Cab 4WD SB (3.7L 5cyl 4A)", "Harley-Davidson", Boolean.TRUE, "Felix", Boolean.TRUE,
              "Christ", 2, "Petrol", 50, 1, 75, 40);

      MotorCycle m5 = new MotorCycle("R895E663184691870", "S 4dr Sedan (4.8L 8cyl 7AM)", "Kawasaki", Boolean.TRUE, "Nathan", Boolean.TRUE,
              "Chris", 2, "Petrol", 50, 1, 65, 32);


      Bus b1 = new Bus("5S579939423J74119", "xDrive30i 4dr SUV AWD (3.0L 6cyl 6M)", "Leo", Boolean.TRUE, "Samuel", Boolean.FALSE, "Victor",
              12, "Diesel", 250, 7, "Volvo", Boolean.FALSE, Boolean.TRUE);

      Bus b2 = new Bus("K14G7289138870436", "Laramie 4dr Club Cab SB (3.7L 6cyl 4A)", "Noha", Boolean.TRUE, "Theo", Boolean.FALSE, "Antonie",
              14, "Diesel", 250, 7, "Bus", Boolean.TRUE, Boolean.TRUE);

      Bus b3 = new Bus("G9416715255045385", "S 4dr SUV AWD (2.5L 4cyl CVT)", "Oliver", Boolean.FALSE, "Nolam", Boolean.TRUE, "Louis",
              8, "Petrol", 250, 7, "MiniBus", Boolean.FALSE, Boolean.FALSE);

      Bus b4 = new Bus("4XZ2M7U06Z329433A", "Sport 4dr SUV 4WD (3.5L 6cyl 5A)", "Charles", Boolean.TRUE, "Andrew", Boolean.TRUE, "Lucas",
              12, "Diesel", 250, 7, "Coach", Boolean.TRUE, Boolean.TRUE);

      Bus b5 = new Bus("V99JP7L7808854296", "2dr Regular Cab LB (4.0L 6cyl 6M)", "Olivia", Boolean.TRUE, "Mathaes", Boolean.TRUE, "Justin",
              8, "Petrol", 250, 7, "MiniBus", Boolean.TRUE, Boolean.TRUE);






    }

}

