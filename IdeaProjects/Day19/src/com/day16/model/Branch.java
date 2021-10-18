package com.day16.model;

public class Branch extends College{
    String bName;
    int bId;



    public Branch(String name, int id, String place, String bName, int bId) {
        super(name, id, place);
        this.bName = bName;
        this.bId = bId;
    }
    public void displayBFeatures(){
        displayCFeatures();
        System.out.println("The Branch name is " +bName);
        System.out.println("The Id name is " +bId);
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }
}
