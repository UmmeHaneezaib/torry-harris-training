package com.torryharris.files;

import com.torryharris.model.Employee;
import com.torryharris.model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class PDeserializationDemo {
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassCastException {
        FileInputStream fis = new FileInputStream("person.txt");
        ObjectInputStream pInputStream = new ObjectInputStream(fis);
        TreeMap<Integer,Person> personTreeMap = new TreeMap<>();
        Person person;
        System.out.println("Person Details from the file are:");
        try {
            while (true) {
                person = (Person) pInputStream.readObject();
                personTreeMap.put(person.getpId(), person);
            }

        }
        catch (EOFException | ClassNotFoundException ex){}
        System.out.println("Person Details are...");
        for (Object key: personTreeMap.keySet()) {
            System.out.println(key + " : " +personTreeMap.get(key));
        }
    }
}
