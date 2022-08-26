package com.solvd.laba.hospital.people.employee;

import com.solvd.laba.hospital.exceptions.IdException;

import java.util.Date;

public class FamilyDoctor extends Employee {
    private int doctorId;

    public FamilyDoctor() {

    }

    public FamilyDoctor(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
                       float salary, Date gettingStarted, String workPhoneNumber) {
        super(name, surname, birthday, sex, phoneNumber, address, salary, gettingStarted, workPhoneNumber);
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
