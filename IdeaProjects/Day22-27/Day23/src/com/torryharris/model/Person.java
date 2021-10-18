package com.torryharris.model;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long SerialVersionUID = 10l;
    private int pId;
    private String name;
    private String place;
    private String occupation;

    public Person() {
    }

    public Person(int pId, String name, String place, String occupation) {
        this.pId = pId;
        this.name = name;
        this.place = place;
        this.occupation = occupation;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pId=" + pId +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
