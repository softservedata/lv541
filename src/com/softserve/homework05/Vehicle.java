package com.softserve.homework05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Vehicle {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        Car obj1 = new Car(2020, "BMW", 250);
        Car obj2 = new Car(1992, "Porshe", 300);
        Car obj3 = new Car(2015, "Renault", 150);
        Car obj4 = new Car(2018, "Volvo", 200);

        cars.add(obj1);
        cars.add(obj2);
        cars.add(obj3);
        cars.add(obj4);
        System.out.println("Original cars = " + cars);
        
        Collections.sort(cars);
        System.out.println("Sorted cars = " + cars);
//        Iterator<Car> i = cars.iterator();
//        while (i.hasNext()) {
//            Car o1 = (Car) i.next();
//            System.out.println("Year of a  Car is = " + o1.getYearModel());
//        }
    }
    /*
     * System.out.println(cars); System.out.println(cars.size()); for (int i1=0;
     * i1<cars.size(); i1++); System.out.println(cars.get(2));
     */
}