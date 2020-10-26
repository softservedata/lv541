package com.softserve.task1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		int a,b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//enter a
		System.out.print("enter a = ");
		a = Integer.parseInt(br.readLine());
		//enter b
		System.out.print("enter b = ");
		b = Integer.parseInt(br.readLine());
		br.close();
		//calculate:
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		

	}

}
