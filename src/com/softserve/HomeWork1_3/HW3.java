package com.softserve.HomeWork1_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HW3 {
	public float c,t,count;
	public String name;
	public HW3(String n) {
		name = n;	
	}

	public void get_t() throws ParseException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat data_type= new SimpleDateFormat("HH:mm:ss");
		
		System.out.print("The "+name+" talks start from  ");
		Date t1F = data_type.parse(br.readLine());
		System.out.print(" to ");
		
		Date t1T = data_type.parse(br.readLine());
		t = (float)TimeUnit.MILLISECONDS.toSeconds(t1T.getTime()-t1F.getTime())/60; 
		count = c*t;
	}
	public static void main(String[] args) throws ParseException, IOException {
		HW3 call1 = new HW3("first");
		HW3 call2 = new HW3("second");
		HW3 call3 = new HW3("third");	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the units per minute:");
		System.out.print("c1 = ");
		call1.c = Float.parseFloat(br.readLine());
		System.out.print("c2 = ");
		call2.c = Float.parseFloat(br.readLine());
		System.out.print("c3 = ");
		call3.c = Float.parseFloat(br.readLine());
		
		call1.get_t();
		call2.get_t();
		call3.get_t();
		
		
		System.out.println("calculations for the first call = "+call1.count);
		System.out.println("calculations for the second call = "+call2.count);
		System.out.println("calculations for the third call = "+call3.count);
		System.out.println("together = "+(call1.count+call2.count+call3.count));
		
			
		

	}

}
