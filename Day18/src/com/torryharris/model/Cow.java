package com.torryharris.model;

public class Cow implements Mammal{
    @Override
    public void feed() {
        System.out.println("The cow feeds its calf");
    }

    @Override
    public void eat() {
        System.out.println("Cow eats grass");
    }
}
