package com.solvd.lava.hospital.medicalItems.inventory;

public class Inventory {
    private int id;
    private String name;
    private String appointment;

    public Inventory() {

    }

    public Inventory(int id, String name, String appointment) {
        this.id = id;
        this.name = name;
        this.appointment = appointment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return  name;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getAppointment() {
        return  appointment;
    }


}
