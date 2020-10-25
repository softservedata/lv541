package com.softserve.task1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how are you?");
		String answer = br.readLine();
		br.close();
		System.out.println("You are "+answer);

	}

}
