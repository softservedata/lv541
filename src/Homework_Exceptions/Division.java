package Homework_Exceptions;

import java.math.*;
import java.util.Scanner;


public class Division {

	public static void main(String[] args) {
		Division.Task1();
	}
		public static double div (double a, double b) {
		return a /b; 	
	}
		public static void Task1() {
			
			Scanner sc = new Scanner (System.in);
			double a;
			double b; 
			while(true) {
				try {
					System.out.print("Enter number");
					a = Double.parseDouble(sc.nextLine());
					
					System.out.print("Enter number");
					b = Double.parseDouble(sc.nextLine());
					
					double res = Division.div(a, b);
					System.out.println (res);
					break;
				}catch (ArithmeticException e) {
					System.out.println ("Arithmetic exception");
				}catch (NumberFormatException e) {
					System.out.println("NumberFormatException ");
				} catch (IndexOutOfBoundsException e) {
					System.out.println("IndexOutOfBoundsException ");
			}
		}
}
}



