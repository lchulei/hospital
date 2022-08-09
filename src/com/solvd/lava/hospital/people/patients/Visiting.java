package com.solvd.lava.hospital.people.patients;

import com.solvd.lava.hospital.enums.Diagnosis;
import com.solvd.lava.hospital.enums.Referral;

import java.util.Date;

public class Visiting {
    private Date date;
    private Diagnosis diagnosis;
    private Referral referral;
    private int doctorId;
    private int patientId;

    public Visiting() {

    }

    public Visiting(Date date, Diagnosis diagnosis, Referral referral, int doctorId, int patientId) {
        this.date = date;
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

    @Override
    public String toString() {
        return "Visiting{" +
                "date=" + date +
                ", diagnosis=" + diagnosis +
                ", referral=" + referral +
                ", doctorId=" + doctorId +
                ", patientId=" + patientId +
                '}';
    }
}
