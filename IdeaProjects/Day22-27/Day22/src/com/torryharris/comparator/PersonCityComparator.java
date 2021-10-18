package com.torryharris.comparator;

import com.torryharris.model.Person;

import java.util.Comparator;

public class PersonCityComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getCity().compareTo(p2.getCity());
    }
}
