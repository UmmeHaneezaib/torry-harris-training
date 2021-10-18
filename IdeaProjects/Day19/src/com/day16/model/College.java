package com.day16.model;

public class College {
    String name;
    int id;

    public College() {
    }

    String place;
    public void displayCFeatures(){
        System.out.println("The College Name is "+name );
        System.out.println("The College id is "+id );
        System.out.println("The College place is "+place );
    }

    public College(String name, int id, String place) {
        this.name = name;
        this.id = id;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
