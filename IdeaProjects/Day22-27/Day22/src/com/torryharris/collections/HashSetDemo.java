package com.torryharris.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("efgh");
        stringHashSet.add("wfgh");
        stringHashSet.add("qfgh");
        stringHashSet.add("efih");
        System.out.println(stringHashSet);
        HashSet<Integer> iHashSet = new HashSet<>();
        iHashSet.add(20);
        iHashSet.add(19);
        iHashSet.add(14);
        iHashSet.add(18);
        iHashSet.add(null);
        System.out.println(iHashSet.contains(null));
        System.out.println(iHashSet);
        HashSet<Float> fHashSet = new HashSet<>();
        fHashSet.add(2.786f);
        fHashSet.add(8.6f);
        fHashSet.add(7.86f);
        fHashSet.add(2.86f);
        System.out.println(fHashSet);
        fHashSet.remove(2.786f);
        System.out.println(fHashSet);



    }
}
