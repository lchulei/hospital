package com.solvd.laba.hospital.people.employee;

import com.solvd.laba.hospital.enums.Diagnosis;
import com.solvd.laba.hospital.exceptions.IdException;
import com.solvd.laba.hospital.people.employee.interfaces.ExaminePatient;
import com.solvd.laba.hospital.people.patients.Patient;
import org.apache.log4j.Logger;

import java.time.LocalDate;

public class Surgeon extends Employee implements ExaminePatient {
    private int doctorId;
    private int theNumberOfOperations;

    private static final Logger LOGGER = Logger.getLogger(Surgeon.class);

    public Surgeon() {

    }

    public Surgeon(String name, String surname, LocalDate birthday, String sex, String phoneNumber, String address,
                   float salary, LocalDate gettingStarted, String workPhoneNumber, int theNumberOfOperations) {
        super(name, surname, birthday, sex, phoneNumber, address, salary, gettingStarted, workPhoneNumber);
        this.theNumberOfOperations = theNumberOfOperations;
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

    public void setTheNumberOfOperations(int theNumberOfOperations) {
        this.theNumberOfOperations = theNumberOfOperations;
    }

    public int getTheNumberOfOperations() {
        return  theNumberOfOperations;
    }

    public void performAnOperation(Patient patient) {
        theNumberOfOperations++;
    }


    @Override
    public void examinePatient(Patient patient) {
        LOGGER.info("Patient " + patient.getName() + " " + patient.getSurname() + " examine:");
    }

    @Override
    public void makeADiagnosis(Patient patient, Diagnosis diagnosis) {

    }

    @Override
    public String toString() {
        return "Surgeon{" +
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
