package com.solvd.laba.hospital.people;

import com.solvd.laba.hospital.exceptions.PhoneNumberException;

import java.util.Date;

public abstract class Human {
    private String name;
    private String surname;
    private Date birthday;
    private String sex;
    private String phoneNumber;
    private String address;

    public Human() {

    }

    public Human(String name, String surname, Date birthday, String sex, String phoneNumber, String address) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return  name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return  surname;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return  birthday;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return  sex;
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneNumberException {
        if ((phoneNumber.length() < 10 || phoneNumber.length() > 12) && phoneNumber.replaceAll("\\d", "").length() != 0) {
            throw new PhoneNumberException("Invalid number");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPhoneNumber() {
        return  phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return  address;
    }

}
