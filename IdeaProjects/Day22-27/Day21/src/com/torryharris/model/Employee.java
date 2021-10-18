package com.torryharris.model;

public class Employee  implements Comparable<Employee>{
    private int eId;
    private String eName;
    private String designation;
    private int salary;
    private int balanceCl;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBalanceCl() {
        return balanceCl;
    }

    public void setBalanceCl(int balanceCl) {
        this.balanceCl = balanceCl;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", balanceCl=" + balanceCl +
                '}';
    }

    public Employee(int eId, String eName, String designation, int salary) {
        this.eId = eId;
        this.eName = eName;
        this.designation = designation;
        this.salary = salary;
        balanceCl=12;


    }

    @Override
    public int compareTo(Employee o) {
        return this.eId - o.eId;
    }
}
