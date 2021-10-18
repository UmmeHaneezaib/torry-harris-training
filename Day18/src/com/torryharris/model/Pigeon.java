package com.torryharris.model;

public class Pigeon implements Bird{
    @Override
    public void fly() {
        System.out.println("Pigeon flies higher");
    }

    @Override
    public void eat() {
        System.out.println("Pigeon eats mustard seeds");
    }
}
