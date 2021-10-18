package com.torryharris.model;

public class Clerk extends Employee{
    String degree;



    public Clerk(String name, int employeeId, String designation, float salary, String degree) {
        super(name, employeeId, designation, salary);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }




    @Override
    public String toString() {
        return "Clerk{" + super.toString() +
                "degree='" + degree + '\'' +
                '}';
    }

    public void generatePayroll( ){
        System.out.println("Payroll Generates");
    }
}
