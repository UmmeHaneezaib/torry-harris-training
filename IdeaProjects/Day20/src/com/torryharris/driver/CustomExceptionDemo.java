package com.torryharris.driver;

import com.torryharris.exception.InsufficientBalanceException;
import com.torryharris.exception.WithdrawnLimitExceededException;
import com.torryharris.model.Person;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Person han = new Person("hanee", 50000, 323232);

        try {
            han.withDrawnAmount(50000);
//            han.withDrawnAmount(30000);
//            han.withDrawnAmount(1000);
        } catch (InsufficientBalanceException | WithdrawnLimitExceededException ex) {
            System.err.println(ex);
        }
    }
}
