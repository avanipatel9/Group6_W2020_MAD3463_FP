package com.lambton.person;
import com.lambton.IDisplay;
import com.lambton.utilities.CommonFunctions;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public abstract class Person  implements IDisplay
{

//Person Attributes

    protected int id;
    protected String firstName;
    protected String lastName;
    protected String gender;
    protected LocalDate birthDate;
    protected String mobileNumber;
    protected String emailID;
    protected String userName;
    protected String password;
    CommonFunctions cf= new CommonFunctions();


    //Default Constructor
     public Person() {
     }
    
     public Person(int id, String firstName, String lastName, String gender, LocalDate birthDate, String mobileNumber, String emailID, String userName, String password) {
         this.id = id;
         this.firstName = firstName;
         this.lastName = lastName;
        this.gender = gender;
         this.birthDate = birthDate;
         this.mobileNumber = mobileNumber;
         this.emailID = emailID;
         this.userName = userName;
         this.password = password;
     }

//Adding Getter Setter
     public int getId() {
        return id;
    }

     public void setId(int id) {
         this.id = id;
     }

     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        cf.isContactNumberValid(mobileNumber);
        this.mobileNumber = mobileNumber;
    }



    public String getEmailID() {
         return emailID;
    }

   public void setEmailID(String emailID) {
       boolean valid = validateEmail(emailID);
       if(valid == false)
       {
           System.out.println("Invalid email Id");

       }
       else
           {
               this.emailID = emailID;
           }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Get age from birthdate
    public int getAge() {
        int age;
        age = Period.between(birthDate, LocalDate.now()).getYears();
        return age;
    }

     // Email Regex java
     private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

     // static Pattern object, since pattern is fixed
     private static Pattern pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);

     // non-static Matcher object because it's created from the input String
     private Matcher matcher;


     public boolean validateEmail(String email) {
         email = emailID;
         matcher = pattern.matcher(email);
         System.out.println(matcher.matches());
         return matcher.matches();
     }
 }







