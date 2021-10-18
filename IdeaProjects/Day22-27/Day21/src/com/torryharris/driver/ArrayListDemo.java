package com.torryharris.driver;

import com.torryharris.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Float> floatArrayList = new ArrayList<>();
        ArrayList<String> sArrayList = new ArrayList<>();
        Employee e1 = new Employee(2,"Tas","Chef",50000);
        Employee e2 = new Employee(3,"Sam","Artist",30000);
        Employee e3 = new Employee(4,"Sum","CSA",60000);
        ArrayList<Employee> eList =new ArrayList<>();
        arrayList.add(1000);
        arrayList.add(1000000);
        arrayList.add(1);
        arrayList.add(5);
        floatArrayList.add(2.3f);
        floatArrayList.add(3.3f);
        floatArrayList.add(4.3f);
        sArrayList.add("Han");
        sArrayList.add(" ");
        sArrayList.add("Anu");
        sArrayList.add("Saima");
        eList.add(e1);
        eList.add(e2);
        eList.add(e3);

        System.out.println(arrayList);
        System.out.println(floatArrayList);
        System.out.println(sArrayList);
        System.out.println(eList);
        eList.remove(1);
//        sArrayList.remove(1);
        floatArrayList.remove(1);
//        arrayList.remove(1);
        System.out.println("---After Deletion of few------");
//        System.out.println(arrayList);
        System.out.println(floatArrayList);
//        System.out.println(sArrayList);
        System.out.println(eList);
       arrayList.sort(null);
        System.out.println("After Sorting" +arrayList);
        Collections.sort(sArrayList);
        System.out.println("After Sorting" +sArrayList);
//        for (int i =0;i<eList.size();i++)
        for(Employee i :eList)
            System.out.println(i);
        ArrayList<Object> oList = new ArrayList<>();
        oList.add(10);
        oList.add(3.6f);
        oList.add("Zainu");
        oList.add(e1);
        for(Object oj:oList)
            System.out.println(oj);
        System.out.println("***Using Iterator***");
        Iterator<String> stringIterator = sArrayList.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        System.out.println("***Done***");

    }
}
