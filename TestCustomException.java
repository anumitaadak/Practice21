package com.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCustomException {
    //static void validate ()
    public static void main(String[] args) {
        try
        {
            TestCustomException testCustomException = new TestCustomException();
            testCustomException.validateName("^[A-Z][a-z]{2,}$","Riya");
        }
        catch (InvalidUserRegistration message)
        {
            System.out.println("Exception occured: " + message);
        }

        try
        {
            TestCustomException testCustomException = new TestCustomException();
            testCustomException.validateEmail("^[a-z]{3}[.][x-z]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][i][n]$","abc@yahoo.com");
        }
        catch (InvalidUserRegistration message)
        {
            System.out.println("Exception occured: " + message);
        }

        try
        {
            TestCustomException testCustomException = new TestCustomException();
            testCustomException.validatePassword("^[9][1]\\s[9][0-9]{9}$","91 9876543892");
        }
        catch (InvalidUserRegistration message)
        {
            System.out.println("Exception occured: " + message);
        }

        try
        {
            TestCustomException testCustomException = new TestCustomException();
            testCustomException.validateMobileNo("^[A-Z][0-9][@#]{1}[a-z]{5,}$","K9@hgjkjijk");
        }
        catch (InvalidUserRegistration message)
        {
            System.out.println("Exception occured: " + message);
        }
    }

    public void  validateName(String RegExp, String testExp) throws InvalidUserRegistration {
        Pattern pattern = Pattern.compile(RegExp);
        Matcher matcher = pattern.matcher(testExp);

        if(matcher.matches()){

            throw new InvalidUserRegistration("Name is valid");
        }
        else {
            System.out.println("Name is not valid");
        }
    }

    public void validateEmail(String RegExp, String testExp) throws InvalidUserRegistration{
        Pattern pattern = Pattern.compile(RegExp);
        Matcher matcher = pattern.matcher(testExp);

        if(matcher.matches()){

            throw new InvalidUserRegistration("Email is valid");
        }
        else {
            System.out.println("Email is not valid");
        }
    }

    public void validateMobileNo(String RegExp, String testExp)  throws InvalidUserRegistration{
        Pattern pattern = Pattern.compile(RegExp);
        Matcher matcher = pattern.matcher(testExp);

        if(matcher.matches()){

            throw new InvalidUserRegistration("Mobile No. is valid");
        }
        else {
            System.out.println("Mobile No. is not valid");
        }
    }

    public void validatePassword(String RegExp, String testExp) throws InvalidUserRegistration {
        Pattern pattern = Pattern.compile(RegExp);
        Matcher matcher = pattern.matcher(testExp);
        if(matcher.matches()){

            throw new InvalidUserRegistration("Password is valid");
        }
        else {
            System.out.println("Password is not valid");
        }

    }

}

