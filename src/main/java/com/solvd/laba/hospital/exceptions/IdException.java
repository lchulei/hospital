package com.solvd.laba.hospital.exceptions;

import java.io.IOException;

public class IdException extends IOException {

    private int id;

    public IdException(String message) {

        super(message);

    }

    public IdException(String message, int id) {

        super(message);

        this.id = id;

    }

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

}