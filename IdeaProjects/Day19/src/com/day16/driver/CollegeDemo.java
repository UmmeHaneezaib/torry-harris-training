package com.day16.driver;

import com.day16.model.Branch;
import com.day16.model.College;
import com.day16.model.Student;

public class CollegeDemo {
    public static void main(String[] args) {

        Student han = new Student("Hkbk", 23, "Bengaluru", "Cse", 44, "Hanee", "1HK17IS086");
        han.displaySFeatures();
        Student riz = new Student("MountCarmel",24,"Goa","Commerce",46,"Riza","2mcu4545");
        riz.displaySFeatures();
    }
}
