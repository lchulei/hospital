package com.solvd.lava.hospital.people.employee.interfaces;

import com.solvd.lava.hospital.people.patients.Patient;

public interface ExaminePatient {
    void examinePatient(Patient patient);
    void writeAReferral(Patient patient);
    void writeAPrescription(Patient patient);
}
