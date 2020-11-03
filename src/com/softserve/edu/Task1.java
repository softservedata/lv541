package com.softserve.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	public static void main (String [] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("number elements");
		int n =scanner.nextInt();
		int arr[] = new int [n];
	      System.out.println("Enter the elements of the array one by one ");

	      for(int i=0; i<n; i++)
	      {
	         arr[i] = scanner.nextInt();
	      }
	      for (int i:arr) {
	      System.out.println(i);
	   }
	int sum =0;
	for (int i=0; i< arr.length; i++) {sum +=arr[i];}
	System.out.println("Sum = " + sum);
	int product = 1;
	for (int i=0;i<5; i++) {
		if (arr[i]>0) {product = product * arr[i];}}
	System.out.println("Product = " + product);
	}
	}
	     


