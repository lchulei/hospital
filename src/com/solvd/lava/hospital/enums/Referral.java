package com.solvd.lava.hospital.enums;

public enum Referral {
    ADVICE("Advice"),
    EXAMINATION("Examination"),
    OPERATION("Operation"),
    TREATMENT("Treatment");

    private String name;

    Referral(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
