package com.solvd.laba.hospital.enums;

public enum MedicineCategories {
    ANTI_INFLAMMATORY("Anti-inflammatory"),
    PAINKILLERS("Painkillers"),
    ANTI_ALLERGIC("Anti-allergic"),
    ANTIVIRUS("Antivirus"),
    CARDIAC_DRUGS("Cardiac drugs"),
    SEDATIVES("Sedatives"),
    BIOLOGICAL_SUPPLEMENTS("Biological supplements");

    private String name;

    MedicineCategories(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
