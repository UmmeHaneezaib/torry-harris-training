package com.torryharris.model;

public class Suv extends Car{
     String driveMode;
     boolean sunRoof;

    public Suv(String name, String fuelType, int engineCapacity, int noOfGear, float power, tyre t1, MusicSystem ms1, String driveMode, boolean sunRoof) {
        super(name, fuelType, engineCapacity, noOfGear, power, t1, ms1);
        this.driveMode = driveMode;
        this.sunRoof = sunRoof;
    }
    public void displaySuvFeatures() {
        displayFeatures();
        System.out.println("DriveMode :" + driveMode);
        System.out.println("Sun Roof" + sunRoof);
        System.out.println();
    }
    public String getDriveMode() {
        return driveMode;
    }

    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }
}
