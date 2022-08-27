package com.solvd.laba.hospital.people.employee;

import com.solvd.laba.hospital.exceptions.IdException;

import java.time.LocalDate;

public class FamilyDoctor extends Employee {
    private int doctorId;

    public FamilyDoctor() {

    }

    public FamilyDoctor(String name, String surname, LocalDate birthday, String sex, String phoneNumber, String address,
                        float salary, LocalDate gettingStarted, String workPhoneNumber) {
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

    @Override
    public String toString() {
        return "FamilyDoctor{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", sex='" + getSex() + '\'' +
                ", birthday=" + getBirthday() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", workPhoneNumber='" + getWorkPhoneNumber() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", salary=" + getSalary() +
                ", gettingStarted=" + getGettingStarted() +
                ", doctorId=" + doctorId +
                '}';
    }
}
