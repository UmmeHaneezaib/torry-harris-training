package com.torryharris.model;

public class Employee {
    String name;
    int employeeId;
    String designation;
    float salary;

    public Employee() {
    }

    public Employee(String name, int employeeId, String designation, float salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", designation='" + designation + '\'' +
                ", salary=" + salary ;

    }
}

