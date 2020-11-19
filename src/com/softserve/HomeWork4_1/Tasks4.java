package com.softserve.HomeWork4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.event.InternalFrameEvent;

public class Tasks4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//read 3 float numbers and check: are they all belong to the range [-5,5];
		float n1,n2,n3;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("float n1 = ");
		n1 = Float.parseFloat(br.readLine());
		
		
		System.out.print("float n2 = ");
		n2 = Float.parseFloat(br.readLine());
		
		System.out.print("float n3 = ");
		n3 = Float.parseFloat(br.readLine());
		
		if(n1 > -5 && n1 < 5 && n2 > -5 && n2 < 5 && n3 > -5 && n3 < 5) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println((n1 > -5 && n1 < 5 && n2 > -5 && n2 < 5 && n3 > -5 && n3 < 5)? "true" : "false");
		

		//read 3 integer numbers and write max and min of them;
		
		System.out.print("int n1 = ");
		int in1 = Integer.parseInt(br.readLine());
		
		System.out.print("int n2 = ");
		int in2 = Integer.parseInt(br.readLine());
		
		System.out.print("int n3 = ");
		int in3 = Integer.parseInt(br.readLine());
		
		System.out.println("the max int of them = "+Math.max(in1, Math.max(in2,in3)));
		int max = in1;
		max = Math.max(max, in2);
		max = Math.max(max, in3);
		
		if(in1 > in2 && n1 > in3) {
			System.out.println("max in1");
		}else if(in2 > in1 && n2 > in3){
			System.out.println("max in2");
		}else if(in3 > in1 && n3 > in2){
			System.out.println("max in3");
		}else {
			System.out.println("no max");
		}

		System.out.print("enter error = ");
		int error = Integer.parseInt(br.readLine());
		
		switch (error) {
		case 400:
			System.out.println("Error 400");
			break;
		case 401:
			System.out.println("Error 401");
			break;
		case 402:
			System.out.println("Error 402");
			break;
		default:
			System.out.println("Unknow Error");
		};


	}

}
