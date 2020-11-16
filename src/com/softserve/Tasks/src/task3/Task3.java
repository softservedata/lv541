package task3;

import java.util.Scanner;

public class Task3 {

	public static void tasks() {
		 Task_3_1();
		 Task_3_2();
		 Task_3_3();
		 Task_3_4();
	}
	
	private static void Task_3_1() {
		System.out.print("Enter 3 float numbers: ");
		Scanner scanner = new Scanner(System.in);
		Float a = scanner.nextFloat();
		Float b = scanner.nextFloat();
		Float c = scanner.nextFloat();
		System.out.println("The entered numbers "
				+ (a < -5.0 || a > 5.0 || b < -5.0 || b > 5.0 || c < -5.0 || c > 5.0 ? "don't " : "")
				+ "belong to the range [-5 5].");
	}
	
	private static void Task_3_2() {
		System.out.print("Enter 3 integer numbers: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int max = a;
		int min = a;
		int b = scanner.nextInt();
		max = max > b ? max : b;
		min = min < b ? min : b;
		int c = scanner.nextInt();
		max = max > c ? max : c;
		min = min < c ? min : c;
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
	
	private static void Task_3_3() {
		System.out.print("Enter HTTP error number: ");
		Scanner scanner = new Scanner(System.in);
		int errorCode = scanner.nextInt();
		String errorMessage = "Unknown error code";
		
		switch(errorCode) {
		case 400: errorMessage = "Bad request"; break;
		case 401: errorMessage = "Unauthorized"; break;
		case 402: errorMessage = "Payment required"; break;
		case 403: errorMessage = "Forbidden"; break;
		case 404: errorMessage = "Not found"; break;
		case 405: errorMessage = "Method not allowed"; break;
		case 406: errorMessage = "Not acceptable"; break;
		case 407: errorMessage = "Proxy authentication required"; break;
		case 408: errorMessage = "Request timeout"; break;
		case 409: errorMessage = "Conflict"; break;
		case 410: errorMessage = "Gone"; break;
		}
		
		System.out.println(errorMessage);
	}
	
	private static void Task_3_4() {
		Dog dog1 = new Dog("Ivan", Breed.Black, 3);
		Dog dog2 = new Dog("Petro", Breed.Brown, 6);
		Dog dog3 = new Dog("Indyk", Breed.White, 1);
		
		if(dog1.name != dog2.name && dog2.name != dog3.name && dog1.name != dog3.name) {
			System.out.println("Names are different");
		}
		else {
			System.out.println("Names are equal");
		}
		
		if(dog1.age > dog2.age && dog1.age > dog3.age) {
			System.out.println(dog1.name);
		}
		else if(dog2.age > dog1.age && dog2.age > dog3.age) {
			System.out.println(dog2.name);
		}
		else {
			System.out.println(dog3.name);
		}
		
	}
}