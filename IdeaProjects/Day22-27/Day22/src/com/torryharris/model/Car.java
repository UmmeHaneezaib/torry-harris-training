package com.torryharris.model;

import java.util.Comparator;
import java.util.Objects;

public class Car  {
    private int chassiNo;
    private String carName;
    private String fuelType;
    private Float power;

    public Car(int chassiNo, String carName, String fuelType, Float power) {
        this.chassiNo = chassiNo;
        this.carName = carName;
        this.fuelType = fuelType;
        this.power = power;
    }

    public int getChassiNo() {
        return chassiNo;
    }

    public void setChassiNo(int chassiNo) {
        this.chassiNo = chassiNo;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassiNo=" + chassiNo +
                ", carName='" + carName + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", power=" + power +
                '}';
    }

    public Float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carName.equals(car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
