package com.torryharris.collections;

import com.torryharris.model.Employee;

import java.util.HashMap;

public class EmployeeHashMap {
    public static void main(String[] args) {
        HashMap<Employee, Integer> employeeHashMap = new HashMap<>();
        Employee e1 = new Employee(59,"han", "Manager");
        Employee e2 = new Employee(60,"Zain", "Hr");
        Employee e3 = new Employee(70,"Sam", "Ase");
        Employee e4 = new Employee(80,"Tas", "BU Head");
        employeeHashMap.put(e1, e1.geteID());
        employeeHashMap.put( e2, e2.geteID());
        employeeHashMap.put(e3, e3.geteID());
        employeeHashMap.put(e4, e4.geteID());
        for( Object EId : employeeHashMap.keySet())
            System.out.println(EId + ":" + employeeHashMap.get(EId));
    }
}
