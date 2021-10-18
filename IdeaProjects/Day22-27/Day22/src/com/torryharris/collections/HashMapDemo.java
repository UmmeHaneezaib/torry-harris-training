package com.torryharris.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> phashmap = new HashMap<>();
        phashmap.put(1002,"Han");
        phashmap.put(1001,"Anu");
        phashmap.put(1004,"Riz");
        phashmap.put(1003,"Zaib");
//        Iterator<String> stringIterator = phashmap.values().iterator();
//        while (stringIterator.hasNext())
//            System.out.println(stringIterator.next());
        for (int i:phashmap.keySet())
            System.out.println(+i+" : "+phashmap.get(i));

    }
}
