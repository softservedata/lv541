package com.softserve.edu08a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AppMap {
    public static void main(String[] args) {
        Map<Object, String> map = new HashMap<>();
        // Map<Object, String> map = new TreeMap<>(new MyComp());
        map.put("key1", "one");
        map.put(new Object(), "two");
        map.put(1, "3");
        map.put(new Object(), "three");
        map.put(null, "my_null");
        //System.out.println("map = " + map);
        //
        System.out.println("First");
        for (Map.Entry<Object, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() 
                + " value = " + entry.getValue());
        }
        map.remove(1);
        System.out.println("Second");
        for (Iterator<Map.Entry<Object, String>> i = map.entrySet().iterator(); i.hasNext();) {
            Map.Entry<Object, String> entry = i.next();
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }
        //
    }
}
