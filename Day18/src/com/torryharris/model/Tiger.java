package com.torryharris.model;

public class Tiger implements Mammal {

    @Override
    public void feed() {
        System.out.println("Tiger feeds its cub");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eats Meat");
    }
}
