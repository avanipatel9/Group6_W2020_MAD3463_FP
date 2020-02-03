package com.lambton;

import java.net.URL;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities
{
    //Date Format Function
    public LocalDate getDateFromString(String date) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, formatter);
    }

    //Website ULR Validation function
    public  boolean isValid(String url)
    {
        try {
            new URL(url).toURI();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    //Contact number Validation
    public boolean isContactNumberValid(String number)
    {
        Pattern pattern = Pattern.compile("\\d{3}-\\d{7}");
        Matcher matcher = pattern.matcher(number);

        if (matcher.matches()) {
            return  true;
        }
        else
        {
            return  false;
        }
    }

}
