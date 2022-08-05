package com.solvd.lava.hospital.rooms;

import com.solvd.lava.hospital.enums.RoomType;
import com.solvd.lava.hospital.medicalItems.inventory.Inventory;
import com.solvd.lava.hospital.medicalItems.medicine.Medicine;
import com.solvd.lava.hospital.people.employee.Employee;

import java.util.List;

public class Office extends Room {
    private List<Employee> employees;
    private List<Medicine> medicineList;

    public Office() {

    }

    public Office(int number, String name, List<Inventory> inventoryList, RoomType type, boolean isRoomCleaned,
                  List<Employee> employees, List<Medicine> medicineList) {
        super(number, name, inventoryList, type, isRoomCleaned);
        this.employees = employees;
        this.medicineList = medicineList;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(List<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
}
