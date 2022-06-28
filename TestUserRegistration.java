package com.junit;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;


public class TestUserRegistration {
    UserRegistration userRegistration = new UserRegistration();

    @Before
    public void initialize(){
       userRegistration = new UserRegistration();
    }


    @Test
    public void givenName_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validateName("^[A-Z][a-z]{2,}$","Riya");
        assertTrue(result);
    }

    @Test
    public void givenPassword_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validatePassword("^[A-Z][0-9][@#]{1}[a-z]{5,}$","K9@hgjkjijk");
        assertTrue(result);
    }

    @Test
    public void givenMobileNo_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validateMobileNo("^[9][1]\\s[9][0-9]{9}$","91 9876543892");
        assertTrue(result);
    }

    @Test
    public void givenEmail_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validateEmail("^[a-z]{3}[.][x-z]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][i][n]$", "abc.xyz@bl.co.in");
        assertTrue(result);
    }




}
