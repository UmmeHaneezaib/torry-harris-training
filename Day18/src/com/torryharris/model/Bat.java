package com.torryharris.model;

public class Bat implements Mammal,Bird{
    @Override
    public void fly() {
        System.out.println("Bat Flies in the Caves");
    }

    @Override
    public void feed() {
        System.out.println("Bat feeds its little Birdees");

    }

    @Override
    public void eat() {
        System.out.println("Bats eat insects/fruits");

    }
}
