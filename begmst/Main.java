package begmst;

import java.util.*;

public class Main {
	
	private int i = 12;

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println("Hello World!");
		System.out.print("Enter your name: ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.print("Enter your age: ");
		Integer age = s.nextInt();
		String output = String.format("Hello, %s. You're %d years old.", name, age);
		System.out.println(output);
	}

}
