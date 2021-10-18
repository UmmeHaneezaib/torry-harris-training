package com.torryharris.driver;

import com.torryharris.model.Clerk;
import com.torryharris.model.Employee;
import com.torryharris.model.Leader;
import com.torryharris.model.Manager;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("han", 23, "ASE", 4300.00f);

        Manager m1 =new Manager("han",23,"ASE",23.00f,"Website",2);
        Leader l1 = new Leader("han",54,"Test",44.00f,23);
        Clerk c1 = new Clerk("Riz",66,"Pw",23.0f,"BCA");
        System.out.println(e1);
        System.out.println(m1);
        System.out.println(l1);
        System.out.println(c1);
        m1.callMeeting();
        l1.arrangesStandUpCall();
        c1.generatePayroll();
    }



}
