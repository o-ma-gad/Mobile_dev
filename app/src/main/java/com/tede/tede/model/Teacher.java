package com.tede.tede.model;

public class Teacher {

    int id;
    float rating;
    String fullName;
    public Teacher(int id, float rating, String fullName) {
        this.id = id;
        this.rating = rating;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return (int) rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
