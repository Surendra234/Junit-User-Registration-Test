package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void checkFirstNameTest() {
        Assertions.assertTrue(userRegistration.checkFirstName("Surendra"),"Correct First Name");
        Assertions.assertFalse(userRegistration.checkFirstName("sUREndra"),"Incorrect First Name");
    }

    @Test
    public void checkLastNameTest() {
        Assertions.assertTrue(userRegistration.checkLastName("Mahawar"),"Correct Last Name");
        Assertions.assertFalse(userRegistration.checkLastName("maHaWar"),"Incorrect Last Name");
    }

    @Test
    public void checkEmailTest() {
        Assertions.assertTrue(userRegistration.checkEmail("abc111@abc.com"),"Correct Email");
        Assertions.assertFalse(userRegistration.checkEmail(".abc@abc.com"),"Incorrect Email");
    }

    @Test
    public void checkPhoneNoTest() {
        Assertions.assertTrue(userRegistration.checkPhoneNo("+91 9588201873"),"Correct Phone No");
        Assertions.assertFalse(userRegistration.checkPhoneNo("+213 456734248"),"Incorrect Phone No");
    }

    @Test
    public void checkPasswordTest() {
        Assertions.assertTrue(userRegistration.checkPassword("Abc89@123"),"Correct Password");
        Assertions.assertFalse(userRegistration.checkPassword("Abc"),"Incorrect Password");
    }
}