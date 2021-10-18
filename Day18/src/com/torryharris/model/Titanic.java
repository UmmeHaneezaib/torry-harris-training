package com.torryharris.model;

public class Titanic implements Boat{
    @Override
    public void floats() {
        System.out.println("Titanic floats on water");
    }

    @Override
    public void move() {
        System.out.println("Titanic moves in the direction of water");

    }
}
