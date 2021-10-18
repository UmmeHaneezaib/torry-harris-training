package com.torryharris.driver;

import com.torryharris.exception.ClLimitExceededException;
import com.torryharris.exception.InvalidClRequestException;
import com.torryharris.model.Employee;
import com.torryharris.model.HrDept;

public class Company {
    public static void main(String[] args) throws InvalidClRequestException, ClLimitExceededException {
        Employee emp = new Employee(2, "hanee", "ASE", 23000);
        HrDept hr = new HrDept();

        try {
            hr.requestCl(emp,6);
        }
        catch (InvalidClRequestException ex){
            System.err.println(ex);
        }
        catch (ClLimitExceededException ex){
            System.err.println(ex);
        }
    }
}