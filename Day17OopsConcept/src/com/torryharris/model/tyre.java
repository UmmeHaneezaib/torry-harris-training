package com.torryharris.model;

public class tyre {
     String name;
     int size;

    public tyre(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String tname) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

