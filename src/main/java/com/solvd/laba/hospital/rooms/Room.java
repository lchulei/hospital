package com.solvd.laba.hospital.rooms;

import com.solvd.laba.hospital.medicalItems.inventory.Inventory;
import com.solvd.laba.hospital.enums.RoomType;

import java.util.List;

public class Room {
    private int number;
    private String name;
    private List<Inventory> inventoryList;
    private RoomType type;
    private boolean isRoomCleaned;

    public Room() {

    }

    public Room(int number, String name, List<Inventory> inventoryList, RoomType type, boolean isRoomCleaned) {
        this.number = number;
        this.name = name;
        this.inventoryList = inventoryList;
        this.type = type;
        this.isRoomCleaned = isRoomCleaned;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return  number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return  name;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    public List<Inventory> getInventoryList() {
        return  inventoryList;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public RoomType getType() {
        return  type;
    }

    public boolean getIsRoomCleaned() {
        return isRoomCleaned;
    }

    public void setRoomCleaned(boolean roomCleaned) {
        isRoomCleaned = roomCleaned;
    }
}
