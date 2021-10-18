package com.torryharris.model;

public class Leader extends  Employee{
    int teamSize;


    public Leader(String name, int employeeId, String designation, float salary, int teamSize) {
        super(name, employeeId, designation, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Leader{" + super.toString()+
                "teamSize=" + teamSize +
                '}';
    }

    public void arrangesStandUpCall(){
        System.out.println("The leader arranges Stand up call");
    }
}
