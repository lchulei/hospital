package com.solvd.lava.hospital.people.employee;

import com.solvd.lava.hospital.people.patients.Patient;

import java.util.Date;

public class Surgeon extends Employee {
    private int doctorId;
    private int theNumberOfOperations;

    public Surgeon() {

    }

    public Surgeon(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
                   float salary, String gettingStarted, String workPhoneNumber, int officeNumber,
                   int doctorId, int theNumberOfOperations) {
        super(name, surname, birthday, sex, phoneNumber, address, salary, gettingStarted, workPhoneNumber, officeNumber);
        this.doctorId = doctorId;
        this.theNumberOfOperations = theNumberOfOperations;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getDoctorId() {
        return  doctorId;
    }

    public void setTheNumberOfOperations(int theNumberOfOperations) {
        this.theNumberOfOperations = theNumberOfOperations;
    }

    public int getTheNumberOfOperations() {
        return  theNumberOfOperations;
    }

    public void performAnOperation(Patient patient) {
        theNumberOfOperations++;
    }


}
