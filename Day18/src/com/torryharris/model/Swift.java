package com.torryharris.model;

public class Swift implements Car{
    @Override
    public void changeGear() {
        System.out.println("Change the gear to 4");
    }

    @Override
    public void move() {
        System.out.println("It moves on Road");
    }
}
