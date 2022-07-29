package com.solvd.lava.hospital.people.patients;

import com.solvd.lava.hospital.people.Human;

import java.util.List;

public class Patient extends Human {
    private String patientId;
    private String registrationDate;
    private List<Diagnosis> visitHistory;
}
