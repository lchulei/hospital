package com.solvd.lava.hospital.people.employee;

import com.solvd.lava.hospital.exceptions.IdException;

import java.util.Date;

public class Nurse extends Employee {
    private int doctorId;

    public Nurse() {

    }

    public Nurse(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
                 float salary, String gettingStarted, String workPhoneNumber, int officeNumber, int doctorId) {
        super(name, surname, birthday, sex, phoneNumber, address, salary, gettingStarted, workPhoneNumber, officeNumber);
        this.doctorId = doctorId;
    }

    public void setDoctorId(int doctorId) throws IdException {
        if(doctorId <= 0) {
            throw new IdException("Id can`t be less than or equal to 0");
        } else {
            this.doctorId = doctorId;
        }
    }

    public int getDoctorId() {
        return  doctorId;
    }
}
