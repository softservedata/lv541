package com.softserve.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Application2 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new LinkedHashMap<>();
        System.out.println("First part");
        employeeMap.put(1, "Ivan");
        employeeMap.put(2, "Ira");
        employeeMap.put(3, "Andrii");
        employeeMap.put(4, "Yana");
        employeeMap.put(5, "Vitalii");
        employeeMap.put(6, "Hrystyna");
        employeeMap.put(7, "Vasyl");
        System.out.println(employeeMap);
        System.out.println("------------------------- \nSecond part");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true) {
            try {
                System.out.println("Please input key :");
                a = Integer.valueOf(br.readLine());
                if (employeeMap.containsKey(a)) {
                    break;
                }
                System.out.println("Wrong key");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(employeeMap.get(a));
        System.out.println("------------------------- \nThird part");
        String name = " ";
        while (true) {
            try {
                System.out.println("Please input name :");
                name = br.readLine();
                if (employeeMap.containsValue(name)) {
                    break;
                }
                System.out.println("Wrong name");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Iterator i = employeeMap.entrySet().iterator(); i.hasNext();){
            Map.Entry entry = (Map.Entry) i.next();
            if (entry.getValue().equals(name)) {
                System.out.println("Key = " + entry.getKey());
            }
        }

    }
}
