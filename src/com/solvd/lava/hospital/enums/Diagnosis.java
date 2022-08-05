package com.solvd.lava.hospital.enums;

public enum Diagnosis {
    ALLERGY("Allergy"),
    ARTHRITIS("Arthritis"),
    ASTHMA("Asthma"),
    BRONCHITIS("Bronchitis"),
    STOMACH_ULCER("Stomach ulcer"),
    SMALLPOX("Smallpox"),
    SINUSITIS("Sinusitis"),
    HEPATITIS("Hepatitis"),
    FLU("Flu"), //terapevt
    DIABETES("Diabetes"),
    COLD("Cold"),
    STROKE("Stroke"),
    INFARCT("Infarct"),
    MEASLES("Measles"),
    OTITIS("Otitis"),
    POISONING("Poisoning"),
    OSTEOCHONDROSIS("Osteochondrosis"),
    CYSTITIS("Cystitis");

    private String name;

    Diagnosis(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
