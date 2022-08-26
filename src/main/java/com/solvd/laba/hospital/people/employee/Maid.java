package com.solvd.laba.hospital.people.employee;

import com.solvd.laba.hospital.medicalItems.inventory.Inventory;
import com.solvd.laba.hospital.rooms.Room;

import java.util.Date;
import java.util.List;

public class Maid extends Employee {
    private List<Inventory> fixedInventory;
    private List<Room> fixedRoomNumbers;

    public Maid() {
    }

    public Maid(String name, String surname, Date birthday, String sex, String phoneNumber, String address,
                float salary, Date gettingStarted, String workPhoneNumber,
                List<Inventory> fixedInventory, List<Room> fixedRoomNumbers) {
        super(name, surname, birthday, sex, phoneNumber, address, salary, gettingStarted, workPhoneNumber);
        this.fixedInventory = fixedInventory;
        this.fixedRoomNumbers = fixedRoomNumbers;
    }

    public void setFixedInventory(List<Inventory> fixedInventory) {
        this.fixedInventory = fixedInventory;
    }

    public List<Inventory> getFixedInventory() {
        return fixedInventory;
    }

    public void setFixedRoomNumbers(List<Room> fixedRoomNumbers) {
        this.fixedRoomNumbers = fixedRoomNumbers;
    }

    public List<Room> getFixedRoomNumbers() {
        return fixedRoomNumbers;
    }

    public void cleanTheRoom(Room room) {
        if(!room.getIsRoomCleaned()) {
            room.setRoomCleaned(true);
        }
    }
}
