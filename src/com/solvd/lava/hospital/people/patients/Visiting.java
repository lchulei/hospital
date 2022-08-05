package com.solvd.lava.hospital.people.patients;

import com.solvd.lava.hospital.enums.Diagnosis;
import com.solvd.lava.hospital.enums.Referral;
import com.solvd.lava.hospital.people.employee.FamilyDoctor;

import java.util.Date;

public class Visiting {
    private Date date;
    private FamilyDoctor familyDoctor;
    private Diagnosis diagnosis;
    private Referral referral;
    private int doctorId;
    private int patientId;

    public Visiting(Date date, FamilyDoctor familyDoctor, Diagnosis diagnosis, Referral referral, int doctorId, int patientId) {
        this.date = date;
        this.familyDoctor = familyDoctor;
        this.diagnosis = diagnosis;
        this.referral = referral;
        this.doctorId = doctorId;
        this.patientId = patientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public FamilyDoctor getFamilyDoctor() {
        return familyDoctor;
    }

    public void setFamilyDoctor(FamilyDoctor familyDoctor) {
        this.familyDoctor = familyDoctor;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Referral getReferral() {
        return referral;
    }

    public void setReferral(Referral referral) {
        this.referral = referral;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
