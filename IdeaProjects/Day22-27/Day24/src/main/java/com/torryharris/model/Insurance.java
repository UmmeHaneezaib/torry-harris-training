package com.torryharris.model;

public class Insurance {
    private String insName;
    private int insId;
    private int sum;
    private String insType;

    public Insurance() {
    }

    public Insurance(String insName, int insId, int sum, String insType) {
        this.insName = insName;
        this.insId = insId;
        this.sum = sum;
        this.insType = insType;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public int getInsId() {
        return insId;
    }

    public void setInsId(int insId) {
        this.insId = insId;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getInsType() {
        return insType;
    }

    public void setInsType(String insType) {
        this.insType = insType;
    }

    @Override
    public String toString() {
        return "insurance{" +
                "insName='" + insName + '\'' +
                ", insId=" + insId +
                ", sum=" + sum +
                ", insType='" + insType + '\'' +
                '}';
    }
}
