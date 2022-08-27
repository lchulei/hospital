package com.solvd.laba.hospital;

import com.solvd.laba.hospital.enums.Diagnosis;
import com.solvd.laba.hospital.enums.MedicineCategories;
import com.solvd.laba.hospital.exceptions.IdException;
import com.solvd.laba.hospital.exceptions.PhoneNumberException;
import com.solvd.laba.hospital.medicalItems.inventory.Inventory;
import com.solvd.laba.hospital.medicalItems.medicine.Medicine;
import com.solvd.laba.hospital.people.employee.*;
import com.solvd.laba.hospital.rooms.Room;
import org.apache.commons.lang3.RandomUtils;
import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static Diagnosis randomDiagnosis() {
        List<Diagnosis> diagnosisList = Arrays.asList(Diagnosis.values());
        int index = RandomUtils.nextInt(0, diagnosisList.size());
        return diagnosisList.get(index);
    }

    public static void main(String[] args) throws IdException {
        //Creating inventory
        List<Inventory> hospitalInventory = new ArrayList<>();
        hospitalInventory.add(new Inventory(1, "Cot", "Bed for patients"));
        hospitalInventory.add(new Inventory(2, "Bed", "Bed for employees"));
        hospitalInventory.add(new Inventory(3, "Table", "Table for eating"));
        hospitalInventory.add(new Inventory(4, "Table", "Table for work"));
        hospitalInventory.add(new Inventory(5, "Chair", "Chair"));
        hospitalInventory.add(new Inventory(6, "Wardrobe", "Wardrobe for clothes"));
        hospitalInventory.add(new Inventory(7, "Wardrobe", "Wardrobe for medicine"));
        hospitalInventory.add(new Inventory(8, "Nightstand", "Nightstand"));
        hospitalInventory.add(new Inventory(9, "Computer", "Computer"));
        hospitalInventory.add(new Inventory(10, "TV", "TV"));
        hospitalInventory.add(new Inventory(11, "Table", "Surgeon table"));
        hospitalInventory.add(new Inventory(12, "Table", "Gynecologist table"));

        //Creating medicine
        List<Medicine> hospitalMedicine = new ArrayList<>();
        int randomDayOfYear = RandomUtils.nextInt(1, LocalDate.now().getDayOfYear() - 1);
        hospitalMedicine.add(new Medicine("Ibuprofen", LocalDate.ofYearDay(2022, randomDayOfYear),
                LocalDate.ofYearDay(2025, randomDayOfYear), "From headache and toothache", MedicineCategories.PAINKILLERS));
        hospitalMedicine.add(new Medicine("Nimesil", LocalDate.ofYearDay(2022, randomDayOfYear),
                LocalDate.ofYearDay(2024, randomDayOfYear), "From headache and toothache", MedicineCategories.ANTI_INFLAMMATORY));
        hospitalMedicine.add(new Medicine("Citrin", LocalDate.ofYearDay(2022, randomDayOfYear),
                LocalDate.ofYearDay(2024, randomDayOfYear), "From headache and toothache", MedicineCategories.ANTI_ALLERGIC));
        hospitalMedicine.add(new Medicine("Amiksin", LocalDate.ofYearDay(2022, randomDayOfYear),
                LocalDate.ofYearDay(2024, randomDayOfYear), "From headache and toothache", MedicineCategories.ANTIVIRUS));
        hospitalMedicine.add(new Medicine("Metazon", LocalDate.ofYearDay(2022, randomDayOfYear),
                LocalDate.ofYearDay(2023, randomDayOfYear), "From headache and toothache", MedicineCategories.CARDIAC_DRUGS));
        hospitalMedicine.add(new Medicine("Valeriana", LocalDate.ofYearDay(2022, randomDayOfYear),
                LocalDate.ofYearDay(2024, randomDayOfYear), "From headache and toothache", MedicineCategories.SEDATIVES));
        hospitalMedicine.add(new Medicine("Omega-3", LocalDate.ofYearDay(2022, randomDayOfYear),
                LocalDate.ofYearDay(2025, randomDayOfYear), "From headache and toothache", MedicineCategories.BIOLOGICAL_SUPPLEMENTS));

        //Creating employees
        List<Employee> employeeList = new ArrayList<>();
        int doctorId = 1;
        try {
            Allergist allergist = new Allergist();
            allergist.generateEmployee();
            allergist.setDoctorId(doctorId++);
            employeeList.add(allergist);
            Anesthetist anesthetist = new Anesthetist();
            anesthetist.generateEmployee();
            anesthetist.setDoctorId(doctorId++);
            employeeList.add(anesthetist);
            Cardiologist cardiologist = new Cardiologist();
            cardiologist.generateEmployee();
            cardiologist.setDoctorId(doctorId++);
            employeeList.add(cardiologist);
            Endocrinologist endocrinologist = new Endocrinologist();
            endocrinologist.generateEmployee();
            endocrinologist.setDoctorId(doctorId++);
            employeeList.add(endocrinologist);
            FamilyDoctor familyDoctor = new FamilyDoctor();
            familyDoctor.generateEmployee();
            familyDoctor.setDoctorId(doctorId++);
            employeeList.add(familyDoctor);
            InfectiousDiseaseDoctor infectiousDiseaseDoctor = new InfectiousDiseaseDoctor();
            infectiousDiseaseDoctor.generateEmployee();
            infectiousDiseaseDoctor.setDoctorId(doctorId++);
            employeeList.add(infectiousDiseaseDoctor);
            Maid maid = new Maid();
            maid.generateEmployee();
            employeeList.add(maid);
            Nurse nurse = new Nurse();
            nurse.generateEmployee();
            nurse.setDoctorId(doctorId++);
            employeeList.add(nurse);
            ObstetricianGynecologist obstetricianGynecologist = new ObstetricianGynecologist();
            obstetricianGynecologist.generateEmployee();
            obstetricianGynecologist.setDoctorId(doctorId++);
            employeeList.add(obstetricianGynecologist);
            Otorhinolaryngologist otorhinolaryngologist = new Otorhinolaryngologist();
            otorhinolaryngologist.generateEmployee();
            otorhinolaryngologist.setDoctorId(doctorId++);
            employeeList.add(otorhinolaryngologist);
            Rheumatologist rheumatologist = new Rheumatologist();
            rheumatologist.generateEmployee();
            rheumatologist.setDoctorId(doctorId++);
            employeeList.add(rheumatologist);
            Surgeon surgeon = new Surgeon();
            surgeon.generateEmployee();
            surgeon.setDoctorId(doctorId++);
            employeeList.add(surgeon);
            Therapist therapist = new Therapist();
            therapist.generateEmployee();
            therapist.setDoctorId(doctorId);
            employeeList.add(therapist);
        } catch (PhoneNumberException e) {
            LOGGER.error(e);
            e.printStackTrace();
        }

        //Creating rooms
        List<Room> hospitalRooms = new ArrayList<>();
        int number = 1;
        //Creating offices


        //Creating ward


        //Creating other rooms

//        List<Employee> vasilii = employeeList.stream().filter(x -> x.getName().equals("Vasil")).collect(Collectors.toList());
//        vasilii.stream().forEach(LOGGER::info);
    }
}
