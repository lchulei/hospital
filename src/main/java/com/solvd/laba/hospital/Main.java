package com.solvd.laba.hospital;

import com.solvd.laba.hospital.enums.Diagnosis;
import com.solvd.laba.hospital.people.employee.Employee;
import com.solvd.laba.hospital.people.patients.Patient;
import com.solvd.laba.hospital.exceptions.IdException;
import com.solvd.laba.hospital.people.employee.Allergist;
import org.apache.commons.lang3.RandomUtils;
import org.apache.log4j.Logger;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static Diagnosis randomDiagnosis() {
        List<Diagnosis> diagnosisList = Arrays.asList(Diagnosis.values());
        int index = RandomUtils.nextInt(0, diagnosisList.size());
        return diagnosisList.get(index);
    }

    public static void main(String[] args) throws IdException {
//        Allergist allergist = new Allergist();
//        allergist.setDoctorId(1);
//        Patient patient = new Patient();
//        patient.setPatientId(1);
//        patient.setName("Kia");
//        patient.setSurname("Rio");
//        allergist.examinePatient(patient);
//        patient.printAllVisitingHistory();
//        LOGGER.info("Info Text");
//        LOGGER.warn("Warn Text");
//        LOGGER.error("Error Text");
//        LOGGER.info("d123".replaceAll("\\d", "").length());
//        LOGGER.info("Diagnosis:" + " " + randomDiagnosis().getName());
//        Date date = new Date(RandomUtils.nextInt(1960, 2000), RandomUtils.nextInt(1, 13), RandomUtils.nextInt(0, 29));
//        LOGGER.info(date.getYear() + " " + date);
//        Allergist allergist1 = Allergist.generateEmployee();
//        LOGGER.info(allergist1.toString());
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Allergist.generateEmployee());
        employeeList.add(Allergist.generateEmployee());
        employeeList.add(Allergist.generateEmployee());
        Allergist allergist = new Allergist("Vasil", "Melnik", new Date(1970, 10, 22), "Men", "380667690984", "Main street 12", 21000, new Date(2019, 12,10), "380501025101");
        employeeList.add(allergist);

        List<Employee> vasilii = employeeList.stream().filter(x -> x.getName().equals("Vasil")).collect(Collectors.toList());
        vasilii.stream().forEach(LOGGER::info);
    }
}
