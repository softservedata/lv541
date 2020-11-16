package task1;

import java.util.Scanner;

public class Task1 {
	public static void tasks() {
		Task_1();
	}
	
    public static void Task_1() {
    	System.out.println("Enter two integers: ");
    	Scanner scanner = new Scanner(System.in);
    	int a = scanner.nextInt();
    	int b = scanner.nextInt();
    	System.out.println(a + b);
    	System.out.println(a - b);
    	System.out.println(a * b);
    	System.out.println(a / b);
    	
    	System.out.print("How are you?");
    	String answer = scanner.nextLine();
    	System.out.println("You are " + answer);
    }
}
