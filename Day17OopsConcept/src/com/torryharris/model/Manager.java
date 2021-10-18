package com.torryharris.model;

import sun.java2d.windows.GDIWindowSurfaceData;

public class Manager extends Employee{
    String projectName;
    int noOfTeams;



    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getNoOfTeams() {
        return noOfTeams;
    }

    public void setNoOfTeams(int noOfTeams) {
        this.noOfTeams = noOfTeams;
    }

    public Manager(String name, int employeeId, String designation, float salary, String projectName, int noOfTeams) {
        super(name, employeeId, designation, salary);
        this.projectName = projectName;
        this.noOfTeams = noOfTeams;

    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                ",projectName='" + projectName + '\'' +
                ", noOfTeams=" + noOfTeams +
                '}';
    }

    public void callMeeting() {
        System.out.println("The manager calls Meeting");
    }
}
