package com.solvd.lava.hospital.exceptions;

import java.io.IOException;

public class PhoneNumberException extends IOException {

    private String phoneNumber;

    public PhoneNumberException(String message) {

        super(message);

    }

    public PhoneNumberException(String message, String phoneNumber) {

        super(message);

        this.phoneNumber = phoneNumber;

    }

    public String getPhoneNumber() {

        return phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

}