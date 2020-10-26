package com.softserve.HomeWork1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2 {

	public static void main(String[] args) throws IOException {
		String name,address;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		name = br.readLine();
		System.out.println("Where are you live, "+name+"?");
		address = br.readLine();
		br.close();
		System.out.println("Your name is "+name+" and your adress is "+address);

	}

}
