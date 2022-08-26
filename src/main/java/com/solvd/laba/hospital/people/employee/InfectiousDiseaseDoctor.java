package com.solvd.laba.hospital.people.employee;

import com.solvd.laba.hospital.enums.Diagnosis;
import com.solvd.laba.hospital.people.patients.Patient;
import com.solvd.laba.hospital.exceptions.IdException;
import com.solvd.laba.hospital.people.employee.interfaces.ExaminePatient;
import org.apache.log4j.Logger;

import java.util.Date;

public class InfectiousDiseaseDoctor extends Employee implements ExaminePatient {
    private int doctorId;

    private static final Logger LOGGER = Logger.getLogger(InfectiousDiseaseDoctor.class);

    public InfectiousDiseaseDoctor() {

    }

    public InfectiousDiseaseDoctor(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
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

    @Override
    public void examinePatient(Patient patient) {
        LOGGER.info("Patient " + patient.getName() + " " + patient.getSurname() + " examine:");
    }

    @Override
    public void makeADiagnosis(Patient patient, Diagnosis diagnosis) {

    }

}
