package com.torryharris.model;

public class Peacock implements Bird{
    @Override
    public void fly() {
        System.out.println("Peacock takes Short flights");
    }

    @Override
    public void eat() {
        System.out.println("Peacock eats small Reptiles");

    }
}
