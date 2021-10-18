package com.torryharris.driver;

import com.torryharris.comparotor.EmployeeNameComparator;
import com.torryharris.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(2,"Tas","Chef",50000);
        Employee e2 = new Employee(3,"Sam","Artist",30000);
        Employee e3 = new Employee(4,"Sum","CSA",60000);
        Employee e4 = new Employee(5,"Zainu","Data Master",79000);
        Employee e5 = new Employee(6,"Saim","Designer",45000);
        ArrayList<Employee> eList =new ArrayList<>();
        eList.add(e5);
        eList.add(e2);
        eList.add(e4);
        eList.add(e3);
        eList.add(e1);
        System.out.println("Before Sorting");
        Iterator<Employee> employeeIterator = eList.iterator();
        while (employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }

        System.out.println();

        System.out.println("After Sorting by Id");

        eList.sort(null);
        employeeIterator= eList.iterator();
        while (employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }
        System.out.println();
        System.out.println("After Sorting by Name");

        eList.sort(new EmployeeNameComparator());
        employeeIterator= eList.iterator();
        while (employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }

    }
}
