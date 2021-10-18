package com.torryharris.driver;

import com.torryharris.model.Employee;
import com.torryharris.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PersonDemo {
    public static void main(String[] args) {


        Person han = new Person(234578783456l, "Hanee", "Karnataka", "Employee");
        Person riz = new Person(778813569807l, "Riza", "Goa", "Teacher");
        Person anu = new Person(123467894560l, "Annu", "TN", "Techie");
        Person sham = new Person(590990958909l, "Shammo", "Kerala", "Pilot");
        ArrayList<Person> pList = new ArrayList<>();
        pList.add(sham);
        pList.add(riz);
        pList.add(anu);
        pList.add(han);
        System.out.println("Before Sorting");
        Iterator<Person> personIterator = pList.iterator();
        while (personIterator.hasNext()){
            System.out.println(personIterator.next());
        }

        System.out.println();

        System.out.println("After Sorting");

        pList.sort(null);
        personIterator= pList.iterator();
        while (personIterator.hasNext()){
            System.out.println(personIterator.next());
        }
    }
}