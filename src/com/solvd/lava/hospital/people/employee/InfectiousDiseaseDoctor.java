package com.solvd.lava.hospital.people.employee;

import com.solvd.lava.hospital.enums.Diagnosis;
import com.solvd.lava.hospital.people.employee.interfaces.InteractWithPatient;
import com.solvd.lava.hospital.people.patients.Patient;
import com.solvd.lava.hospital.people.patients.Visiting;

import java.util.Date;

public class InfectiousDiseaseDoctor extends Employee implements InteractWithPatient {
    private int doctorId;

    public InfectiousDiseaseDoctor() {

    }

    public InfectiousDiseaseDoctor(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
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
        int probabilityOfDisease = (int) (Math.random() * 11);
        Visiting visit = new Visiting();
        visit.setDate(new Date());
        visit.setPatientId(patient.getPatientId());
        visit.setDoctorId(doctorId);
        switch (probabilityOfDisease) {
            case 5:
                visit.setDiagnosis(Diagnosis.SMALLPOX);
                break;
            case 6:
                visit.setDiagnosis(Diagnosis.HEPATITIS);
                break;
            case 7:
                visit.setDiagnosis(Diagnosis.MEASLES);
            default:
                visit.setDiagnosis(Diagnosis.NOTHING_WAS_FOUND);
        }
        System.out.println("Patient " + patient.getName() + " " + patient.getSurname() + " examine:");
        System.out.println("Diagnosis: " + visit.getDiagnosis().getName());
        patient.addNewVisiting(visit);
    }

    @Override
    public void writeAReferral(Patient patient) {

    }

    @Override
    public void writeAPrescription(Patient patient) {

    }
}
