package com.softserve.task6;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("First part");
        List<Integer> myCollection = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt());
        }
        List<Integer> newCollection = new ArrayList();
        int count = 0;
        for (Integer number: myCollection) {
            if (number > 5) {
                newCollection.add(count);
            }
            count++;
        }
        for (Integer number : newCollection) {
            System.out.println(number);
        }
        System.out.println("------------------------- \nThird part");
        myCollection.add(2, 1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);
        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            System.out.println(a + " " + a);
        }
        System.out.println("------------------------- \nSecond part");
        iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 20) {
                iterator.remove();
            }
        }
        for (Integer number: myCollection) {
            System.out.println(number);
        }
        System.out.println("------------------------- \nFourth part");
        myCollection.sort(Integer::compareTo);
        iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            System.out.println(a + " " + a);
        }
    }
}
