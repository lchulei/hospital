package com.solvd.laba.hospital.people.employee;

import com.solvd.laba.hospital.exceptions.PhoneNumberException;
import com.solvd.laba.hospital.people.Human;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Employee extends Human {
    private float salary;
    private LocalDate gettingStarted;
    private String workPhoneNumber;
    private int officeNumber;

    public Employee() {

    }

    public Employee(String name, String surname, LocalDate birthday, String sex, String phoneNumber, String address,
                    float salary, LocalDate gettingStarted, String workPhoneNumber) {
        super(name, surname, birthday, sex, phoneNumber, address);
        this.salary = salary;
        this.gettingStarted = gettingStarted;
        this.workPhoneNumber = workPhoneNumber;
    }

    public void generateEmployee () throws PhoneNumberException {
        ArrayList<String> surnames = new ArrayList<>(Arrays.asList("Melnichuk ", "Snihur ", "Dobinda ", "Kovalenko ",
                "Makaranyk ", "Goluk ", "Zaharchyk ", "Moroz ", "Katsap "));
        ArrayList<String> names = new ArrayList<>(Arrays.asList( "Artem", "Maxim", "Oleg", "Ivan",
                "Vasil", "Oksana", "Svetlana", "Inna", "Anna"));
        ArrayList<String> numberStart = new ArrayList<>(Arrays.asList("066", "050", "095", "067", "096", "097", "098"));
        int randomInt = RandomUtils.nextInt(0, 9);
        this.setName(names.get(randomInt));
        this.setSurname(surnames.get(RandomUtils.nextInt(0, 9)));
        this.setBirthday(LocalDate.ofYearDay(RandomUtils.nextInt(1960, 2000), RandomUtils.nextInt(1, 365)));
        this.gettingStarted = LocalDate.ofYearDay(RandomUtils.nextInt(2018, 2021), RandomUtils.nextInt(1, 365));
        this.setPhoneNumber("38" + numberStart.get(RandomUtils.nextInt(0, 7)) + RandomStringUtils.randomNumeric(7));
        this.setAddress(RandomStringUtils.randomAlphabetic(5, 10));
        this.setSex(randomInt > 4?"Woman":"Men");
        this.salary = RandomUtils.nextInt(10, 25) * 1000;
        this.workPhoneNumber = "38" + numberStart.get(RandomUtils.nextInt(0, 7)) + RandomStringUtils.randomNumeric(7);
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return  salary;
    }

    public void setGettingStarted(LocalDate gettingStarted) {
        this.gettingStarted = gettingStarted;
    }

    public LocalDate getGettingStarted() {
        return  gettingStarted;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) throws PhoneNumberException {
        if((workPhoneNumber.length() < 10 || workPhoneNumber.length() > 12) && workPhoneNumber.replaceAll("\\d", "").length() != 0) {
            throw new PhoneNumberException("Invalid number");
        } else {
            this.workPhoneNumber = workPhoneNumber;
        }
    }

    public String getWorkPhoneNumber() {
        return  workPhoneNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public int getOfficeNumber() {
        return  officeNumber;
    }

}
