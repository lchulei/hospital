package com.solvd.lava.hospital.people.employee;

import com.solvd.lava.hospital.people.Human;

import java.util.Date;

public abstract class Employee extends Human {
    private float salary;
    private String gettingStarted;
    private String workPhoneNumber;
    private int officeNumber;

    public Employee() {

    }

    public Employee(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
                    float salary, String gettingStarted, String workPhoneNumber, int officeNumber) {
        super(name, surname, birthday, sex, phoneNumber, address);
        this.salary = salary;
        this.gettingStarted = gettingStarted;
        this.workPhoneNumber = workPhoneNumber;
        this.officeNumber = officeNumber;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return  salary;
    }

    public void setGettingStarted(String gettingStarted) {
        this.gettingStarted = gettingStarted;
    }

    public String getGettingStarted() {
        return  gettingStarted;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
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
