package com.torryharris.driver;

import com.torryharris.model.Rectangle;
import com.torryharris.model.Shape;
import com.torryharris.model.Triangle;
import jdk.nashorn.internal.objects.NativeString;

import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Triangle(20,30);
        shape.area();
        shape = new Rectangle(20,30);
        shape.area();



    }
}
