package com.torryharris.files;

import com.torryharris.model.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Employee e1 = new Employee(1, "Han", "Ase", 25000.00f);
        Employee e2 = new Employee(2, "Far", "Doctor", 55000.00f);
        Employee e3 = new Employee(3, "Amair", "Business Man", 85000.00f);
        FileOutputStream fos = new FileOutputStream("Employees.txt");
        ObjectOutputStream employeeOutputStream = new ObjectOutputStream(fos);
        employeeOutputStream.writeObject(e1);
        employeeOutputStream.writeObject(e2);
        employeeOutputStream.writeObject(e3);
        employeeOutputStream.flush();
        employeeOutputStream.close();
        fos.close();

    }
}
