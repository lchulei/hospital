package com.solvd.lava.hospital.people.employee;

import com.solvd.lava.hospital.people.employee.interfaces.InteractWithPatient;
import com.solvd.lava.hospital.people.patients.Patient;

import java.util.Date;

public class Allergist extends Employee implements InteractWithPatient {
    private int doctorId;

    public Allergist() {

    }

    public Allergist(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
                       float salary, String gettingStarted, String workPhoneNumber, int officeNumber, int doctorId) {
        super(name, surname, birthday, sex, phoneNumber, address, salary, gettingStarted, workPhoneNumber, officeNumber);
        this.doctorId = doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getDoctorId() {
        return  doctorId;
    }


    @Override
    public void examinePatient(Patient patient) {
        System.out.println("Patient examined!");
    }

    @Override
    public void writeAReferral(Patient patient) {

    }

    @Override
    public void writeAPrescription(Patient patient) {

    }
}
