package com.torryharris.model;

public class HatchBack extends Car {
    String steeringType;

    public HatchBack(String name, String fuelType, int engineCapacity, int noOfGear, float power, tyre t1, MusicSystem ms1, String steeringType) {
        super(name, fuelType, engineCapacity, noOfGear, power, t1, ms1);
        this.steeringType = steeringType;
    }
    public void  displayHatchBackFeatures(){
        displayFeatures();
        System.out.println("Steering Type is" +steeringType);
        System.out.println();
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }
}
