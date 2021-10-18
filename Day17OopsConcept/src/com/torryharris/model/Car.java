package com.torryharris.model;

public class Car {
    private String name, fuelType;
    private int engineCapacity, noOfGear;
    private float power;
    private tyre ty;
    private MusicSystem ms;


    public Car(String name, String fuelType, int engineCapacity, int noOfGear, float power, tyre t1, MusicSystem ms1) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.noOfGear = noOfGear;
        this.power = power;
        this.ty = ty;
        this.ms = ms;
    }

    public Car() {
    }

    public void setMs(MusicSystem ms) {
        this.ms = ms;
    }

    public MusicSystem getMs() {
        return ms;
    }

    public String getName() {
        return name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getNoOfGear() {
        return noOfGear;
    }

    public float getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setNoOfGear(int noOfGear) {
        this.noOfGear = noOfGear;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void accelarate() {
        System.out.println(name + "The car is speeding up");
    }

    public void applyBrake() {
        System.out.println(name + "The car has stopped");
    }

    public void changingGear(int gear) {
        if (gear > 5 || gear < 0)
            System.out.println("Wrong no of gears");
        else
            System.out.println("The gear is" + gear);
    }

    public tyre getTy() {
        return ty;
    }

    public void setTy(tyre ty) {
        this.ty = ty;
    }

    public Car(MusicSystem ms) {
        this.ms = ms;
    }

    public void steer() {
        System.out.println(name + "Car is Changing Directions");
    }
    public void displayFeatures( ){
        System.out.println("Features are");
        System.out.println("---------------------");
        System.out.println("Ec " +engineCapacity);
        System.out.println("Ft " +fuelType);
        System.out.println("P" +power);
        System.out.println("Nog " +noOfGear);
        System.out.println("TyreName-->" +ty+" "+"TyreSize-->" +ty.getSize());
        System.out.println("Name-->"+ms.getName()+" "+"LcdScreen-->"+ms.getLcdScreenSize()+" "+"No of Speakers-->"+ms.getNoOfSpeakers()+" "+"SubWoofer-->"+ms.getSubWoofer());

    }
}

