package com.torryharris.model;

public class SaudiAirlines implements Airplane{
    @Override
    public void fly() {
        System.out.println("SaudiAirlines Flies in Air");
    }

    @Override
    public void move() {
        System.out.println("SaudiAirlines moves in Sky");
    }
}
