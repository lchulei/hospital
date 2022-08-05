package com.solvd.lava.hospital.enums;

public enum RoomType {
    REGISTRY("Registry"),
    DEPARTMENT_OF_SURGERY("Department of surgery"),
    THERAPEUTIC_DEPARTMENT("Therapeutic department"),
    GYNECOLOGICAL_DEPARTMENT("Gynecological department"),
    INFECTIOUS_DEPARTMENT("Infectious department"),
    CARDIOLOGY_DEPARTMENT("Cardiology department"),
    OTORHINOLARYNGOLOGY_DEPARTMENT("Otorhinolaryngology department");

    private String name;

    RoomType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
