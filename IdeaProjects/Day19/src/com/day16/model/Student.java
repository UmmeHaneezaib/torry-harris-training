package com.day16.model;

public class Student extends Branch{
    String stuName;
    String usn;
    public void displaySFeatures(){
        displayBFeatures();
        System.out.println("The student name is " +stuName);
        System.out.println("The Student usn is " +usn);
        System.out.println();
    }

    public Student(String name, int id, String place, String bName, int bId, String stuName, String usn) {
        super(name, id, place, bName, bId);
        this.stuName = stuName;
        this.usn = usn;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }



}
