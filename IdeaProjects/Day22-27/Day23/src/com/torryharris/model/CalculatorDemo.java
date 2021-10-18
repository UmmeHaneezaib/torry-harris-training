package com.torryharris.model;

import com.torryharris.testing.SimpleCalculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println("2+3 = " +calculator.add(2, 3));
        System.out.println("5-3 = " +calculator.sub(5, 3));
        System.out.println("3+3 = " +calculator.mul(3, 3));
        System.out.println("12/3 = " +calculator.div(12, 3));
    }
}
