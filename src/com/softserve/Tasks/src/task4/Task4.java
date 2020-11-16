package task4;

import java.util.Scanner;

public class Task4 {
	public static void tasks() {
		 Task_4_1();
		 Task_4_2();
		 Task_4_3();
		 Task_4_4();
		 Task_4_5();
	}
	
	private static void Task_4_1() {
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.print("Enter a month number: ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		System.out.println("The number of days: " + monthDays[month - 1]);
	}
	
	private static void Task_4_2() {
		int[] numbers = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int product = 1;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Enter an integer #" + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
			
			if (numbers[i] > 0 && i < 5) {
				sum += numbers[i];
			}
			
			if (i >= 5) {
				product *= numbers[i];
			}
		}
		
		System.out.println("Sum: " + sum + ". Product: " + product);
	}
	
	private static void Task_4_3() {
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		int firstPositiveNumberPosition = -1;
		int secondPositiveNumberPosition = -1;
		int min = 0;
		int minPosition = 0;
		boolean firstNumber = true;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Enter an integer #" + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
			
			if(numbers[i] > 0) {
				if(firstPositiveNumberPosition == -1) {
					firstPositiveNumberPosition = i;
				} else if(secondPositiveNumberPosition == -1) {
					secondPositiveNumberPosition = i;
				}
			}
			
			if(firstNumber) {
				min = numbers[i];
				firstNumber = false;
			} else {
				if(numbers[i] < min) {
					min = numbers[i];
					minPosition = i;
				}
			}
		}
		
		System.out.println("Second Positive Number Position: " + secondPositiveNumberPosition
				+ ". Min: " + min + ". Min position: " + minPosition);
	}
	
	private static void Task_4_4() {
		Scanner scanner = new Scanner(System.in);
		int count = 0,
			n = 0,
			product = 1;
		
		do {
			System.out.print("Enter an integer #" + (count++ + 1) + ": ");
			n = scanner.nextInt();
			
			if(n >= 0) {
				if(n % 2 == 0) {
					product *= n;
				}
			}
		} while (n >= 0);
		
		System.out.println("Product: " + product);
	}
	
	private static void Task_4_5() {
		Car[] cars = new Car[4];
		cars[0] = new Car("Acura", 2020, 3.5);
		cars[1] = new Car("Acura", 2021, 3.5);
		cars[2] = new Car("Honda", 2020, 3.0);
		cars[3] = new Car("Mercedes", 2020, 2.0);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a model year: ");
		int year = scanner.nextInt();
		
		for(int i = 0; i < cars.length; i++) {
			if(cars[i].year == year) {
				System.out.println(cars[i].print());
			}
		}
	}
 }
