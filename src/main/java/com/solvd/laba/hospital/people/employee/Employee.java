package com.solvd.laba.hospital.people.employee;

import com.solvd.laba.hospital.exceptions.PhoneNumberException;
import com.solvd.laba.hospital.people.Human;

import java.util.Date;

public abstract class Employee extends Human {
    private float salary;
    private Date gettingStarted;
    private String workPhoneNumber;
    private int officeNumber;

    public Employee() {

    }

    public Employee(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
                    float salary, Date gettingStarted, String workPhoneNumber) {
        super(name, surname, birthday, sex, phoneNumber, address);
        this.salary = salary;
        this.gettingStarted = gettingStarted;
        this.workPhoneNumber = workPhoneNumber;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return  salary;
    }

    public void setGettingStarted(Date gettingStarted) {
        this.gettingStarted = gettingStarted;
    }

    public Date getGettingStarted() {
        return  gettingStarted;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) throws PhoneNumberException {
        if((workPhoneNumber.length() < 10 || workPhoneNumber.length() > 12) && workPhoneNumber.replaceAll("\\d", "").length() != 0) {
            throw new PhoneNumberException("Invalid number");
        } else {
            this.workPhoneNumber = workPhoneNumber;
        }
    }

    public String getWorkPhoneNumber() {
        return  workPhoneNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public int getOfficeNumber() {
        return  officeNumber;
    }

}
