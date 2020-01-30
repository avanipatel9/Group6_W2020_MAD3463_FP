package com.lambton;

import java.net.PasswordAuthentication;
import java.time.LocalDate;

enum Gender{MALE,
    FEMALE,
    OTHERS};
public abstract class Person
{

     Integer id;
     String firstName;
     String lastName;
     Gender gender;
     LocalDate birthDate;
    String mobileNumber;
    String email;
    String userName;
    String password;



}
