package com.torryharris.collections;

import com.torryharris.model.Person;

import java.util.HashSet;
import java.util.TreeSet;

public class PersonHashSetDemo {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Han", "Ase", "Bengaluru");
        Person p2 = new Person(2, "Anu", "Fcc", "Chennai");
        Person p3 = new Person(2, "Anu", "Acc", "Goa");
        Person p4 = new Person(3, "Abs", "Ase", "Manali");
        HashSet<Person> pHashset = new HashSet<>();
        pHashset.add(p1);
        pHashset.add(p2);
        pHashset.add(p3);
        pHashset.add(p4);
        for (Person persons : pHashset)

            System.out.println(persons);
        System.out.println(p2.equals(p3));

    }

}