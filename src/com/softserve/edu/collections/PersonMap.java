package com.softserve.edu.collections;

import java.util.*;

public class PersonMap {
    public static void main(String[] args) {
    Map<String, String> personMap = new HashMap<>();
    personMap.put("Ivanova", "Ira");
    personMap.put("Kiselyk", "Orusya");
    personMap.put("Petrov", "Igor");
    personMap.put("Lisen", "Olena");
    personMap.put("Vovk", "Olena");
    System.out.println(personMap);
    //
    String valueToBeRemoved = "Igor";
    Iterator<Map.Entry<String, String> >
            iterator = personMap.entrySet().iterator();
    while (iterator.hasNext()) {
        Map.Entry<String, String>
                entry = iterator.next();
        if (valueToBeRemoved.equals(entry.getValue())){
            iterator.remove();
    }
    }
    System.out.println(personMap);
//
     Set set = new HashSet<>();
     List list = new  ArrayList<>();
        for (Map.Entry<String, String > mapVal : personMap.entrySet()) {
            if(!set.add(mapVal.getValue())){
                list.add(mapVal.getValue());
            } else {
                set.add(mapVal.getValue());
            }
        }
        for (Map.Entry<String, String> mapVal : personMap.entrySet()){
            if (list.contains(mapVal.getValue())){
                System.out.println("Persons with the same names:" + mapVal.getKey() + " " + mapVal.getValue());
            }
        }


        }
        }









