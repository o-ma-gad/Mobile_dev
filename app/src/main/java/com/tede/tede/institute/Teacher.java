package com.tede.tede.institute;

public class Teacher {
    private int id;
    private String fullName;

    public Teacher(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
