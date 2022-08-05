package com.solvd.lava.hospital.people.employee;

import java.util.Date;

public class HeadDoctor extends Employee{
    private int doctorId;

    public HeadDoctor() {

    }

    public HeadDoctor(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
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
}
