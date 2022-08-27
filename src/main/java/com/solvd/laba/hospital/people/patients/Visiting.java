package com.solvd.laba.hospital.people.patients;

import com.solvd.laba.hospital.enums.Diagnosis;
import com.solvd.laba.hospital.enums.Referral;

import java.time.LocalDate;

public class Visiting {
    private LocalDate date;
    private int idOfTheExaminingDoctor;
    private int patientId;
    private Diagnosis diagnosis;
    private Referral referral;
    private int idOfTheTreatsDoctor;
    private boolean isClosed;

    public Visiting() {

    }

    public Visiting(LocalDate date, int idOfTheExaminingDoctor, int patientId, Diagnosis diagnosis,
                    Referral referral, int idOfTheTreatsDoctor) {
        this.date = date;
        this.idOfTheExaminingDoctor = idOfTheExaminingDoctor;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.referral = referral;
        this.idOfTheTreatsDoctor = idOfTheTreatsDoctor;
        this.isClosed = false;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getIdOfTheExaminingDoctor() {
        return idOfTheExaminingDoctor;
    }

    public void setIdOfTheExaminingDoctor(int idOfTheExaminingDoctor) {
        this.idOfTheExaminingDoctor = idOfTheExaminingDoctor;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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

    public int getIdOfTheTreatsDoctor() {
        return idOfTheTreatsDoctor;
    }

    public void setIdOfTheTreatsDoctor(int idOfTheTreatsDoctor) {
        this.idOfTheTreatsDoctor = idOfTheTreatsDoctor;
    }

    public boolean getIsClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    @Override
    public String toString() {
        return "Visiting{" +
                "date=" + date +
                ", idOfTheExaminingDoctor=" + idOfTheExaminingDoctor +
                ", patientId=" + patientId +
                ", diagnosis=" + diagnosis +
                ", referral=" + referral +
                ", idOfTheTreatsDoctor=" + idOfTheTreatsDoctor +
                '}';
    }
}
