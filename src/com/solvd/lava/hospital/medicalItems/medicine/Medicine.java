package com.solvd.lava.hospital.medicalItems.medicine;

import java.util.Date;

public class Medicine {
    private String name;
    private Date dateOfManufacture;
    private Date takeTo;
    private String categories;
    private String appointment;

    public Medicine() {

    }

    public Medicine(String name, Date dateOfManufacture, Date takeTo, String appointment, String categories) {
        this.name = name;
        this.dateOfManufacture = dateOfManufacture;
        this.takeTo = takeTo;
        this.categories = categories;
        this.appointment = appointment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return  name;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Date getDateOfManufacture() {
        return  dateOfManufacture;
    }

    public void setTakeTo(Date takeTo) {
        this.takeTo = takeTo;
    }

    public Date getTakeTo() {
        return  takeTo;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getCategories() {
        return categories;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getAppointment() {
        return  appointment;
    }


}
