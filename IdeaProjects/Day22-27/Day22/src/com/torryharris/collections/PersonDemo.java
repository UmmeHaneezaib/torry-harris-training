package com.torryharris.collections;

import com.torryharris.comparator.PersonCityComparator;
import com.torryharris.comparator.PersonNameComparator;
import com.torryharris.model.Person;

import java.util.TreeSet;

public class PersonDemo  {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Han", "Ase", "Bengaluru");
        Person p2 = new Person(4, "Riz", "Fcc", "Chennai");
        Person p3 = new Person(2, "Anu", "Acc", "Goa");
        Person p4 = new Person(3, "Abs", "Ase", "Manali");
        TreeSet<Person> personTreeset = new TreeSet<>();
        personTreeset.add(p1);
        personTreeset.add(p2);
        personTreeset.add(p3);
        personTreeset.add(p4);
        for(Person persons:personTreeset)

        System.out.println(persons);
        System.out.println();
        System.out.println("Sort by Name");
        TreeSet<Person> pTree = new TreeSet<>(new PersonNameComparator());
        pTree.add(p1);
        pTree.add(p2);
        pTree.add(p3);
        pTree.add(p4);
        for(Person person0:pTree)

            System.out.println(person0);
        System.out.println();
        System.out.println("Sort by City");
        TreeSet<Person> p1Tree = new TreeSet<>(new PersonCityComparator());
        p1Tree.add(p1);
        p1Tree.add(p2);
        p1Tree.add(p3);
        p1Tree.remove(p4);

        for(Person person1:p1Tree)

            System.out.println(person1);

    }


}
