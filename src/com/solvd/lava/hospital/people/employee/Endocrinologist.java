package com.solvd.lava.hospital.people.employee;

import com.solvd.lava.hospital.Main;
import com.solvd.lava.hospital.enums.Diagnosis;
import com.solvd.lava.hospital.people.employee.interfaces.InteractWithPatient;
import com.solvd.lava.hospital.people.patients.Patient;
import com.solvd.lava.hospital.people.patients.Visiting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public class Endocrinologist extends Employee implements InteractWithPatient {
    private int doctorId;

    private final static Logger LOGGER = LogManager.getLogger(Endocrinologist.class);

    public Endocrinologist() {

    }

    public Endocrinologist(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
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
                visit.setDiagnosis(Diagnosis.DIABETES);
                break;
            default:
                visit.setDiagnosis(Diagnosis.NOTHING_WAS_FOUND);
        }
        LOGGER.info("Patient " + patient.getName() + " " + patient.getSurname() + " examine:");
        LOGGER.info("Diagnosis: " + visit.getDiagnosis().getName());
        patient.addNewVisiting(visit);
    }

    @Override
    public void writeAReferral(Patient patient) {

    }

    @Override
    public void writeAPrescription(Patient patient) {

    }
}
