package com.solvd.lava.hospital.people.patients;

import com.solvd.lava.hospital.Main;
import com.solvd.lava.hospital.people.Human;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient extends Human {
    private int patientId;
    private Date registrationDate;
    private List<Visiting> visitHistory = new ArrayList<>();

    private final static Logger LOGGER = LogManager.getLogger(Patient.class);

    public Patient() {

    }

    public Patient(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
                   int patientId, Date registrationDate, List<Visiting> visitHistory) {
        super(name, surname, birthday, sex, phoneNumber, address);
        this.patientId = patientId;
        this.registrationDate = registrationDate;
        this.visitHistory = visitHistory;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<Visiting> getVisitHistory() {
        return visitHistory;
    }

    public void setVisitHistory(List<Visiting> visitHistory) {
        this.visitHistory = visitHistory;
    }

    public void addNewVisiting(Visiting visit) {
        visitHistory.add(visit);
    }

    public void printAllVisitingHistory() {
        for(Visiting visiting : visitHistory) {
            LOGGER.info(visiting.toString());
        }
    }

    public Visiting getLastVisit() {
        return visitHistory.size() == 0? null:visitHistory.get(visitHistory.size() - 1);
    }
}
