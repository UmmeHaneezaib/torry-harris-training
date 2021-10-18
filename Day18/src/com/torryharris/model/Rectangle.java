package com.torryharris.model;

public class Rectangle extends Shape{
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
        setNoOfSides(4);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("The area of a Rectangle is:"+(length*height));

    }
}
