package com.solvd.lava.hospital;

import com.solvd.lava.hospital.enums.Diagnosis;
import com.solvd.lava.hospital.people.employee.Allergist;
import com.solvd.lava.hospital.people.patients.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Allergist allergist = new Allergist();
        allergist.setDoctorId(1);
        Patient patient = new Patient();
        patient.setPatientId(1);
        patient.setName("Kia");
        patient.setSurname("Rio");
        allergist.examinePatient(patient);
        patient.printAllVisitingHistory();
        LOGGER.info("Info Text");
        LOGGER.warn("Warn Text");
        LOGGER.error("Error Text");
    }
}
