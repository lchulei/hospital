package com.solvd.laba.hospital.medicalItems.medicine;

import com.solvd.laba.hospital.enums.MedicineCategories;

import java.time.LocalDate;

public class Medicine {
    private String name;
    private LocalDate dateOfManufacture;
    private LocalDate takeTo;
    private MedicineCategories categories;
    private String appointment;

    public Medicine() {

    }

    public Medicine(String name, LocalDate dateOfManufacture, LocalDate takeTo, String appointment, MedicineCategories categories) {
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

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public LocalDate getDateOfManufacture() {
        return  dateOfManufacture;
    }

    public void setTakeTo(LocalDate takeTo) {
        this.takeTo = takeTo;
    }

    public LocalDate getTakeTo() {
        return  takeTo;
    }

    public void setCategories(MedicineCategories categories) {
        this.categories = categories;
    }

    public MedicineCategories getCategories() {
        return categories;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getAppointment() {
        return  appointment;
    }


}
