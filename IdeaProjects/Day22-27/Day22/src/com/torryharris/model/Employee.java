package com.torryharris.model;

public class Employee {
    private int eID;
    private String name;
    private String Desgn;

    public int geteID() {
        return eID;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public String getName() {
        return name;
    }

    public Employee(int eID, String name, String desgn) {
        this.eID = eID;
        this.name = name;
        Desgn = desgn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesgn() {
        return Desgn;
    }

    public void setDesgn(String desgn) {
        Desgn = desgn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eID=" + eID +
                ", name='" + name + '\'' +
                ", Desgn='" + Desgn + '\'' +
                '}';
    }
}

