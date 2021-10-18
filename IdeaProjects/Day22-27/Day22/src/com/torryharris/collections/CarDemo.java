package com.torryharris.collections;

import com.torryharris.comparator.CarPowerComparator;
import com.torryharris.model.Car;

import java.util.*;

public class CarDemo {
    public static void main(String[] args) {
        Car swift = new Car(23, "Swift", "Petrol", 3.6f);
        Car santro = new Car(24, "Santro", "Petrol", 5.6f);
        Car maruthi = new Car(25, "Maruthi", "Petrol", 2.4f);
        Car omni = new Car(26, "Omni", "Diesel", 7.6f);
        Car c1 = new Car(27, "Swift", "Petrol", 8.6f);
        ArrayList<Car> cList= new ArrayList<>();
        cList.add(swift);
        cList.add(santro);
        cList.add(maruthi);
        cList.add(omni);
        cList.add(c1);
        for(Car cars : cList)
            System.out.println(cars);
        System.out.println();
        System.out.println("Sort by Power");
        TreeSet<Car> c1List = new TreeSet<>( new CarPowerComparator());
        c1List.add(swift);
        c1List.add(santro);
        c1List.add(maruthi);
        c1List.add(omni);
        c1List.add(c1);
        for(Car cars :c1List){
            System.out.println(cars);}
        System.out.println();
        System.out.println("For displaying details with unique name");
        HashMap<String,Car> carHashMap=new HashMap<>();


        carHashMap.put(swift.getCarName(), swift);
        carHashMap.put(c1.getCarName(), c1);
        carHashMap.put(santro.getCarName(), santro);
        carHashMap.put(maruthi.getCarName(), maruthi);
        carHashMap.put(omni.getCarName(), omni);
        for(String name : carHashMap.keySet())
            System.out.println(name + "=" +carHashMap.get(name));


    }
}
