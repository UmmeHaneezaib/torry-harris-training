package com.torryharris.model;

public class Sedan extends Car{
    int bootSpace;


    public Sedan(String name, String fuelType, int engineCapacity, int noOfGear, float power, tyre t1, MusicSystem ms1, int bootSpace) {
        super(name, fuelType, engineCapacity, noOfGear, power, t1, ms1);
        this.bootSpace = bootSpace;
    }
    public void displaySedanFeatures(){
        displayFeatures();
        System.out.println("Bootspace :" +bootSpace);
        System.out.println();
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }
}
