package com.torryharris.driver;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Wrapper1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String i1 = sc.next();
        String f1 = sc.next();
        int num = Integer.parseInt(i1);
        float num1 = Float.parseFloat(f1);
        System.out.println("The Multiplied int value is" +num*2);
        System.out.println("The multiplied float value is" +num1*2);
    }
}