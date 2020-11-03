package com.softserve.edu;

import java.util.Scanner;

public class Task1 {
	
	public static void main (String [] args) {
		Scanner scanner =new Scanner(System.in);
	int numbersPosition [] = new int [5];
int sum =0;
System.out.println("Eneter number : ");
for ( int i=0; i<5; i++)
{
numbersPosition[i]= scanner.nextInt();
}
for ( int num : numbersPosition) {
	sum = sum+sum;
}
	System.out.println("Sum of array ellemnts is : " + sum);
	}
	
}
