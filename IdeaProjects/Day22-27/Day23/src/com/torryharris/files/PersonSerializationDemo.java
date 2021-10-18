package com.torryharris.files;

import com.torryharris.model.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSerializationDemo {
    public static void main(String[] args) throws IOException,ClassCastException {
        Person p1 = new Person(1, "Han", "Bengaluru", "Employee");
        Person p2 = new Person(3, "Sammy", "Bengaluru", "Writer");
        Person p3 = new Person(2, "Aish", "Hassan", "Talented");
        Person p4 = new Person(4, "Riz", "Bengaluru", "Artist");
        FileOutputStream fos = new FileOutputStream("person.txt");
        ObjectOutputStream poutputStream = new ObjectOutputStream(fos);
        poutputStream.writeObject(p1);
        poutputStream.writeObject(p2);
        poutputStream.writeObject(p3);
        poutputStream.writeObject(p4);
        poutputStream.flush();
        poutputStream.close();
        fos.close();
    }
}