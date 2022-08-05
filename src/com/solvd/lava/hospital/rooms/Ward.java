package com.solvd.lava.hospital.rooms;

import com.solvd.lava.hospital.enums.RoomType;
import com.solvd.lava.hospital.medicalItems.inventory.Inventory;
import com.solvd.lava.hospital.people.patients.Patient;

import java.util.List;

public class Ward extends Room {
    private int numberOfBeds;
    private List<Patient> patientList;

    public Ward() {

    }

    public Ward(int number, String name, List<Inventory> inventoryList, RoomType type, boolean isRoomCleaned,
                int numberOfBeds, List<Patient> patientList) {
        super(number, name, inventoryList, type, isRoomCleaned);
        this.numberOfBeds = numberOfBeds;
        this.patientList = patientList;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}
