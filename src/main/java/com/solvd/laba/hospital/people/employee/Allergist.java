package com.solvd.laba.hospital.people.employee;

import com.solvd.laba.hospital.enums.Diagnosis;
import com.solvd.laba.hospital.people.patients.Patient;
import com.solvd.laba.hospital.exceptions.IdException;
import com.solvd.laba.hospital.people.employee.interfaces.ExaminePatient;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Allergist extends Employee implements ExaminePatient {
    private int doctorId;

    private static final Logger LOGGER = Logger.getLogger(Allergist.class);

    public Allergist() {

    }

    public Allergist(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
                       float salary, Date gettingStarted, String workPhoneNumber) {
        super(name, surname, birthday, sex, phoneNumber, address, salary, gettingStarted, workPhoneNumber);
    }

    public void setDoctorId(int doctorId) throws IdException {
        if(doctorId <= 0) {
            throw new IdException("Id can`t be less than or equal to 0");
        } else {
            this.doctorId = doctorId;
        }
    }

    public int getDoctorId() {
        return  doctorId;
    }

    public static Allergist generateEmployee () {
        ArrayList<String> surnames = new ArrayList<>(Arrays.asList("Melnichuk ", "Snihur ", "Dobinda ", "Kovalenko ",
                "Makaranyk ", "Goluk ", "Zaharchyk ", "Moroz ", "Katsap "));
        ArrayList<String> names = new ArrayList<>(Arrays.asList( "Artem", "Maxim", "Oleg", "Ivan",
                "Vasil", "Oksana", "Svetlana", "Inna", "Anna"));
        ArrayList<String> numberStart = new ArrayList<>(Arrays.asList("066", "050", "095", "067", "096", "097", "098"));
        int randomInt = RandomUtils.nextInt(0, 9);
        String name = names.get(randomInt);
        String surname = surnames.get(RandomUtils.nextInt(0, 9));
        Date birthday = new Date(RandomUtils.nextInt(1960, 2000), RandomUtils.nextInt(1, 13), RandomUtils.nextInt(0, 29));
        Date gettingStarted = new Date(RandomUtils.nextInt(2018, 2021), RandomUtils.nextInt(1, 13), RandomUtils.nextInt(0, 29));
        String phoneNumber = "38" + numberStart.get(RandomUtils.nextInt(0, 7)) + RandomStringUtils.randomNumeric(7);
        String address = RandomStringUtils.randomAlphabetic(5, 10);
        String sex = randomInt > 4?"Woman":"Men";
        float salary = RandomUtils.nextInt(10, 25) * 1000;
        String workPhoneNumber = "38" + numberStart.get(RandomUtils.nextInt(0, 7)) + RandomStringUtils.randomNumeric(7);
        return new Allergist(name, surname, birthday, sex, phoneNumber, address, salary, gettingStarted, workPhoneNumber);
    }


    @Override
    public void examinePatient(Patient patient) {
        LOGGER.info("Patient " + patient.getName() + " " + patient.getSurname() + " examine");
    }

    @Override
    public void makeADiagnosis(Patient patient, Diagnosis diagnosis) {

    }

    @Override
    public String toString() {
        return "Allergist{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", sex='" + getSex() + '\'' +
                ", birthday=" + getBirthday() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", workPhoneNumber='" + getWorkPhoneNumber() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", salary=" + getSalary() +
                ", gettingStarted=" + getGettingStarted() +
                ", doctorId=" + doctorId +
                '}';
    }
}
