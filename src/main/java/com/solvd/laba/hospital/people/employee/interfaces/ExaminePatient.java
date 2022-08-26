package com.solvd.laba.hospital.people.employee.interfaces;

import com.solvd.laba.hospital.enums.Diagnosis;
import com.solvd.laba.hospital.people.patients.Patient;

public interface ExaminePatient {
    void examinePatient(Patient patient);

    void makeADiagnosis(Patient patient, Diagnosis diagnosis);
}