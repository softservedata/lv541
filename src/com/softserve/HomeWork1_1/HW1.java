package com.softserve.HomeWork1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the radius of the flower bed  = ");
		float radius = Float.parseFloat(br.readLine());
		br.close();
		System.out.println("The perimeter = "+(2*radius*Math.PI));
		System.out.println("The area = "+(Math.PI*Math.pow(radius, 2)));	

	}

}
