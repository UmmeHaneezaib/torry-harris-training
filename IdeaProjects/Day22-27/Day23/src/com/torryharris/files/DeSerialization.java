package com.torryharris.files;

import com.torryharris.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Employees.txt");
        ObjectInputStream employeeInputStream = new ObjectInputStream(fis);
        ArrayList<Employee> employeeAL = new ArrayList<>();
        Employee employee;
        System.out.println("Employee Details from the file are:");
        try {
            while (true) {
                employee = (Employee) employeeInputStream.readObject();
                employeeAL.add(employee);
            }

        }
        catch (EOFException ex){}
        System.out.println("Employee Details are...");
        for (Employee emp:employeeAL)
            System.out.println(emp);


    }
}
