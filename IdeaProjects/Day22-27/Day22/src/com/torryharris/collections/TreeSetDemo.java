package com.torryharris.collections;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(23);
        integerTreeSet.add(45);
        integerTreeSet.add(67);
        integerTreeSet.add(56);
        integerTreeSet.add(7);
        System.out.println(integerTreeSet);
        TreeSet<Float> fTreeSet = new TreeSet<>();
        fTreeSet.add(2.3f);
        fTreeSet.add(8.3f);
        fTreeSet.add(9.0f);
        fTreeSet.add(1.5f);
        fTreeSet.remove(2.3f);
        System.out.println(fTreeSet);
        TreeSet<String> sTreeSet = new TreeSet<>(Collections.reverseOrder());
        sTreeSet.add("zef");
        sTreeSet.add("abs");
        sTreeSet.add("man");
        sTreeSet.add("han");

        System.out.println(sTreeSet);
    }}
