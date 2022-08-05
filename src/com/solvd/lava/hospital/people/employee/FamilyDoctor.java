package com.solvd.lava.hospital.people.employee;

import com.solvd.lava.hospital.people.patients.Patient;

import java.util.Date;
import java.util.List;

public class FamilyDoctor extends Employee {
    private int doctorId;
    private List<Patient> declaredPatients;

    public FamilyDoctor() {

    }

    public FamilyDoctor(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
                        float salary, String gettingStarted, String workPhoneNumber, int officeNumber,
                        int doctorId, List<Patient> declaredPatients) {
        super(name, surname, birthday, sex, phoneNumber, address, salary, gettingStarted, workPhoneNumber, officeNumber);
        this.doctorId = doctorId;
        this.declaredPatients = declaredPatients;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getDoctorId() {
        return  doctorId;
    }

    public void setDeclaredPatients(List<Patient> declaredPatients) {
        this.declaredPatients = declaredPatients;
    }

    public List<Patient> getDeclaredPatients() {
        return declaredPatients;
    }
}
