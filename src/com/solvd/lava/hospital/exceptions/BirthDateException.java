package com.solvd.lava.hospital.exceptions;

import java.io.IOException;
import java.util.Date;

public class BirthDateException extends IOException {

    private Date birthday;

    public BirthDateException(String message) {

        super(message);

    }

    public BirthDateException(String message, Date birthday) {

        super(message);

        this.birthday = birthday;

    }

    public Date getBirthday() {

        return birthday;

    }

    public void setBirthday(Date birthday) {

        this.birthday = birthday;

    }

}
