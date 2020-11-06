package com.softserve.edu;


import com.softserve.edu.Car;
import java.util.*;

public class Vehicle {
		    private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {


		        Car car = new Car("Porshe", 2000, 2.4);
		        Car car2 = new Car("Porshe", 2002, 2.5);
		        Car car3 = new Car("Porshe", 1999, 2.5);
		        Car car4 = new Car("Porshe", 1800, 2.5);
		        Car car5 = new Car("Porshe", 2020, 2.5);
		        Car car6 = new Car("Porshe", 2015, 2.5);
		        List<Car> carList = new ArrayList<>();
		        carList.add(car);
		        carList.add(car2);
		        carList.add(car3);
		        carList.add(car4);
		        carList.add(car5);
		        carList.add(car6);


		        searchCarByYearOfProduction(carList);

		        carList.sort(Comparator.comparing(Car::getYearOfProduction).reversed());
		        carList.forEach(System.out::println);


		    }


		    private static void searchCarByYearOfProduction(List<Car> carList) {
		        int year = scanner.nextInt();
		        for (Car iterator : carList) {
		            if (iterator.getYearOfProduction() == year) {
		                System.out.println("Car: " + iterator);
		            }
		        }
		    }
		}
    



