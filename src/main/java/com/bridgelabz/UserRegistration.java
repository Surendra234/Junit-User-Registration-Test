package com.bridgelabz;

public class UserRegistration {

    private static final String firstNamePattern = "[A-Z]{1}[a-z]{3,}$";
    private static final String lastNamePattern = "^[A-Z]{1}[a-z]{3,}$";
    private static final String emailPattern = "^[a-zA-Z0-9+-]+@[.a-zA-Z0-9.-]+$";
    private static final String phoneNoPattern = "[0-9\s+]{4}+[6789]{1}+[0-9]{9}+$";
    private static final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}";

    public boolean checkFirstName(String firstName) {
        if(firstName.matches(firstNamePattern))
            return true;
        else
            return false;
    }

    public boolean checkLastName(String lastName) {
        if(lastName.matches(lastNamePattern))
            return true;
        else
            return false;
    }

    public boolean checkEmail(String email) {
        if(email.matches(emailPattern))
            return true;
        else
            return false;
    }

    public boolean checkPhoneNo(String phoneNo) {
        if(phoneNo.matches(phoneNoPattern))
            return true;
        else
            return false;
    }

    public boolean checkPassword(String password) {
        if(password.matches(passwordPattern))
            return true;
        else
            return false;
    }
}