package com.tede.tede.model;

import java.time.DateTimeException;

public class Teacher {

    int id;
    String lastName;
    String fullName;
    String img;
    DateTimeException createdAt;
    DateTimeException updatedAt;

    public Teacher(int id, String fullName/*, String img, DateTimeException createdAt, DateTimeException updatedAt*/) {
        this.id = id;
        this.fullName = fullName;
       /* this.img = img;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;*/
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
